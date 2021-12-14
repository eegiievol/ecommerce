package gr0102.projectecommercewaa.service;

import gr0102.projectecommercewaa.domain.Orders;
import gr0102.projectecommercewaa.domain.Product;
import gr0102.projectecommercewaa.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

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
    public Product save(Product product) {
        return productRepo.save(product);
    }

    @Override
    public boolean deleteById(Integer id) {
        if(productRepo.findById(id).isPresent()) {
            productRepo.deleteById(id);
            return true;
        }
        else
            return false;
    }

    @Override
    public Product updateById(Integer id, Product product) {
        if(productRepo.findById(id).isPresent()) {
            Product updatingProduct = productRepo.findById(id).get();
            updatingProduct.setProductStatus(product.getProductStatus());
            updatingProduct.setProductCategory(product.getProductCategory());
            updatingProduct.setPrice(product.getPrice());
            updatingProduct.setAddedDate(product.getAddedDate());
            productRepo.save(updatingProduct);

            return product;
        }
        else
            return null;
    }
}
