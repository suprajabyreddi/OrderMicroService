package com.demo1.OrderMicroService.repository;

import com.demo1.OrderMicroService.dao.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // Add custom query methods if needed
}
