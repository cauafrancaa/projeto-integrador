package com.senai.pi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.pi.models.MovimentacoesMateriais;

@Repository
public interface MovimentacoesMateriaisRepository extends JpaRepository<MovimentacoesMateriais, Integer> {
    
}

