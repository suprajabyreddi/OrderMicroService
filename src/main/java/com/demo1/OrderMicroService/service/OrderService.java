package com.demo1.OrderMicroService.service;

import com.demo1.OrderMicroService.dao.Order;
import com.demo1.OrderMicroService.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // Method to retrieve all orders
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Method to create a new order
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    // Method to get an order by ID
    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    // Method to delete an order
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
