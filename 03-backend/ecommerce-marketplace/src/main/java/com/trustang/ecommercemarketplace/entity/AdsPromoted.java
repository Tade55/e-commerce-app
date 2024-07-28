package com.trustang.ecommercemarketplace.entity;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Table(name="adspromoted")
@Data

public class AdsPromoted {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="price")
	private float price;
	
	@Column(name="entity_id")
	private Long entityId;
	
	@Column(name="name_of_table")
	private String nameOfTable;
	
	@Column(name="no_of_views")
	private Long noOfViews;
	
	@Column(name="date_promoted")
	private String datePromoted;
	
	@Column(name="image")
	private String image;
	
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Long getEntityId() {
		return entityId;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}

	public String getNameOfTable() {
		return nameOfTable;
	}

	public void setNameOfTable(String nameOfTable) {
		this.nameOfTable = nameOfTable;
	}

	public Long getNoOfViews() {
		return noOfViews;
	}

	public void setNoOfViews(Long noOfViews) {
		this.noOfViews = noOfViews;
	}

	public String getDatePromoted() {
		return datePromoted;
	}

	public void setDatePromoted(String datePromoted) {
		this.datePromoted = datePromoted;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	

}
