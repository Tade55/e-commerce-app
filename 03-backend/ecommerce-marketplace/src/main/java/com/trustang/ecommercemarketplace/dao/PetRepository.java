package com.trustang.ecommercemarketplace.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trustang.ecommercemarketplace.entity.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {
	List<Pet> findPetByUserEmail(String userEmail);
}
