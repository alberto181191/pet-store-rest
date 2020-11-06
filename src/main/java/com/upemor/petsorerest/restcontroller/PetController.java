package com.upemor.petsorerest.restcontroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upemor.petsorerest.model.Pet;
import com.upemor.petsorerest.repository.PetRepository;


@RestController
@RequestMapping("/")
public class PetController {
	
	@Autowired
	private PetRepository repository;
	
	@GetMapping("pet")
	private ResponseEntity<Map<String, Object>> get() {
		Map<String, Object> response = new HashMap<>();
		
		List<Pet> pets = repository.findAll();
		response.put("ok", true);
		response.put("pets", pets);
		
		return ResponseEntity.ok(response);
	}
	
	@PostMapping("pet")
	private ResponseEntity<String> create(@RequestBody Pet pet) {
		repository.save(pet);
		return ResponseEntity.ok("pet registrado");
	}
}
