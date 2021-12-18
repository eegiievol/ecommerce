package gr0102.projectecommercewaa.service;

import gr0102.projectecommercewaa.domain.*;
import gr0102.projectecommercewaa.dto.ProductDto;
import gr0102.projectecommercewaa.repo.OrderRepo;
import gr0102.projectecommercewaa.repo.ProductRepo;
import lombok.var;
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
        var Data = productRepo.findAll();

        for(Product p: Data) {
            if(p.getProductStatus() != ProductStatus.deactivated)
                products.add(p);
        }

        return products;
    }

    @Override
    public List<Product> getById(long id) {
        List<Product> products = new ArrayList<>();
        var Data = productRepo.findAll();

        for(Product p: Data) {
            if(p.getProductStatus() != ProductStatus.deactivated && p.getUser().getId() == id)
                products.add(p);
        }

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
    public Product save(Product product) {
        product.setAddedDate(LocalDateTime.now());
        product.setProductStatus(ProductStatus.active);
        //product.setUser(user);

        return productRepo.save(product);
    }

    @Override
    public boolean deleteById(Integer id) {
        if(orderRepo.findOrdersByProductsId(id) < 1 && productRepo.findById(id).isPresent()) {
                //productRepo.deleteById(id);
                Product updatingProduct = productRepo.findById(id).get();

                if(updatingProduct.getProductStatus() == ProductStatus.active) {
                    updatingProduct.setProductStatus(ProductStatus.deactivated);
                    productRepo.save(updatingProduct);
                    return true;
                }
                else
                    return false;
        }
        else
            return false;
    }

    @Override
    public Product updateById(Integer id, Product product) {
        if(productRepo.findById(id).isPresent()) {
            Product updatingProduct = productRepo.findById(id).get();
            if(product.getName() != null) updatingProduct.setName(product.getName());
            if(product.getProductStatus() != null) updatingProduct.setProductStatus(product.getProductStatus());
            if(product.getProductCategory() != null) updatingProduct.setProductCategory(product.getProductCategory());
            if(product.getPrice() > 0) updatingProduct.setPrice(product.getPrice());
            productRepo.save(updatingProduct);

            return product;
        }
        else
            return null;
    }

    @Override
    public List<ProductCategory> getAllCategory() {
        List<ProductCategory> categories = new ArrayList<>();

        for(ProductCategory c: ProductCategory.values()) {
            categories.add(c);
        }

        return categories;
    }
}
