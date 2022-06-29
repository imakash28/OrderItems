package com.example.testing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.testing.dto.OrderDto;
import com.example.testing.service.OrderService;

@RestController
public class OrderController {

	
	@Autowired
	private OrderService service;
	
	
	@PostMapping("create-order")
	private ResponseEntity<Object> createOrder(@RequestBody List<OrderDto> orderDto){
		
		return service.createOrder(orderDto);
	}
	
	@GetMapping("get-order/{orderId}")
	private ResponseEntity<Object> getOrder(@PathVariable Long orderId){
		
		return service.getOrder(orderId);
	}
	
	@GetMapping("get-all-orders")
	private ResponseEntity<Object> getAllOrder(){
		
		return service.getAllOrder();
	}
}
