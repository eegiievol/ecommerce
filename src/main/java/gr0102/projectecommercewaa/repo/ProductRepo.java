package gr0102.projectecommercewaa.repo;

import gr0102.projectecommercewaa.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {

}
