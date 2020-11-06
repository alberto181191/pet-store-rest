package com.upemor.petsorerest.service;

import java.util.List;

import com.upemor.petsorerest.model.Category;

public interface CategoryService {
List<Category> listAllCategorys();
	
Category findById(int id);
	
	void createPet(Category category);
	
	Category updateCategory(int id, Category category);
	
	void deleteCategory(int id);
}
