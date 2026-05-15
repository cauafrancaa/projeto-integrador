package com.senai.pi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.pi.models.Danos;

@Repository
public interface DanosRepository extends JpaRepository<Danos, Integer> {
    
}
