package com.douzone.bookshop.dao.test;

import java.util.List;

import com.douzone.bookshop.dao.CategoryDao;
import com.douzone.bookshop.vo.CategoryVo;

public class CategoryDaoTest {

	public static void main(String[] args) {
//		insertTest("IT");
//		insertTest("인문");

		selectTest();
	}

	// insert into category values (null, '소설');
	public static void insertTest(String category) {
		CategoryVo vo = new CategoryVo();
		vo.setCategory(category);

		new CategoryDao().insert(vo);
	}

	public static void selectTest() {
		List<CategoryVo> list = new CategoryDao().findAll();
		for (CategoryVo vo : list) {
			System.out.println("카테고리 번호: " + vo.getCategoryNo() + ", 카테고리: " + vo.getCategory());
		}
	}

}
