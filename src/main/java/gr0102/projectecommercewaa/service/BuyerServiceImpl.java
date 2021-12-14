package gr0102.projectecommercewaa.service;

import gr0102.projectecommercewaa.domain.Buyer;
import gr0102.projectecommercewaa.repository.BuyerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    BuyerRepo buyerRepo;

    @Override
    public void addBuyer(Buyer b) {

    }

    @Override
    public Buyer getBuyer(long id) {
        return null;
    }

    @Override
    public void updateBuyer(Buyer b) {

    }

    @Override
    public void deleteBuyer(long id) {

    }

    @Override
    public void follow(long sellerId) {

    }
}
