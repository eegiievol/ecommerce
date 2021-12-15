package gr0102.projectecommercewaa.controller;
import gr0102.projectecommercewaa.domain.Admin;
import gr0102.projectecommercewaa.domain.User;
import gr0102.projectecommercewaa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getAll(){
        return userService.getAllUser();
    }

    @PostMapping
    public void addAdmin(@RequestBody Admin a){
        userService.addUser(a);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable long id){
        return userService.getUser(id);
    }

    @PutMapping
    public void updateUser(@RequestBody User u){
        userService.updateUser(u);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable long id){
        userService.deleteUser(id);
    }

    @GetMapping("/approve/{id}")
    public void approveUser(@PathVariable long id){
        userService.approve(id);
    }

}
