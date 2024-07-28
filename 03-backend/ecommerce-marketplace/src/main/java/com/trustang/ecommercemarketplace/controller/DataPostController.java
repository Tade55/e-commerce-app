package com.trustang.ecommercemarketplace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trustang.ecommercemarketplace.requestmodels.AgriculturalFoodModel;
import com.trustang.ecommercemarketplace.requestmodels.BuildingConstructionMaterialsModel;
import com.trustang.ecommercemarketplace.requestmodels.ElectronicsModel;
import com.trustang.ecommercemarketplace.requestmodels.FashionModel;
import com.trustang.ecommercemarketplace.requestmodels.GeneratorModel;
import com.trustang.ecommercemarketplace.requestmodels.HomeFurnitureModel;
import com.trustang.ecommercemarketplace.requestmodels.PetModel;
import com.trustang.ecommercemarketplace.requestmodels.PhonesTabletsAccessoriesModel;
import com.trustang.ecommercemarketplace.requestmodels.PropertiesModel;
import com.trustang.ecommercemarketplace.requestmodels.ServicesModel;
import com.trustang.ecommercemarketplace.service.DataPostService;
import com.trustang.ecommercemarketplace.utils.ExtractJWT;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/datapost")
public class DataPostController {
	
	private DataPostService dataPostService;
	
	@Autowired
	public DataPostController(DataPostService dataPostService) {
		this.dataPostService=dataPostService;
		
	}

	@PostMapping("/secure/add/agricads")
	public void postAgricAdvert(@RequestHeader(value="Authorization") String token,
			@RequestBody AgriculturalFoodModel agriculturalFoodModel)throws Exception{
		String userEmail=ExtractJWT.payloadJWTExtraction(token, "\"sub\"");
		dataPostService.postAgricultureFoodAds(agriculturalFoodModel, userEmail);
	}
	
	
	@PostMapping("/secure/add/buildingads")
	public void postBuildingAdvert(@RequestHeader(value="Authorization") String token,
			@RequestBody BuildingConstructionMaterialsModel buildingConstructionMaterialsModel)throws Exception{
		String userEmail=ExtractJWT.payloadJWTExtraction(token, "\"sub\"");
		dataPostService.postBuildingConstructionMaterialsAds(buildingConstructionMaterialsModel, userEmail);
	}
	
	
	@PostMapping("/secure/add/electronicsads")
	public void postElectronicsAdvert(@RequestHeader(value="Authorization") String token,
			@RequestBody ElectronicsModel electronicsModel)throws Exception{
		String userEmail=ExtractJWT.payloadJWTExtraction(token, "\"sub\"");
		dataPostService.postElectronicsAds(electronicsModel, userEmail);
		
	}
	
	
	@PostMapping("/secure/add/fashionads")
	public void postFashionAdvert(@RequestHeader(value="Authorization") String token,
			@RequestBody FashionModel fashionModel)throws Exception{
		String userEmail=ExtractJWT.payloadJWTExtraction(token, "\"sub\"");
		dataPostService.postFashionAds(fashionModel, userEmail);
	}
	
	
	@PostMapping("/secure/add/generatorads")
	public void postGeneratorAdvert(@RequestHeader(value="Authorization") String token,
			@RequestBody GeneratorModel generatorModel)throws Exception{
		String userEmail=ExtractJWT.payloadJWTExtraction(token, "\"sub\"");
		dataPostService.postGeneratorAds(generatorModel, userEmail);
	}
	
	
	@PostMapping("/secure/add/homeads")
	public void postHomeAdvert(@RequestHeader(value="Authorization") String token,
			@RequestBody HomeFurnitureModel homeFurnitureModel)throws Exception{
		String userEmail=ExtractJWT.payloadJWTExtraction(token, "\"sub\"");
		dataPostService.postHomeFurnitureAds(homeFurnitureModel, userEmail);
	}
	
	
	@PostMapping("/secure/add/petads")
	public void postPetAdvert(@RequestHeader(value="Authorization") String token,
			@RequestBody PetModel petModel)throws Exception{
		String userEmail=ExtractJWT.payloadJWTExtraction(token, "\"sub\"");
		dataPostService.postPetAds(petModel, userEmail);
	}
	
	
	@PostMapping("/secure/add/phonesads")
	public void postPhonesAdvert(@RequestHeader(value="Authorization") String token,
			@RequestBody PhonesTabletsAccessoriesModel phonesTabletsAccessoriesModel)throws Exception{
		String userEmail=ExtractJWT.payloadJWTExtraction(token, "\"sub\"");
		dataPostService.postPhonesTabletsAccessoriesAds(phonesTabletsAccessoriesModel, userEmail);
	}
	
	@PostMapping("/secure/add/propertiesads")
	public void postPropertiesAdvert(@RequestHeader(value="Authorization") String token,
			@RequestBody PropertiesModel propertiesModel)throws Exception{
		String userEmail=ExtractJWT.payloadJWTExtraction(token, "\"sub\"");
		dataPostService.postPropertiesAds(propertiesModel, userEmail);
	}
	
	
	@PostMapping("/secure/add/servicesads")
	public void postServicesAdvert(@RequestHeader(value="Authorization") String token,
			@RequestBody ServicesModel servicesModel)throws Exception{
		String userEmail=ExtractJWT.payloadJWTExtraction(token, "\"sub\"");
		dataPostService.postServicesAds(servicesModel, userEmail);
	}
	
}
