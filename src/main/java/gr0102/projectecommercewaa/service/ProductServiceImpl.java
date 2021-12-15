package gr0102.projectecommercewaa.service;

import gr0102.projectecommercewaa.domain.Orders;
import gr0102.projectecommercewaa.domain.Product;
import gr0102.projectecommercewaa.domain.ProductStatus;
import gr0102.projectecommercewaa.domain.User;
import gr0102.projectecommercewaa.dto.ProductDto;
import gr0102.projectecommercewaa.repo.OrderRepo;
import gr0102.projectecommercewaa.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private OrderRepo orderRepo;

    @Override
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        productRepo.findAll().forEach(products::add);
        return products;
    }

    @Override
    public Product findById(Integer id) {
        if(productRepo.findById(id).isPresent())
            return productRepo.findById(id).get();
        else
            return null;
    }

    @Override
    public Product save(Product product, User user) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        product.setAddedDate(currentDateTime);
        product.setProductStatus(ProductStatus.active);
        product.setUser(user);

        return productRepo.save(product);
    }

    @Override
    public boolean deleteById(Integer id) {
        if(orderRepo.findOrdersByProductsId(id) < 1 && productRepo.findById(id).isPresent()) {
                //productRepo.deleteById(id);
                Product updatingProduct = productRepo.findById(id).get();
                updatingProduct.setProductStatus(ProductStatus.deactivated);
                productRepo.save(updatingProduct);
                return true;
        }
        else
            return false;
    }

    @Override
    public Product updateById(Integer id, Product product) {
        if(productRepo.findById(id).isPresent()) {
            Product updatingProduct = productRepo.findById(id).get();
            updatingProduct.setName(product.getName());
            updatingProduct.setProductStatus(product.getProductStatus());
            updatingProduct.setProductCategory(product.getProductCategory());
            updatingProduct.setPrice(product.getPrice());
            productRepo.save(updatingProduct);

            return product;
        }
        else
            return null;
    }
}
