package com.example.testing.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testing.model.Order;

public interface OrderDao extends JpaRepository<Order, Long> {



	List<Order> findByOrderByOrderDateDesc();

}
