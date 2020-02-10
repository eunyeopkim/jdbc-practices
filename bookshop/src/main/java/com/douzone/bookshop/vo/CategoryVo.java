package com.douzone.bookshop.vo;

public class CategoryVo {
	private long categoryNo;
	private String category;
	
	public long getCategoryNo() {
		return categoryNo;
	}
	public void setCategoryNo(long categoryNo) {
		this.categoryNo = categoryNo;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "CategoryVo [category_no=" + categoryNo + ", category=" + category + "]";
	}
}
