package com.trustang.ecommercemarketplace.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;
import com.trustang.ecommercemarketplace.entity.AgricultureFood;

public interface AgricultureFoodRepository extends JpaRepository<AgricultureFood, Long> {
	
 Page<AgricultureFood> findByTitleContaining(@RequestParam("title") String title, Pageable pageable);
	 
	 Page<AgricultureFood> findByCategory(@RequestParam("category") String category, Pageable pageable);
	 
	 Page<AgricultureFood> findByModelContaining(@RequestParam("model") String model, Pageable pageable);
	 
	 @Query("select o from AgricultureFood o where id in :id")
	 List<AgricultureFood> findAgricultureFoodsByIds(@Param("id") List<Long> id);
	 
	 
	 List<AgricultureFood> findAgricultureFoodsByUserEmail(String userEmail);

}
