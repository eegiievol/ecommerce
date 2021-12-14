package gr0102.projectecommercewaa.controller;

import gr0102.projectecommercewaa.domain.Admin;
import gr0102.projectecommercewaa.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping
    public List<Admin> getAll(){
        return adminService.getAll();
    }

    @PostMapping
    public void addAdmin(@RequestBody Admin a){
        adminService.addAdmin(a);
    }

    @GetMapping("/{id}")
    public Admin getAdmin(@PathVariable long id){
        return adminService.getAdmin(id);
    }

    @PutMapping
    public void updateAdmin(@RequestBody Admin a){
        adminService.updateAdmin(a);
    }

    @DeleteMapping("/{id}")
    public void deleteAdmin(@PathVariable long id){
        adminService.deleteAdmin(id);
    }


}
