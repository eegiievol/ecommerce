package gr0102.projectecommercewaa.repo;

import gr0102.projectecommercewaa.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {

    public Product findById(long id);

}
