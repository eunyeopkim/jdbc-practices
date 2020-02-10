package com.douzone.bookshop.vo;

public class CartVo {
	private long memberNo;
	private long bookNo;
	private long amount;
	private long price;
	
	private String bookName;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "CartVo [memberNo=" + memberNo + ", bookNo=" + bookNo + ", amount=" + amount + ", price=" + price
				+ ", bookName=" + bookName + "]";
	}
	public long getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(long memberNo) {
		this.memberNo = memberNo;
	}
	public long getBookNo() {
		return bookNo;
	}
	public void setBookNo(long bookNo) {
		this.bookNo = bookNo;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	
}
