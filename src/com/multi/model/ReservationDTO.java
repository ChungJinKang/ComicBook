package com.multi.model;

public class ReservationDTO {
	private int customerId;
	private int storeId;
	private int seatId;
	private int productId;
	private int reservationTime;
	private int chargeId;
	
	
	public ReservationDTO() {
		super();
	}
	public ReservationDTO(int customerId, int storeId, int seatId, int productId, int reservationTime, int chargeId) {
		super();
		this.customerId = customerId;
		this.storeId = storeId;
		this.seatId = seatId;
		this.productId = productId;
		this.reservationTime = reservationTime;
		this.chargeId = chargeId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getReservationTime() {
		return reservationTime;
	}
	public void setReservationTime(int reservationTime) {
		this.reservationTime = reservationTime;
	}
	public int getChargeId() {
		return chargeId;
	}
	public void setChargeId(int chargeId) {
		this.chargeId = chargeId;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReservationDTO [customerId=").append(customerId).append(", storeId=").append(storeId)
				.append(", seatId=").append(seatId).append(", productId=").append(productId)
				.append(", reservationTime=").append(reservationTime).append(", chargeId=").append(chargeId)
				.append("]");
		return builder.toString();
	}
}
