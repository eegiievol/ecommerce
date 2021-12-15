package gr0102.projectecommercewaa.service;

import gr0102.projectecommercewaa.domain.Orders;
import gr0102.projectecommercewaa.domain.Product;
import gr0102.projectecommercewaa.domain.User;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    Product findById(Integer id);
    Product save(Product product);
    boolean deleteById(Integer id);
    Product updateById(Integer id, Product product);
}