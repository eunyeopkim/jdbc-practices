package com.douzone.bookshop.dao.test;

import java.util.List;

import com.douzone.bookshop.dao.CartDao;
import com.douzone.bookshop.vo.CartVo;

public class CartDaoTest {
	public static void main(String[] args) {
//		insertTest(2L,3L,1L,12000L);

		selectTest();
	}

	// insert into cart values (1, 2, 1, 25000);
	public static void insertTest(Long memberNo, Long bookNo, Long amount, Long price) {
		CartVo vo = new CartVo();
		vo.setMemberNo(memberNo);
		vo.setBookNo(bookNo);
		vo.setAmount(amount);
		vo.setPrice(price);

		new CartDao().insert(vo);
	}

	public static void selectTest() {
		List<CartVo> list = new CartDao().findAll();
		for (CartVo vo : list) {
			System.out.println("도서제목: " + vo.getBookName() + ", 수량: " + vo.getAmount() + ", 가격: " + vo.getPrice());
		}
	}
}
