package com.douzone.bookshop.dao.test;

import java.util.List;

import com.douzone.bookshop.dao.BookDao;
import com.douzone.bookshop.vo.BookVo;

public class BookDaoTest {
	public static void main(String[] args) {
//		insertTest(2L,"백설공주", 7000L);

		selectTest();
	}

	// insert into book values(null, 1 , '자바의 정석', 25000);
	public static void insertTest(Long categoryNo, String title, Long price) {
		BookVo vo = new BookVo();
//		vo.setBookNo(bookNo);
		vo.setCategoryNo(categoryNo);
		vo.setTitle(title);
		vo.setPrice(price);
		

		new BookDao().insert(vo);
	}

	public static void selectTest() {
		List<BookVo> list = new BookDao().findAll();
		for (BookVo vo : list) {
			System.out.println("카테고리:"+vo.getCategory() + ", 책제목:" +vo.getTitle() + ", 가격:" + vo.getPrice());
		}
	}
}
