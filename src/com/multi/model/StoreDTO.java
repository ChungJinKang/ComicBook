package com.multi.model;

public class StoreDTO {
	private int storeId;
	private String location;
	private String name;
	
	public StoreDTO() {
		super();
	}
	public StoreDTO(int storeId, String location, String name) {
		super();
		this.storeId = storeId;
		this.location = location;
		this.name = name;
	}
	
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StoreDTO [storeId=").append(storeId).append(", location=").append(location).append(", name=")
				.append(name).append("]");
		return builder.toString();
	}
}
