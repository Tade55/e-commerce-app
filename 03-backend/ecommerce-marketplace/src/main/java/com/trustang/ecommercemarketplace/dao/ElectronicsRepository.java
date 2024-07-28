package com.trustang.ecommercemarketplace.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trustang.ecommercemarketplace.entity.Electronics;

public interface ElectronicsRepository extends JpaRepository<Electronics, Long> {
	List<Electronics> findElectronicsByUserEmail(String userEmail);
}
