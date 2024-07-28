package com.trustang.ecommercemarketplace.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.trustang.ecommercemarketplace.entity.HomeFurniture;

public interface HomeFurnitureRepository extends JpaRepository<HomeFurniture, Long> {
	List<HomeFurniture> findHomeFurnitureByUserEmail(String userEmail);
}
