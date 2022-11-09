package com.ubistart.springdemo.repository;

import com.ubistart.springdemo.entity.Text;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextRepository extends JpaRepository<Text, Long> {
}
