package gr0102.projectecommercewaa.repo;

import gr0102.projectecommercewaa.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Integer> {

    public Product findById(long id);
}
