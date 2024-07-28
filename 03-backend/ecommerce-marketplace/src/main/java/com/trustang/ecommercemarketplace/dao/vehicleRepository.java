package com.trustang.ecommercemarketplace.dao;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import com.trustang.ecommercemarketplace.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
	Page<Vehicle> findByPromoted(@RequestParam("promoted") String promoted, Pageable pageable);
}
