package gr0102.projectecommercewaa.repo;

import gr0102.projectecommercewaa.domain.Orders;
import gr0102.projectecommercewaa.domain.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface OrderRepo extends CrudRepository<Orders, Integer> {
    @Query(value = "select count(op.orders_id) from ORDERS_PRODUCTS op where op.products_id = ?1", nativeQuery = true)
    public Integer findOrdersByProductsId(Integer prod_id);
}