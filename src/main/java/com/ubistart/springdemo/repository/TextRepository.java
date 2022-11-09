package com.ubistart.springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextRepository extends JpaRepository<String, Long> {
}