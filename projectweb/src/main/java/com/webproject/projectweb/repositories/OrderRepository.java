package com.webproject.projectweb.repositories;


import com.webproject.projectweb.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
