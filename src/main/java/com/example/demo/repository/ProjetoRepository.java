package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Projeto;
import com.example.demo.projections.UserProjection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public interface ProjetoRepository extends JpaRepository<Projeto, Long>{
	
}