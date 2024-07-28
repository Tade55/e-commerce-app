package com.trustang.ecommercemarketplace.entity;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Table(name="pet")
@Data
public class Pet {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long petId;
	
	@Column(name="title")
	private String title;
	
	@Column(name="breed")
	private String breed;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="price")
	private float price;
	
	@Column(name="location")
	private String location;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phone_number")
	private Long phoneNumber;
	
	@Column(name="user_email")
	private String userEmail;
	
	@Column(name="description")
	private String description;
	
	
	@Column(name="category")
	private String category;
	
	@Column(name="age")
	private String age;
	
	@Column(name="no_of_views")
	private Long noOfViews;
	
	@Column(name="date_last_promoted")
	private String dateLastPromoted;
	
	@Column(name="is_approved")
	private String isApproved;
	
	@Column(name="date_ads_posted")
	private String dateAdsPosted;
	
	@Column(name="image_one")
	private String imageOne;
	
	@Column(name="image_two")
	private String imageTwo;
	
	@Column(name="image_three")
	private String imageThree;
	
	@Column(name="image_four")
	private String imageFour;
	
	@Column(name="image_five")
	private String imageFive;
	
	@Column(name="image_six")
	private String imageSix;
	
	@Column(name="image_seven")
	private String imageSeven;
	
	@Column(name="image_eight")
	private String imageEight;
	
	@Column(name="image_nine")
	private String imageNine;
	
	@Column(name="image_ten")
	private String imageTen;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Long getNoOfViews() {
		return noOfViews;
	}

	public void setNoOfViews(Long noOfViews) {
		this.noOfViews = noOfViews;
	}

	public String getDateLastPromoted() {
		return dateLastPromoted;
	}

	public void setDateLastPromoted(String dateLastPromoted) {
		this.dateLastPromoted = dateLastPromoted;
	}

	
	
	
	public String getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(String isApproved) {
		this.isApproved = isApproved;
	}

	public String getDateAdsPosted() {
		return dateAdsPosted;
	}

	public void setDateAdsPosted(String dateAdsPosted) {
		this.dateAdsPosted = dateAdsPosted;
	}

	public String getImageOne() {
		return imageOne;
	}

	public void setImageOne(String imageOne) {
		this.imageOne = imageOne;
	}

	public String getImageTwo() {
		return imageTwo;
	}

	public void setImageTwo(String imageTwo) {
		this.imageTwo = imageTwo;
	}

	public String getImageThree() {
		return imageThree;
	}

	public void setImageThree(String imageThree) {
		this.imageThree = imageThree;
	}

	public String getImageFour() {
		return imageFour;
	}

	public void setImageFour(String imageFour) {
		this.imageFour = imageFour;
	}

	public String getImageFive() {
		return imageFive;
	}

	public void setImageFive(String imageFive) {
		this.imageFive = imageFive;
	}

	public String getImageSix() {
		return imageSix;
	}

	public void setImageSix(String imageSix) {
		this.imageSix = imageSix;
	}

	public String getImageSeven() {
		return imageSeven;
	}

	public void setImageSeven(String imageSeven) {
		this.imageSeven = imageSeven;
	}

	public String getImageEight() {
		return imageEight;
	}

	public void setImageEight(String imageEight) {
		this.imageEight = imageEight;
	}

	public String getImageNine() {
		return imageNine;
	}

	public void setImageNine(String imageNine) {
		this.imageNine = imageNine;
	}

	public String getImageTen() {
		return imageTen;
	}

	public void setImageTen(String imageTen) {
		this.imageTen = imageTen;
	}

	public Long getPetId() {
		return petId;
	}

	
	
	
}
