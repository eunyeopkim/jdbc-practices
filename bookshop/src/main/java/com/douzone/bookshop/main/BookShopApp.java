package com.douzone.bookshop.main;

import com.douzone.bookshop.dao.test.BookDaoTest;
import com.douzone.bookshop.dao.test.CartDaoTest;
import com.douzone.bookshop.dao.test.CategoryDaoTest;
import com.douzone.bookshop.dao.test.MemberDaoTest;
import com.douzone.bookshop.dao.test.OrdersDaoTest;

public class BookShopApp {

	public static void main(String[] args) {
		System.out.println("CategoryDaoTest: ");
		new CategoryDaoTest().main(args);
		System.out.println();
		System.out.println("=======================================");
		System.out.println("MemberDaoTest: ");
		new MemberDaoTest().main(args);
		System.out.println();
		System.out.println("=======================================");
		System.out.println("BookDaoTest: ");
		new BookDaoTest().main(args);
		System.out.println();
		System.out.println("=======================================");
		System.out.println("CartDaoTest: ");
		new CartDaoTest().main(args);
		System.out.println();
		System.out.println("=======================================");
		System.out.println("OrdersDaoTest: ");
		new OrdersDaoTest().main(args);
		System.out.println();

	}

}
