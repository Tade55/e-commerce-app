package com.trustang.ecommercemarketplace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trustang.ecommercemarketplace.responsemodel.DeleteAdsResponse;
import com.trustang.ecommercemarketplace.responsemodel.MyAdsPageModel;
import com.trustang.ecommercemarketplace.service.MyAdsPageService;
import com.trustang.ecommercemarketplace.utils.ExtractJWT;


@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/adspage")
public class MyAdsPageController {

	private MyAdsPageService myAdsPageService;
	
	@Autowired
	public MyAdsPageController(MyAdsPageService myAdsPageService) {
		this.myAdsPageService=myAdsPageService;
	}
	
	@GetMapping("/secure/myads")
	public List<MyAdsPageModel> adsPage(@RequestHeader(value="Authorization") String token){
		String userEmail=ExtractJWT.payloadJWTExtraction(token, "\"sub\"");
		return myAdsPageService.getAds(userEmail);
	}
	
	@DeleteMapping("/secure/delete/ads")
	public void deleteBook(@RequestHeader(value="Authorization") String token, @RequestBody DeleteAdsResponse deleteAdsResponse
			)throws Exception{
		myAdsPageService.deleteAds(deleteAdsResponse);
	}
	
	@GetMapping("/secure/countadsbyuseremail")
	public int countAdsByUserEmail(@RequestHeader(value="Authorization") String token){
		String userEmail=ExtractJWT.payloadJWTExtraction(token, "\"sub\"");
		return myAdsPageService.countTotalNoOfAdsByEmail(userEmail);
	}	
	
}


