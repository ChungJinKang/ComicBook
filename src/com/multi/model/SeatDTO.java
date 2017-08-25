package com.multi.model;

public class SeatDTO {
	private int storeId;
	private int seatId;
	private int sTime;
	private int isOccupied;
	
	public SeatDTO() {
		super();
	}
	public SeatDTO(int storeId, int seatId, int sTime, int isOccupied) {
		super();
		this.storeId = storeId;
		this.seatId = seatId;
		this.sTime = sTime;
		this.isOccupied = isOccupied;
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
	public int getsTime() {
		return sTime;
	}
	public void setsTime(int sTime) {
		this.sTime = sTime;
	}
	public int getIsOccupied() {
		return isOccupied;
	}
	public void setIsOccupied(int isOccupied) {
		this.isOccupied = isOccupied;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SeatDTO [storeId=").append(storeId).append(", seatId=").append(seatId).append(", sTime=")
				.append(sTime).append(", isOccupied=").append(isOccupied).append("]");
		return builder.toString();
	}

}
