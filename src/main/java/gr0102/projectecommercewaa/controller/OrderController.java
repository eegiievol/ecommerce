package gr0102.projectecommercewaa.controller;

import gr0102.projectecommercewaa.domain.Orders;
import gr0102.projectecommercewaa.domain.OrdersStatus;
import gr0102.projectecommercewaa.domain.Product;
import gr0102.projectecommercewaa.repo.OrderRepo;
import gr0102.projectecommercewaa.service.OrderService;
import gr0102.projectecommercewaa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/getAll")
    public List<Orders> getAll() { return orderService.getAll(); }

    @PutMapping("/{id}")
    public Orders updateOrder(@PathVariable Integer id, @RequestBody Orders order) { return orderService.updateById(id, order); }

    @PutMapping("/state/{id}")
    public boolean changeOrderStatus(@PathVariable Integer id, @RequestBody Orders order) { return orderService.changeStatus(id, order); }

    @GetMapping("/{id}")
    public Orders getById(@PathVariable Integer id) { return orderService.findById(id); }

    @PostMapping
    public Orders saveOrder(@RequestBody Orders order) { return orderService.save(order); }

}