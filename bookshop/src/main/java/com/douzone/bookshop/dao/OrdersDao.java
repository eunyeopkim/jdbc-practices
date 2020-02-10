package com.douzone.bookshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.douzone.bookshop.vo.OrdersVo;

public class OrdersDao {
	public OrdersVo find(Long no) {
		return null;
	}

	public Boolean update(OrdersVo vo) {
		return false;
	}

	public List<OrdersVo> findOrder() {
		List<OrdersVo> result = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {

			conn = getConnection();

			String sql = "select o.order_no, m.name, m.email, sum(price), o.address from orders o, order_book ob, book b,member m where o.order_pno=ob.order_pno and ob.book_no = b.book_no and m.member_no=o.member_no group by m.name";
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Long orderNo = rs.getLong(1);
				String memberName = rs.getString(2);
				String memberEmail = rs.getString(3);
				Long totalPrice = rs.getLong(4);
				String address = rs.getString(5);
				OrdersVo vo = new OrdersVo();
				vo.setOrderNo(orderNo);
				vo.setMemberName(memberName);
				vo.setMemberEmail(memberEmail);
				vo.setTotalPrice(totalPrice);	
				vo.setAddress(address);
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
	public List<OrdersVo> findOrderBook() {
		List<OrdersVo> result = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {

			conn = getConnection();

			String sql = "select ob.book_no, b.title, ob.amount" + 
					" from order_book ob, book b" + 
					" where ob.book_no = b.book_no";
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();
			
			while (rs.next()) {

				Long bookNo = rs.getLong(1);
				String title = rs.getString(2);
				Long amount = rs.getLong(3);
				OrdersVo vo = new OrdersVo();

				vo.setBookNo(bookNo);
				vo.setTitle(title);
				vo.setAmount(amount);	
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

	public Boolean insert(OrdersVo OrdersVo) {
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = getConnection();
			String sql = "insert into orders values(null, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setLong(1, OrdersVo.getOrderNo());
			pstmt.setLong(2, OrdersVo.getMemberNo());
			pstmt.setLong(3, OrdersVo.getTotalPrice());
			pstmt.setString(4, OrdersVo.getAddress());
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
