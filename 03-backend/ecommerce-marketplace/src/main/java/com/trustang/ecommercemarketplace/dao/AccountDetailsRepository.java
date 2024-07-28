package com.trustang.ecommercemarketplace.dao;


import org.springframework.data.jpa.repository.JpaRepository;


import com.trustang.ecommercemarketplace.entity.AccountDetails;

public interface AccountDetailsRepository extends JpaRepository<AccountDetails, Long> {
AccountDetails findByUserEmail(String userEmail);
	
}
