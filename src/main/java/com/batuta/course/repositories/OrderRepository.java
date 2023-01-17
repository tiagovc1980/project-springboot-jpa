package com.batuta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batuta.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
