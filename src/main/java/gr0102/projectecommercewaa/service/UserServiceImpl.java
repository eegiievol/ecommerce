package gr0102.projectecommercewaa.service;

import gr0102.projectecommercewaa.domain.User;
import gr0102.projectecommercewaa.repository.UserRepo;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> getAllUser() {
        List<User> users = new ArrayList<>();
        var iterable = userRepo.findAll();
        for(User u: iterable){
            users.add(u);
        }
        return users;
    }

    @Override
    public void addUser(User u) {
        userRepo.save(u);
    }

    @Override
    public User getUser(long id) {

        return userRepo.findUserById(id);
    }

    @Override
    public void updateUser(User u) {
        userRepo.save(u);
    }

    @Override
    public void deleteUser(long id) {
        User user;
        user = userRepo.findUserById(id);
        userRepo.delete(user);
    }
}
