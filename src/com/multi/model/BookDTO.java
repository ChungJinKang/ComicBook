package com.multi.model;

public class BookDTO {
	private int bookId;
	private String genre;
	private String title;
	
	public BookDTO() {
		super();
	}
	public BookDTO(int bookId, String genre, String title) {
		super();
		this.bookId = bookId;
		this.genre = genre;
		this.title = title;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BookDTO [bookId=").append(bookId).append(", genre=").append(genre).append(", title=")
				.append(title).append("]");
		return builder.toString();
	}

}
