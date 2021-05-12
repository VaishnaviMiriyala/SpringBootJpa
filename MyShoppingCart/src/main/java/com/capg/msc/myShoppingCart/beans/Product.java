package com.capg.msc.myShoppingCart.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	private String productName;
	private int productCost;
	private int startRating;
	private String category;
	
	
	public Product() {
		super();
	}
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductCost() {
		return productCost;
	}
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
	public int getStartRating() {
		return startRating;
	}
	public void setStartRating(int startRating) {
		this.startRating = startRating;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ ", startRating=" + startRating + ", category=" + category + "]";
	}
	
	

}
