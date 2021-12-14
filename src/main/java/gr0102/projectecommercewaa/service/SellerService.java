package gr0102.projectecommercewaa.service;

import gr0102.projectecommercewaa.domain.Seller;
import gr0102.projectecommercewaa.repository.SellerRepo;
import org.springframework.beans.factory.annotation.Autowired;

public interface SellerService {

    void addSeller(Seller s);
    Seller getSeller(long id);
    void updateSeller(Seller s);
    void deleteSeller(long id);

    //TODO: ProductRepo CRUD
    //addProduct, getProduct, updateProduct, deleteProduct


    //TODO: Order status change
    //changeOrderStatus
}
