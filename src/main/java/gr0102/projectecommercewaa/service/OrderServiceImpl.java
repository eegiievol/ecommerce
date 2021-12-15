package gr0102.projectecommercewaa.service;

import gr0102.projectecommercewaa.domain.Orders;
import gr0102.projectecommercewaa.domain.OrdersStatus;
import gr0102.projectecommercewaa.domain.Product;
import gr0102.projectecommercewaa.repo.OrderRepo;
import gr0102.projectecommercewaa.repo.ProductRepo;
import lombok.var;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private ProductRepo productRepo;

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
    public Orders save(Orders order) {
        LocalDateTime currentDateTime = LocalDateTime.now();

        order.setOrdersStatus(OrdersStatus.Just_ordered);
        order.setOrderDate(currentDateTime);

        var Data = order.getProducts();
        Double totalP = 0.0;

        for(Product p: Data) {
            if(productRepo.findById(p.getId()).isPresent()) {
                Product tmpProduct = productRepo.findById(p.getId()).get();
                totalP += tmpProduct.getPrice();
            }
        }

        order.setTotalPrice(totalP);

        return orderRepo.save(order);
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

    @Override
    public boolean changeStatus(Integer id, OrdersStatus status) {
        if(orderRepo.findById(id).isPresent()){
            Orders updatingOrder = orderRepo.findById(id).get();
            updatingOrder.setOrdersStatus(status);

            if(status == OrdersStatus.Delivered)
                updatingOrder.setDeliveredDate(LocalDateTime.now());
            else if(status == OrdersStatus.Shipped)
                updatingOrder.setShippedDate(LocalDateTime.now());
            else if(status == OrdersStatus.Cancelled)
                updatingOrder.setCancelledDate(LocalDateTime.now());

            System.out.println("aaaaaaa: "+ updatingOrder.getOrdersStatus());
            orderRepo.save(updatingOrder);
            return true;
        }
        else
            return false;
    }
}
