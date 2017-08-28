package com.multi.model;

public class CustomerDTO {
	private int customerId;
	private String cName;
	private String cEmail;
	private String cPhone;
	
	public CustomerDTO() {
		super();
	}
	public CustomerDTO(int customerId, String cName, String cEmail, String cPhone) {
		super();
		this.customerId = customerId;
		this.cName = cName;
		this.cEmail = cEmail;
		this.cPhone = cPhone;
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
	public String getcPhone() {
		return cPhone;
	}
	public void setcPhone(String cPhone) {
		this.cPhone = cPhone;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CustomerDTO [customerId=").append(customerId).append(", cName=").append(cName)
				.append(", cEmail=").append(cEmail).append(", cPhone=").append(cPhone).append("]");
		return builder.toString();
	}
	
}
