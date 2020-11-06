package com.upemor.petsorerest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upemor.petsorerest.model.Pet;
import com.upemor.petsorerest.repository.PetRepository;

@Service
public class PetServiceImpl {
	@Autowired
	private PetRepository petRepository;

	public List<Pet> listAllPets() {
		List<Pet> pets = petRepository.findAll();
		return pets;
	}

	public Pet findById(int id) {
		Pet pet = petRepository.findById(id);
		return pet;
	}

	public void createPet(Pet pet) {
		petRepository.save(pet);
	}

	public Pet updatePet(int id, Pet pet) {
		Pet current = petRepository.findById(id);
		current.setName(pet.getName());
		petRepository.save(current);
		return current;
	}

	public void deleteTag(int id) {
		petRepository.deleteById(id);
	}
}
