package gr0102.projectecommercewaa.service;

import gr0102.projectecommercewaa.domain.*;

import java.util.List;

public interface AdminService {

    void approveRegistration(long userId);

    void approveReview(long reviewId);

    List<Admin> getAll();
    void addAdmin(Admin a);
    Admin getAdmin(long id);
    void updateAdmin(Admin a);
    void deleteAdmin(long id);


}
