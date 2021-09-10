package com.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springdatajpa.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{

}
