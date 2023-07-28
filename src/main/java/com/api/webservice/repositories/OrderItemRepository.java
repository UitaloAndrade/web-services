package com.api.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
