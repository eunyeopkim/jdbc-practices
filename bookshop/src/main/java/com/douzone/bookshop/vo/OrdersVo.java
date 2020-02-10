package com.douzone.bookshop.vo;

public class OrdersVo {
	private long orderPno;
	private long orderNo;
	private long memberNo;
	private long totalPrice;
	private String address;
	private String memberName;
	private String memberEmail;
	
	private Long bookNo;
	private String title;
	private Long amount;
	
	public Long getBookNo() {
		return bookNo;
	}
	public void setBookNo(Long bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public long getOrderPno() {
		return orderPno;
	}
	public void setOrderPno(long orderPno) {
		this.orderPno = orderPno;
	}
	public long getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(long orderNo) {
		this.orderNo = orderNo;
	}
	public long getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(long memberNo) {
		this.memberNo = memberNo;
	}
	public long getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(long totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "OrdersVo [orderPno=" + orderPno + ", orderNo=" + orderNo + ", memberNoo=" + memberNo + ", totalPrice="
				+ totalPrice + ", address=" + address + ", memberName=" + memberName + ", memberEmail=" + memberEmail
				+ ", bookNo=" + bookNo + ", title=" + title + ", amount=" + amount + "]";
	}
	
}
