package com.upemor.petsorerest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upemor.petsorerest.model.Category;
import com.upemor.petsorerest.model.Pet;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	Category findById(int id);
}
