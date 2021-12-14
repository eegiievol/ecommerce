package gr0102.projectecommercewaa.service;

import gr0102.projectecommercewaa.domain.Admin;
import gr0102.projectecommercewaa.repository.AdminRepo;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepo adminRepo;

    @Override
    public void approveRegistration(long userId) {

    }

    @Override
    public void approveReview(long reviewId) {

    }

    @Override
    public List<Admin> getAll() {
        List<Admin> admins = new ArrayList<>();

        var iterable = adminRepo.findAll();
        for(Admin a: iterable){
            admins.add(a);
        }
        return admins;
    }

    @Override
    public void addAdmin(Admin a) {
        adminRepo.save(a);
    }

    @Override
    public Admin getAdmin(long id) {
        return adminRepo.getAdminById(id);
    }

    @Override
    public void updateAdmin(Admin a) {
        adminRepo.save(a);
    }

    @Override
    public void deleteAdmin(long id) {
        adminRepo.deleteAdminById(id);
    }
}
