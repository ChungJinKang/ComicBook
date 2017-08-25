package com.multi.model;

public class ChargeDTO {
	private int chargeId;
	private int fee;
	
	public ChargeDTO() {
		super();
	}
	public ChargeDTO(int chargeId, int fee) {
		super();
		this.chargeId = chargeId;
		this.fee = fee;
	}
	
	public int getChargeId() {
		return chargeId;
	}
	public void setChargeId(int chargeId) {
		this.chargeId = chargeId;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ChargeDTO [chargeId=").append(chargeId).append(", fee=").append(fee).append("]");
		return builder.toString();
	}

}
