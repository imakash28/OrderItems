package com.example.testing.dto;

import java.util.Date;
import java.util.List;

import com.example.testing.model.Items;

public class OrderDto {

	private Date orderDate;
	
	private List<Items> items;

	public Date getOrderDate() {
		return orderDate;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}
	
	
}
