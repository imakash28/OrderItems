package com.example.testing.model;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "items")
public class Items {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long itemId;
	
	private BigDecimal itemUnitPrice;

    private String itemName;
    
    private Long quantity;

    
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id")
	private Order orders;
	public Long getItemId() {
		return itemId;
	}

	public BigDecimal getItemUnitPrice() {
		return itemUnitPrice;
	}

	public String getItemName() {
		return itemName;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public void setItemUnitPrice(BigDecimal itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Order getOrders() {
		return orders;
	}

	public void setOrders(Order orders) {
		this.orders = orders;
	}
    
    
}
