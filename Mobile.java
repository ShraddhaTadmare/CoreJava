package com.MobileStoreProject;

public class Mobile {
	private int mobId;
	private String brandName;
	private float price;
	
	
	public Mobile() {
		
	}


	public Mobile(int mobId, String brandName, float price) {
		this.mobId = mobId;
		this.brandName = brandName;
		this.price = price;
	}


	public int getMobId() {
		return mobId;
	}


	public void setMobId(int mobId) {
		this.mobId = mobId;
	}


	public String getBrandName() {
		return brandName;
	}


	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Mobile [mobId=" + mobId + ", brandName=" + brandName + ", price=" + price + "]";
	}
	
	
	

}
