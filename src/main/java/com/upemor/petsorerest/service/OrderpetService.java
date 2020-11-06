package com.upemor.petsorerest.service;

import java.util.List;

import com.upemor.petsorerest.model.Orderpet;

public interface OrderpetService {
	List<Orderpet> listAllOrderpets();
	
	Orderpet findById(int id);
		
		void createPet(Orderpet orderpet);
		
		Orderpet updateOrderpet(int id, Orderpet orderpet);
		
		void deleteCategory(int id);
}
