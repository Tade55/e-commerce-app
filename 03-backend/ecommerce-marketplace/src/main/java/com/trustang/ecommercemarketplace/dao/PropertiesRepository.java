package com.trustang.ecommercemarketplace.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trustang.ecommercemarketplace.entity.Properties;

public interface PropertiesRepository extends JpaRepository<Properties, Long> {
	List<Properties> findPropertiesByUserEmail(String userEmail);
}
