package gr0102.projectecommercewaa.service;

import gr0102.projectecommercewaa.domain.Orders;
import gr0102.projectecommercewaa.domain.OrdersStatus;
import gr0102.projectecommercewaa.domain.Product;
import gr0102.projectecommercewaa.repo.OrderRepo;
import gr0102.projectecommercewaa.repo.ProductRepo;
import lombok.var;
import org.aspectj.weaver.ast.Or;
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

            if(updatingOrder.getOrdersStatus() == OrdersStatus.Just_ordered) {
                updatingOrder.setProducts(order.getProducts());

                var Data = order.getProducts();
                Double totalP = 0.0;

                for (Product p : Data) {
                    if (productRepo.findById(p.getId()).isPresent()) {
                        Product tmpProduct = productRepo.findById(p.getId()).get();
                        totalP += tmpProduct.getPrice();
                    }
                }

                updatingOrder.setTotalPrice(totalP);
                orderRepo.save(updatingOrder);

                return order;
            }
            else
                return null;
        }
        else
            return null;
    }

    @Override
    public boolean changeStatus(Integer id, Orders order) {
        if(orderRepo.findById(id).isPresent()){
            Orders updatingOrder = orderRepo.findById(id).get();
            OrdersStatus status = order.getOrdersStatus();
            OrdersStatus currentStatus = updatingOrder.getOrdersStatus();

            if(currentStatus != status && currentStatus != OrdersStatus.Cancelled && currentStatus != OrdersStatus.Delivered) {

                if (status == OrdersStatus.Delivered)
                    updatingOrder.setDeliveredDate(LocalDateTime.now());
                else if (status == OrdersStatus.Shipped)
                    updatingOrder.setShippedDate(LocalDateTime.now());
                else if (status == OrdersStatus.Cancelled) {
                    if(currentStatus == OrdersStatus.Just_ordered)
                        updatingOrder.setCancelledDate(LocalDateTime.now());
                    else
                        return false;
                }

                updatingOrder.setOrdersStatus(status);
                orderRepo.save(updatingOrder);
                return true;
            }
        }

        return false;
    }
}
