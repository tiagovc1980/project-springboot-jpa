package com.batuta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batuta.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
