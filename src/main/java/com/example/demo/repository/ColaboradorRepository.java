package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Colaborador;

public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {	
}