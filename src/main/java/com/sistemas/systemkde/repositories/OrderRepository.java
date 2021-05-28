package com.sistemas.systemkde.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemas.systemkde.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
