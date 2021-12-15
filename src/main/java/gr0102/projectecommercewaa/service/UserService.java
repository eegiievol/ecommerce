package gr0102.projectecommercewaa.service;

import gr0102.projectecommercewaa.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public List<User> getAllUser();
    public void addUser(User u);
    public User getUser(long id);
    public void updateUser(User u);
    public void deleteUser(long id);
    public void approve(long id);
    public boolean ifUserApproved(String username);

}
