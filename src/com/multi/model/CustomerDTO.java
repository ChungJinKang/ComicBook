package com.multi.model;

public class CustomerDTO {
	private int customerId;
	private String cName;
	private String cEmail;
	
	public CustomerDTO() {
		super();
	}
	public CustomerDTO(int customerId, String cName, String cEmail) {
		super();
		this.customerId = customerId;
		this.cName = cName;
		this.cEmail = cEmail;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcEmail() {
		return cEmail;
	}
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CustomerDTO [customerId=").append(customerId).append(", cName=").append(cName)
				.append(", cEmail=").append(cEmail).append("]");
		return builder.toString();
	}

}
