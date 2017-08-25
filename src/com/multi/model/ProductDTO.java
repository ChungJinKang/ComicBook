package com.multi.model;

public class ProductDTO {
	private int productId;
	private String pName;
	
	public ProductDTO() {
		super();
	}
	public ProductDTO(int productId, String pName) {
		super();
		this.productId = productId;
		this.pName = pName;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductDTO [productId=").append(productId).append(", pName=").append(pName).append("]");
		return builder.toString();
	}
}
