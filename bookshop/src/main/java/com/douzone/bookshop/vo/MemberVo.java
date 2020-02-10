package com.douzone.bookshop.vo;

public class MemberVo {
	private long memberNo;
	private String name;
	private String email;
	private String number;
	private String password;
	@Override
	public String toString() {
		return "MemberVo [memberNo=" + memberNo + ", name=" + name + ", email=" + email + ", number=" + number
				+ ", password=" + password + "]";
	}
	public long getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(long memberNo) {
		this.memberNo = memberNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
