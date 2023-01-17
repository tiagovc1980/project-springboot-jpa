package com.batuta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batuta.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
