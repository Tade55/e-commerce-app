package com.trustang.ecommercemarketplace.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trustang.ecommercemarketplace.entity.Generator;

public interface GeneratorRepository extends JpaRepository<Generator, Long> {
	List<Generator> findGeneratorByUserEmail(String userEmail);
}
