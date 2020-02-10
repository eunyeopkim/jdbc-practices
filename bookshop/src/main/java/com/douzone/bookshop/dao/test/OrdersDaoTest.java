package com.douzone.bookshop.dao.test;

import java.util.List;

import com.douzone.bookshop.dao.OrdersDao;
import com.douzone.bookshop.vo.OrdersVo;

public class OrdersDaoTest {
	public static void main(String[] args) {
//		insertTest(2020010101L,1L, 7000L,"강원도 춘천시");


		selectTest();
	}

	// insert into orders values(null, 1, 1, 25000, '서울시 강남구');
	public static void insertTest(Long orderNo, Long memberNo, Long totalPrice, String address) {
		OrdersVo vo = new OrdersVo();
		vo.setOrderNo(orderNo);
		vo.setMemberNo(memberNo);
		vo.setTotalPrice(totalPrice);
		vo.setAddress(address);
		

		new OrdersDao().insert(vo);
	}

	public static void selectTest() {
		List<OrdersVo> list = new OrdersDao().findOrder();
		for (OrdersVo vo : list) {
			System.out.println("주문번호: " +vo.getOrderNo() + ", 주문자이름: "+vo.getMemberName() + ", 주문자 이메일: " +vo.getMemberEmail() + ", 결제금액: "+vo.getTotalPrice()
			+", 배송지: " +vo.getAddress());
			
		}
		List<OrdersVo> list2 = new OrdersDao().findOrderBook();
		for(OrdersVo vo: list2) {
			System.out.println("도서번호: " + vo.getBookNo() + ", 도서제목: " +vo.getTitle() + ", 수량: " + vo.getAmount());
		}
	}
}
