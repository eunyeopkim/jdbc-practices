package com.douzone.bookshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.douzone.bookshop.vo.CartVo;

public class CartDao {
	public CartVo find(Long no) {
		return null;
	}

	public Boolean update(CartVo vo) {
		return false;
	}

	public List<CartVo> findAll() {
		List<CartVo> result = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {

			conn = getConnection();

			String sql = "select b.title, c.amount, c.price from book b, cart c where b.book_no = c.book_no";
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				String title = rs.getString(1);
				Long amount = rs.getLong(2);
				Long price = rs.getLong(3);
				CartVo vo = new CartVo();
				vo.setBookName(title);;
				vo.setAmount(amount);
				vo.setPrice(price);	
				result.add(vo);
			}

		} catch (SQLException e) {
			System.out.println("error: " + e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	public Boolean insert(CartVo CartVo) {
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = getConnection();
			String sql = "insert into cart values ( ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setLong(1, CartVo.getMemberNo());
			pstmt.setLong(2, CartVo.getBookNo());
			pstmt.setLong(3, CartVo.getAmount());
			pstmt.setLong(4, CartVo.getPrice());
			int count = pstmt.executeUpdate();

			result = count == 1;
			
		} catch (SQLException e) {
			System.out.println("error: " + e);
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;

	}


	private Connection getConnection() throws SQLException {
		Connection conn = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://127.0.0.1:3306/bookshop";
			conn = DriverManager.getConnection(url, "bookshop", "bookshop");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패: " + e);
		}
		return conn;
	}
}
