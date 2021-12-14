package gr0102.projectecommercewaa.service;

import gr0102.projectecommercewaa.domain.User;
import gr0102.projectecommercewaa.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    public List<User> getAllUser();
    public void addUser(User u);
    public User getUser(long id);
    public void updateUser(User u);
    public void deleteUser(long id);

}
