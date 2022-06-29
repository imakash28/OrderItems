package com.example.testing.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.testing.dto.OrderDto;

public interface OrderService {

	ResponseEntity<Object> createOrder(List<OrderDto> orderDto);

	ResponseEntity<Object> getOrder(Long orderId);

	ResponseEntity<Object> getAllOrder();

}
