package com.movietime.order_service.repository;

import com.movietime.order_service.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {

    List<Order> orderList = new ArrayList<>();

    private List<Order> populateRatingsList (){
        Order o1 = new Order(Long.valueOf(1),Long.valueOf(1), "Alex White");
        Order o2 = new Order(Long.valueOf(2),Long.valueOf(2), "Adrian Kola-Olawuyi");
        Order o3 = new Order(Long.valueOf(3),Long.valueOf(1), "Wilfred de Silva");
        Order o4 = new Order(Long.valueOf(4),Long.valueOf(2), "Cookie Dunken");
        Order o5 = new Order(Long.valueOf(5),Long.valueOf(1), "Sumanasena Sakunthala");
        orderList.add(o1);
        orderList.add(o2);
        orderList.add(o3);
        orderList.add(o4);
        orderList.add(o5);
        return orderList;
    }

    public OrderRepository() {
        this.orderList = populateRatingsList();
    }

    public Order add(Order order) {
        orderList.add(order);
        return order;
    }

    public List<Order> getAll() {
        return orderList;
    }

    public Order findById(Long id) {
        return orderList.stream()
                .filter(order -> order.getOrderId().equals(id))
                .findFirst()
                .orElseThrow();
    }
}
