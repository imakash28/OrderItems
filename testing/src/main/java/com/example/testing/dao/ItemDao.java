package com.example.testing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testing.model.Items;

public interface ItemDao extends JpaRepository<Items, Long> {

}
