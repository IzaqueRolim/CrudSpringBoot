package com.example.demo.entity;

import java.util.List;

import org.springframework.data.annotation.ReadOnlyProperty;

import com.example.demo.projections.UserProjection;
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
@Table(name = "tb_project")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String descricao;
	private String data_inicio;
	private String data_final;
	private float investimento;
	

	@ManyToMany(mappedBy = "project")
	@JsonIgnoreProperties({"project"})
	private List<User> user;
	
	@ManyToOne()
	@JoinColumn(name = "department_id")
	private Department department;
	
	
	 
	public float getInvestimento() {
		return investimento;
	}
	public void setInvestimento(float investimento) {
		this.investimento = investimento;
	}
	public List<User> getUsuarios() {
		return user;
	}
	public void setUsuarios(List<User> users) {
		this.user = users;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getData_inicio() {
		return data_inicio;
	}
	public void setData_inicio(String data_inicio) {
		this.data_inicio = data_inicio;
	}
	public String getData_final() {
		return data_final;
	}
	public void setData_final(String data_final) {
		this.data_final = data_final;
	}
	
	
}
