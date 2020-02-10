package com.douzone.bookshop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.douzone.bookshop.vo.MemberVo;


public class MemberDao {
	public MemberVo find(Long no) {
		return null;
	}

	public Boolean update(MemberVo vo) {
		return false;
	}

	public List<MemberVo> findAll() {
		List<MemberVo> result = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {

			conn = getConnection();

			String sql = "select name, number, email, password from member";
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				String name = rs.getString(1);
				String number = rs.getString(2);
				String email = rs.getString(3);
				String password = rs.getString(4);
				MemberVo vo = new MemberVo();
				vo.setName(name);
				vo.setNumber(number);
				vo.setEmail(email);
				vo.setPassword(password);	
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

	public Boolean insert(MemberVo MemberVo) {
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = getConnection();
			String sql = "insert into member values (null, ?, ? ,? ,?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, MemberVo.getName());
			pstmt.setString(2, MemberVo.getEmail());
			pstmt.setString(3, MemberVo.getNumber());
			pstmt.setString(4, MemberVo.getPassword());
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
