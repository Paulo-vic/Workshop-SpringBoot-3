package com.example.workshop.repositories;

import com.example.workshop.entities.Order;
import com.example.workshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
