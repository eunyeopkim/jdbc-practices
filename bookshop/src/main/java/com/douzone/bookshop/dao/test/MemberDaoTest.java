package com.douzone.bookshop.dao.test;

import java.util.List;

import com.douzone.bookshop.dao.MemberDao;
import com.douzone.bookshop.vo.MemberVo;

public class MemberDaoTest {
	public static void main(String[] args) {
//		insertTest("박소똥","cow9999@naver.com", "010-2222-2222","123박소똥");


		selectTest();
	}

	// insert into member values (null, '김개똥','dog123@gmail.com','010-1111-1111','김개똥1');
	public static void insertTest(String name, String email, String number, String password) {
		MemberVo vo = new MemberVo();
		vo.setName(name);
		vo.setEmail(email);
		vo.setNumber(number);
		vo.setPassword(password);
		

		new MemberDao().insert(vo);
	}

	public static void selectTest() {
		List<MemberVo> list = new MemberDao().findAll();
		for (MemberVo vo : list) {
			System.out.println("이름: " + vo.getName() + ", 전화번호: " +vo.getNumber(
							) + ", 이메일: " + vo.getEmail() + ", 비밀번호: " +vo.getPassword());
		}
	}
}
