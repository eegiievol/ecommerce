package gr0102.projectecommercewaa.service;

import gr0102.projectecommercewaa.domain.Orders;
import gr0102.projectecommercewaa.domain.OrdersStatus;

import java.util.List;

public interface OrderService {
    List<Orders> getAll();
    Orders findById(Integer id);
    Orders save(Orders order);
    Orders updateById(Integer id, Orders order);
    boolean changeStatus(Integer id, Orders order);
}