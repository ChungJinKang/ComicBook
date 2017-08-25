package com.multi.model;

public class BookReviewDTO {
	private int bookReviewId;
	private int bookId;
	private String brContents;
	private int brRate;
	
	public BookReviewDTO() {
		super();
	}
	public BookReviewDTO(int bookReviewId, int bookId, String brContents, int brRate) {
		super();
		this.bookReviewId = bookReviewId;
		this.bookId = bookId;
		this.brContents = brContents;
		this.brRate = brRate;
	}
	public int getBookReviewId() {
		return bookReviewId;
	}
	public void setBookReviewId(int bookReviewId) {
		this.bookReviewId = bookReviewId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBrContents() {
		return brContents;
	}
	public void setBrContents(String brContents) {
		this.brContents = brContents;
	}
	public int getBrRate() {
		return brRate;
	}
	public void setBrRate(int brRate) {
		this.brRate = brRate;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BookReviewDTO [bookReviewId=").append(bookReviewId).append(", bookId=").append(bookId)
				.append(", brContents=").append(brContents).append(", brRate=").append(brRate).append("]");
		return builder.toString();
	}
}
