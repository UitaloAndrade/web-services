package com.api.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
