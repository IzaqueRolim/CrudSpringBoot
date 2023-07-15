package com.example.demo.controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Colaborador;
import com.example.demo.repository.ColaboradorRepository;
import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping(value = "/colaboradores")
public class ColaboradorController {
	
	@Autowired
	private ColaboradorRepository colaboradorRepository;
	
	@GetMapping
	public List<Colaborador> findAll(){
		List<Colaborador> colaboradoresEncontrados = colaboradorRepository.findAll();
		
		return colaboradoresEncontrados;
	}
	
	@GetMapping(value = "/{id}")
	public Colaborador findById(@PathVariable Long id) {
		Colaborador userFinded = colaboradorRepository.findById(id).get();
		
		return userFinded;
	}
	
	@PostMapping(value = "/novoColaborador")
	public Colaborador insert(@RequestBody Colaborador user) {
		Colaborador result = colaboradorRepository.save(user);
		
		return result;
	}
	
	@PutMapping(value = "{id}")
	public Colaborador update(@PathVariable Long id, @RequestBody Colaborador user){
		Colaborador userExisting = colaboradorRepository.findById(id).orElse(null);
		if (userExisting != null) {		
			BeanUtils.copyProperties(user, userExisting);
   
			return colaboradorRepository.save(userExisting);
		}
		return userExisting;
	}
	
	@DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
		colaboradorRepository.deleteById(id);
        return "Usuario deletado com sucesso";
    }
	
}
