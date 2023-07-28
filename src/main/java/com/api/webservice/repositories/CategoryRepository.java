package com.api.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
