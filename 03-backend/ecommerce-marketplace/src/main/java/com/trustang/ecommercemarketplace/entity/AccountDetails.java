package com.trustang.ecommercemarketplace.entity;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Table(name="accountdetails")
@Data

public class AccountDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="rating")
	private String rating;

	@Column(name="location")
	private String location;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phone_number")
	private Long phoneNumber;
	
	@Column(name="user_email")
	private String userEmail;
	
	
	@Column(name="date_signed_up")
	private String dateSignedUp;
	
	public AccountDetails(String firstName, String lastName, String rating, String location, String address,
			Long phoneNumber, String userEmail, String dateSignedUp) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.rating=rating;
		this.location=location;
		this.address=address;
		this.phoneNumber=phoneNumber;
		this.userEmail=userEmail;
		this.dateSignedUp=dateSignedUp;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
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

	public String getDateSignedUp() {
		return dateSignedUp;
	}

	public void setDateSignedUp(String dateSignedUp) {
		this.dateSignedUp = dateSignedUp;
	}


}
