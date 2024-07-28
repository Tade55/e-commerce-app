package com.trustang.ecommercemarketplace.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trustang.ecommercemarketplace.entity.PhonesTabletsAccessories;

public interface PhonesTabletsAccessoriesRepository extends JpaRepository<PhonesTabletsAccessories, Long> {
	List<PhonesTabletsAccessories> findPhonesTabletsAccessoriesByUserEmail(String userEmail);
}
