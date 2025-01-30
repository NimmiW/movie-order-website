package com.movietime.order_service.controller;

import com.movietime.order_service.model.Order;
import com.movietime.order_service.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private OrderRepository orderRepository = new OrderRepository();

    @GetMapping
    public List<Order> getAll(){
        return orderRepository.getAll();
    }

    @PostMapping
    public Order add(@RequestBody Order rating) {
        return orderRepository.add(rating);
    }

    @GetMapping("/{id}")
    public Order getById(@PathVariable Long id) {
        return orderRepository.findById(id);
    }
}