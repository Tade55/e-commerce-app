package com.trustang.ecommercemarketplace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.trustang.ecommercemarketplace.requestmodels.PendingAdsModel;
import com.trustang.ecommercemarketplace.service.AdminService;
import com.trustang.ecommercemarketplace.utils.ExtractJWT;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/admin")
public class AdminController {
	
	private AdminService adminService;
	
	@Autowired
	public AdminController(AdminService adminService) {
		this.adminService=adminService;
	}
	
	@PostMapping("/secure/add/pendingads")
	public void postPendingAds(@RequestHeader(value="Authorization") String token,
			@RequestBody PendingAdsModel pendingAdsModel)throws Exception{
		String userEmail=ExtractJWT.payloadJWTExtraction(token, "\"sub\"");
		
		adminService.postPendingAds(pendingAdsModel, userEmail);
	}

}
