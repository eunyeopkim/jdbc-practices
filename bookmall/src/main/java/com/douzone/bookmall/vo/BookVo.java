package com.douzone.bookmall.vo;

public class BookVo {
	private long no;
	private String title;
	private String state;
	
	// private AuthorVo author; 객체지향이라면 이렇게 표시
	// but ..
	private Long authorNo;
	private String authorName;
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getAuthorNo() {
		return authorNo;
	}
	public void setAuthorNo(Long authorNo) {
		this.authorNo = authorNo;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "BookVo [no=" + no + ", title=" + title + ", state=" + state + ", authorNo=" + authorNo + ", authorName="
				+ authorName + "]";
	}
	
	
}
