package gr0102.projectecommercewaa.service;

import gr0102.projectecommercewaa.domain.Seller;
import gr0102.projectecommercewaa.repository.SellerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    SellerRepo sellerRepo;

    @Override
    public void addSeller(Seller s) {

    }

    @Override
    public Seller getSeller(long id) {
        return null;
    }

    @Override
    public void updateSeller(Seller s) {

    }

    @Override
    public void deleteSeller(long id) {

    }
}
