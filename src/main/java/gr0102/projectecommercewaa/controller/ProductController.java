package gr0102.projectecommercewaa.controller;

import gr0102.projectecommercewaa.domain.Product;
import gr0102.projectecommercewaa.domain.User;
import gr0102.projectecommercewaa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/getAll")
    public List<Product> getAll() { return productService.getAll(); }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Integer id, @RequestBody Product product) { return productService.updateById(id, product); }

    @DeleteMapping("/{id}")
    public boolean deleteProduct(@PathVariable Integer id) { return productService.deleteById(id); }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Integer id) { return productService.findById(id); }

    @PostMapping
    public Product saveProduct(@RequestBody Product product, @RequestBody User user) { return productService.save(product, user); }
}