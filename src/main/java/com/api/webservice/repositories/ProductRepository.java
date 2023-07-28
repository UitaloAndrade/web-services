package com.api.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
