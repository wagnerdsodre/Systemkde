package com.sistemas.systemkde.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemas.systemkde.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
