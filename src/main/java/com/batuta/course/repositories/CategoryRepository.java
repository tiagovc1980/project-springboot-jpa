package com.batuta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batuta.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
