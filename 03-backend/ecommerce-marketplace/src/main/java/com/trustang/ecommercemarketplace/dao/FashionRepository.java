package com.trustang.ecommercemarketplace.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.trustang.ecommercemarketplace.entity.Fashion;

public interface FashionRepository extends JpaRepository<Fashion, Long> {
	List<Fashion> findFashionByUserEmail(String userEmail);
}
