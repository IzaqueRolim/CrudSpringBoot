package com.example.demo.entity;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_colaborador")
public class Colaborador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String senha;
	private int salario;
	
	@ManyToOne
	@JoinColumn(name = "departamento_id")
	private Departamento departamento;

	@ManyToMany
	@JoinTable(name = "colaborador_projeto",
	joinColumns =  @JoinColumn(name = "colaborador_id"),
	inverseJoinColumns = @JoinColumn(name = "projeto_id"))
	@JsonIgnoreProperties({"descricao","data_inicio","data_final","investimento","colaborador","departamento"})
	@JsonBackReference 
	private List<Projeto> projetos;

	public List<Projeto> getProject() {
		return projetos;
	}

	public void setProject(List<Projeto> projetos) {
		this.projetos = projetos;
	}

	public Colaborador() {
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Departamento getDepartment() {
		return departamento;
	}

	public void setDepartment(Departamento departamento) {
		this.departamento = departamento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}