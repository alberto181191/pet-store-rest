package com.upemor.petsorerest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.upemor.petsorerest.model.Orderpet;
import com.upemor.petsorerest.repository.OrderpetRepository;

public class OrderServiceImpl {
	@Autowired
	private OrderpetRepository orderPetRepository;

	public List<Orderpet> listAllOrderPets() {
		List<Orderpet> orderPet = orderPetRepository.findAll();
		return orderPet;
	}

	public Orderpet findById(int id) {
		Orderpet orderPet = orderPetRepository.findById(id);
		return orderPet;
	}

	public void createPet(Orderpet orderPet) {
		orderPetRepository.save(orderPet);
	}

	public Orderpet updatePet(int id, Orderpet orderPet) {
		Orderpet current = orderPetRepository.findById(id);
		current.setPet(orderPet.getPet());
		orderPetRepository.save(current);
		return current;
	}

	public void deleteOrderpet(int id) {
		orderPetRepository.deleteById(id);
	}
}
