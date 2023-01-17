package com.example.demo.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CustomerHistory;

public interface CustomerHistoryRepository extends JpaRepository<CustomerHistory, Long> {

}