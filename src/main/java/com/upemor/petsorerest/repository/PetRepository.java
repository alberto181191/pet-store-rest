package com.upemor.petsorerest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upemor.petsorerest.model.Pet;
import com.upemor.petsorerest.model.Tag;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {
	Pet findById(int id);
}
