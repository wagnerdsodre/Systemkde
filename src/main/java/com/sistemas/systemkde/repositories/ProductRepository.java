package com.sistemas.systemkde.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemas.systemkde.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
