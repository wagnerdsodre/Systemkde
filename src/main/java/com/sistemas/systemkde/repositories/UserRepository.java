package com.sistemas.systemkde.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemas.systemkde.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
