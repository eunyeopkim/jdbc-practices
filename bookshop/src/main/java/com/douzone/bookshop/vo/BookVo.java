package com.douzone.bookshop.vo;

public class BookVo {
	private long bookNo;
	private long categoryNo;
	private String title;
	private long price;
	private String category;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getBookNo() {
		return bookNo;
	}
	public void setBookNo(long bookNo) {
		this.bookNo = bookNo;
	}
	public long getCategoryNo() {
		return categoryNo;
	}
	public void setCategoryNo(long categoryNo) {
		this.categoryNo = categoryNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookVo [bookNo=" + bookNo + ", categoryNo=" + categoryNo + ", title=" + title + ", price=" + price
				+ ", category=" + category + "]";
	}
	
	
	
}
