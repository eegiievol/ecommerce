package gr0102.projectecommercewaa.service;

import gr0102.projectecommercewaa.domain.Orders;

import java.util.List;

public interface OrderService {
    List<Orders> getAll();
    Orders findById(Integer id);
    Orders save(Orders order);
    boolean deleteById(Integer id);
    Orders updateById(Integer id, Orders order);
    boolean isThereOrderWithProductId(Integer product_id);
}