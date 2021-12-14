package gr0102.projectecommercewaa.service;

import gr0102.projectecommercewaa.domain.Product;
import gr0102.projectecommercewaa.domain.Review;
import gr0102.projectecommercewaa.repo.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepo reviewRepo;

    @Override
    public List<Review> getAll() {
        List<Review> reviews = new ArrayList<>();
        reviewRepo.findAll().forEach(reviews::add);
        return reviews;
    }

    @Override
    public Review findById(Integer id) {
        if(reviewRepo.findById(id).isPresent())
            return reviewRepo.findById(id).get();
        else
            return null;
    }

    @Override
    public Review save(Review review) {
        return reviewRepo.save(review);
    }

    @Override
    public boolean deleteById(Integer id) {
        if(reviewRepo.findById(id).isPresent()) {
            reviewRepo.deleteById(id);
            return true;
        }
        else
            return false;
    }

    @Override
    public Review updateById(Integer id, Review review) {

        if(reviewRepo.findById(id).isPresent()) {
            Review updatingReview = reviewRepo.findById(id).get();
            updatingReview.setComment(review.getComment());
            updatingReview.setRate(review.getRate());
            updatingReview.setStatus(review.getStatus());
            updatingReview.setProduct(review.getProduct());
            reviewRepo.save(updatingReview);

            return review;
        }
        else
            return null;
    }
}
