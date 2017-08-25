package com.multi.model;

public class InventoryDTO {
	private int storeId;
	private int productId;
	private int pNum;
	
	
	public InventoryDTO() {
		super();
	}
	public InventoryDTO(int storeId, int productId, int pNum) {
		super();
		this.storeId = storeId;
		this.productId = productId;
		this.pNum = pNum;
	}
	
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getpNum() {
		return pNum;
	}
	public void setpNum(int pNum) {
		this.pNum = pNum;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InventoryDTO [storeId=").append(storeId).append(", productId=").append(productId)
				.append(", pNum=").append(pNum).append("]");
		return builder.toString();
	}

}
