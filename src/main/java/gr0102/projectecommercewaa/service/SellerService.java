package gr0102.projectecommercewaa.service;

import gr0102.projectecommercewaa.domain.Product;
import gr0102.projectecommercewaa.domain.Seller;
import gr0102.projectecommercewaa.domain.User;

import java.util.List;

public interface SellerService {


    //ProductRepo CRUD
    public void addProduct(Product p, User user);
    public Product getProduct(long id);
    public void updateProduct(long id, Product p);
    public void deleteProduct(long id);
    public List<Product> getAll();

    //TODO: Order status change
    //changeOrderStatus
}
