package com.example.clevercoches.models.dao;

import com.example.clevercoches.models.entity.Coche;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICocheDAO extends JpaRepository<Coche,Long> {
    
}
