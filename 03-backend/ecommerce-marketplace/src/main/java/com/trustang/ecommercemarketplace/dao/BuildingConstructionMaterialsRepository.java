package com.trustang.ecommercemarketplace.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.trustang.ecommercemarketplace.entity.BuildingConstructionMaterials;

public interface BuildingConstructionMaterialsRepository extends JpaRepository<BuildingConstructionMaterials, Long> {
	List<BuildingConstructionMaterials> findBuildingConstructionMaterialsByUserEmail(String userEmail);
}
