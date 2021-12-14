package gr0102.projectecommercewaa.service;

import gr0102.projectecommercewaa.domain.Orders;
import gr0102.projectecommercewaa.domain.Product;
import gr0102.projectecommercewaa.domain.Review;

import java.util.List;

public interface ReviewService {
    List<Review> getAll();
    Review findById(Integer id);
    Review save(Review review);
    boolean deleteById(Integer id);
    Review updateById(Integer id, Review review);
}