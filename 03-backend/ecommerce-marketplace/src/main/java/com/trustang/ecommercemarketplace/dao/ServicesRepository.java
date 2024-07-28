package com.trustang.ecommercemarketplace.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trustang.ecommercemarketplace.entity.Services;

public interface ServicesRepository extends JpaRepository<Services, Long> {
	List<Services> findServicesByUserEmail(String userEmail);
}
