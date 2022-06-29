package com.example.testing.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

	@Id
	private Long orderId;
	
	private Date orderDate;
	
	private String orderStatus;
	
	
	@OneToMany(mappedBy = "orders",  fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Items> items;

	public Long getOrderId() {
		return orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}
	
	
}
