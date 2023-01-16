package com.batuta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batuta.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
