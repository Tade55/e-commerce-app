package com.trustang.ecommercemarketplace.entity;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Table(name="vehicle")
@Data

public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="make")
	private String make;
	
	@Column(name="model")
	private String model;
	
	

	@Column(name="year")
	private Long year;
	
	@Column(name="user_email")
	private String userEmail;
	
	@Column(name="description")
	private String description;
	
	@Column(name="price")
	private float price;
	
	@Column(name="colour")
	private String colour;
	
	@Column(name="vehicle_condition")
	private String vehicleCondition;
	
	@Column(name="gear_type")
	private String gearType;
	
	
	@Column(name="engine_size")
	private String engineSize;
	
	@Column(name="category")
	private String category;
	
	@Column(name="no_of_views")
	private Long noOfViews;
	
	@Column(name="promoted")
	private String promoted;
	
	@Column(name="duration_of_ads")
	private Long durationOfAds;
	
	@Column(name="image")
	private String image;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Long getYear() {
		return year;
	}

	public void setYear(Long year) {
		this.year = year;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getVehicleCondition() {
		return vehicleCondition;
	}

	public void setVehicleCondition(String vehicleCondition) {
		this.vehicleCondition = vehicleCondition;
	}

	public String getGearType() {
		return gearType;
	}

	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	
	public String getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Long getNoOfViews() {
		return noOfViews;
	}

	public void setNoOfViews(Long noOfViews) {
		this.noOfViews = noOfViews;
	}

	public String getPromoted() {
		return promoted;
	}

	public void setPromoted(String promoted) {
		this.promoted = promoted;
	}

	public Long getDurationOfAds() {
		return durationOfAds;
	}

	public void setDurationOfAds(Long durationOfAds) {
		this.durationOfAds = durationOfAds;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	

}
