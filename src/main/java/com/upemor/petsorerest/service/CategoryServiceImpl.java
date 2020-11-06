package com.upemor.petsorerest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upemor.petsorerest.model.Category;
import com.upemor.petsorerest.repository.CategoryRepository;

@Service
public class CategoryServiceImpl {
	@Autowired
	private CategoryRepository categoryRepository;

	public List<Category> listAllCategorys() {
		List<Category> categorys = categoryRepository.findAll();
		return categorys;
	}

	public Category findById(int id) {
		Category category = categoryRepository.findById(id);
		return category;
	}

	public void createCategory(Category category) {
		categoryRepository.save(category);
	}

	public Category updateCategory(int id, Category category) {
		Category current = categoryRepository.findById(id);
		current.setName(category.getName());
		categoryRepository.save(current);
		return current;
	}

	public void deleteCategory(int id) {
		categoryRepository.deleteById(id);
	}
}
