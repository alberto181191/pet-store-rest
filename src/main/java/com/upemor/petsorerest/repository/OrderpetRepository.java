package com.upemor.petsorerest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upemor.petsorerest.model.Orderpet;
import com.upemor.petsorerest.model.Pet;

@Repository
public interface OrderpetRepository extends JpaRepository<Orderpet, Integer> {
	Orderpet findById(int id);
}
