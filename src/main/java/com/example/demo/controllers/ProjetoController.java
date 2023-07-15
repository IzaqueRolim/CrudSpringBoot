package com.example.demo.controllers;

import java.io.Console;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Colaborador;
import com.example.demo.entity.Projeto;

import com.example.demo.repository.ColaboradorRepository;
import com.example.demo.repository.ProjetoRepository;

@RestController
@RequestMapping(value = "/projetos")
public class ProjetoController {
	
	@Autowired
	private ProjetoRepository projectRepository;
	@Autowired
	private ColaboradorRepository colaboradorRepository; 
	
	@GetMapping
	public List<Projeto> findAll(){
		List<Projeto> projectsFinded = projectRepository.findAll();
		
		return projectsFinded;
	}
	
	@PutMapping(value="{project_id}/{colaborador_id}")
	public Projeto addUsuarioInProject(@PathVariable Long project_id,@PathVariable Long colaborador_id){
		Projeto project = projectRepository.findById(project_id).get();
		Colaborador colaborador = colaboradorRepository.findById(colaborador_id).orElse(null);

		if (project == null || colaborador == null) {
			return null;
		}
		
		project.getColaborador().add(colaborador);
		colaborador.getProject().add(project);
		
		return projectRepository.save(project);
	}
}
