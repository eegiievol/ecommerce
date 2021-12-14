package gr0102.projectecommercewaa.service;

import gr0102.projectecommercewaa.domain.Buyer;

public interface BuyerService {

    void addBuyer(Buyer b);
    Buyer getBuyer(long id);
    void updateBuyer(Buyer b);
    void deleteBuyer(long id);

    //TODO: CRUD order
    //TODO: CRUD card
    //TODO: CRUD address

    void follow(long sellerId);

    //TODO: add Review

    //TODO: cancel Order

}
