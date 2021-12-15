package gr0102.projectecommercewaa.controller;

import gr0102.projectecommercewaa.domain.Product;
import gr0102.projectecommercewaa.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    SellerService sellerService;

    @GetMapping
    public List<Product> getAll() { return sellerService.getAll(); }

    @PutMapping("/{id}")
    public void updateProduct(@PathVariable long id, @RequestBody Product product) {
        sellerService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Integer id) {
        sellerService.deleteProduct(id);
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Integer id) { return sellerService.getProduct(id); }

    @PostMapping
    public void saveProduct(@RequestBody Product product) {
        sellerService.addProduct(product);
    }

}
