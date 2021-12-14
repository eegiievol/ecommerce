package gr0102.projectecommercewaa.service;

import gr0102.projectecommercewaa.domain.Orders;
import gr0102.projectecommercewaa.repo.OrderRepo;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Override
    public List<Orders> getAll() {
        List<Orders> orders = new ArrayList<>();
        orderRepo.findAll().forEach(orders::add);
        return orders;
    }

    @Override
    public Orders findById(Integer id) {
        if(orderRepo.findById(id).isPresent())
            return orderRepo.findById(id).get();
        else
            return null;
    }

    @Override
    public Orders save(Orders order) { return orderRepo.save(order); }

    @Override
    public boolean deleteById(Integer id) {
        if(orderRepo.findById(id).isPresent()) {
            orderRepo.deleteById(id);
            return true;
        }
        else
            return false;
    }

    @Override
    public Orders updateById(Integer id, Orders order) {
        if(orderRepo.findById(id).isPresent()) {
            Orders updatingOrder = orderRepo.findById(id).get();
            updatingOrder.setProducts(order.getProducts());
            updatingOrder.setTotalPrice(order.getTotalPrice());
            orderRepo.save(updatingOrder);

            return order;
        }
        else
            return null;
    }
}
