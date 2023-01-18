package com.example.demo.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CustomerEvent;

public interface CustomerEventRepository extends JpaRepository<CustomerEvent, Long> {

}