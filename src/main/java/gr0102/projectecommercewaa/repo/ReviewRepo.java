package gr0102.projectecommercewaa.repo;

import gr0102.projectecommercewaa.domain.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends CrudRepository<Review, Integer> {

}
