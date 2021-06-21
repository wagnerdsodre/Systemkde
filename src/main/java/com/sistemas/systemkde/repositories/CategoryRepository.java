package com.sistemas.systemkde.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemas.systemkde.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
