package com.api.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
