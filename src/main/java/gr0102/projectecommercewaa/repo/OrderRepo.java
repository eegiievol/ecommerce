package gr0102.projectecommercewaa.repo;

import gr0102.projectecommercewaa.domain.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<Orders, Integer> {

}
