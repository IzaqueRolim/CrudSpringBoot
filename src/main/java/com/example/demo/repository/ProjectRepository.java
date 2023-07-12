package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Project;
import com.example.demo.entity.User;
import com.example.demo.projections.UserProjection;

public interface ProjectRepository extends JpaRepository<Project, Long>{
	List<UserProjection> findAllProjects();

}
