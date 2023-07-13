package com.example.demo.controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public List<User> findAll(){
		List<User> usersFinded = userRepository.findAll();
		
		return usersFinded;
	}
	
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id) {
		User userFinded = userRepository.findById(id).get();
		
		return userFinded;
	}
	
	@PostMapping(value = "/newUser")
	public User insert(@RequestBody User user) {
		User result = userRepository.save(user);
		
		return result;
	}
	
	@PutMapping(value = "{id}")
	public User update(@PathVariable Long id, @RequestBody User user){
		User userExisting = userRepository.findById(id).orElse(null);
		if (userExisting != null) {		
			BeanUtils.copyProperties(user, userExisting, getNullPropertyNames(user));
   
			return userRepository.save(userExisting);
		}
		return userExisting;
	}
	
	 private String[] getNullPropertyNames(Object source) {
	        final BeanWrapper src = new BeanWrapperImpl(source);
	        java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

	        Set<String> emptyNames = new HashSet<>();
	        for (java.beans.PropertyDescriptor pd : pds) {
	            Object srcValue = src.getPropertyValue(pd.getName());
	            if (srcValue == null) emptyNames.add(pd.getName());
	        }

	        String[] result = new String[emptyNames.size()];
	        return emptyNames.toArray(result);
	    }
	
}
