package com.example.testing.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.testing.dao.ItemDao;
import com.example.testing.dao.OrderDao;
import com.example.testing.dto.OrderDto;
import com.example.testing.model.Items;
import com.example.testing.model.Order;
import com.example.testing.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao orderDao;
	
	@Autowired
	private ItemDao itemDao;
	
	@Override
	public ResponseEntity<Object> createOrder(List<OrderDto> orderDto) {
		Order save=null;
		
		List<Items> items = new ArrayList<>();
	for(OrderDto orderDto1:orderDto) {
		Order order =new Order();
		
		order.setOrderDate(orderDto1.getOrderDate());
		List<Items> itemsNew = new ArrayList<>();
		for(Items item1:orderDto1.getItems()) {
			Items item=new Items();
			item.setItemName(item1.getItemName());
			item.setItemUnitPrice(item1.getItemUnitPrice());
			item.setQuantity(item1.getQuantity());
			long orderId = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
			order.setOrderId(orderId);
			item.setOrders(order);
			itemsNew.add(item);
		}
		order.setItems(itemsNew);
		order.setOrderStatus("CREATED");
		
		 save = orderDao.save(order);
		
	}
	
	return new ResponseEntity<Object>(save, HttpStatus.ACCEPTED);
	}

	@Override
	public ResponseEntity<Object> getOrder(Long orderId) {
		Optional<Order> orderExist = orderDao.findById(orderId);
		if(orderExist.isPresent()) {
			Order order = orderExist.get();
			return new ResponseEntity<Object>(order, HttpStatus.ACCEPTED);
		}
		else {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

	@Override
	public ResponseEntity<Object> getAllOrder() {
		List<Order> orderExist = orderDao.findByOrderByOrderDateDesc();
		if(!orderExist.isEmpty()) {
			return new ResponseEntity<Object>(orderExist, HttpStatus.ACCEPTED);
		}
		else {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
