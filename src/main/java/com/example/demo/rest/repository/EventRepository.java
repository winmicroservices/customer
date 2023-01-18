package com.example.demo.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

}