package com.multi.model;

public class StoreReviewDTO {
	private int storeReviewId;
	private int storeId;
	private String srContents;
	private int srRate;
	
	public StoreReviewDTO() {
		super();
	}
	public StoreReviewDTO(int storeReviewId, int storeId, String srContents, int srRate) {
		super();
		this.storeReviewId = storeReviewId;
		this.storeId = storeId;
		this.srContents = srContents;
		this.srRate = srRate;
	}
	public int getStoreReviewId() {
		return storeReviewId;
	}
	public void setStoreReviewId(int storeReviewId) {
		this.storeReviewId = storeReviewId;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getSrContents() {
		return srContents;
	}
	public void setSrContents(String srContents) {
		this.srContents = srContents;
	}
	public int getSrRate() {
		return srRate;
	}
	public void setSrRate(int srRate) {
		this.srRate = srRate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StoreReviewDTO [storeReviewId=").append(storeReviewId).append(", storeId=").append(storeId)
				.append(", srContents=").append(srContents).append(", srRate=").append(srRate).append("]");
		return builder.toString();
	}
}
