package gr0102.projectecommercewaa.controller;

import gr0102.projectecommercewaa.domain.Orders;
import gr0102.projectecommercewaa.domain.Review;
import gr0102.projectecommercewaa.service.OrderService;
import gr0102.projectecommercewaa.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
@CrossOrigin
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @GetMapping("/getAll")
    public List<Review> getAll() { return reviewService.getAll(); }

    @PutMapping("/{id}")
    public Review updateProduct(@PathVariable Integer id, @RequestBody Review review) { return reviewService.updateById(id, review); }

    @DeleteMapping("/{id}")
    public boolean deleteProduct(@PathVariable Integer id) { return reviewService.deleteById(id); }

    @GetMapping("/{id}")
    public Review getById(@PathVariable Integer id) { return reviewService.findById(id); }

    @PostMapping
    public Review saveProduct(@RequestBody Review review) { return reviewService.save(review); }
}