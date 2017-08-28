package com.multi.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.DBUtil;

public class CustomerDAO {
	Connection conn;
	PreparedStatement st;
	ResultSet rs;
	int count;
	
	public CustomerDTO makeCustomerDTO(ResultSet rs) throws SQLException {
		int id = rs.getInt("customer_id");
		String name = rs.getString("c_name");
		String email = rs.getString("c_email");
		String phone = rs.getString("c_phone");
		
		CustomerDTO dto = new CustomerDTO(id, name, email, phone);
		return dto;
	}
	
	// id로 조회
	public CustomerDTO selectById(int no) {
		CustomerDTO dto = null;
		String sql = "SELECT * FROM customers WHERE customer_id=?";
		
		conn = DBUtil.getConn();
		
		try {
			st = conn.prepareStatement(sql);
			st.setInt(1, no);
			rs = st.executeQuery();
			
			while(rs.next()) {
				dto = makeCustomerDTO(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(conn, st, rs);
		}
		
		
		return dto;
	}
	
	// 이름으로 조회
	public CustomerDTO selectByName(String name) {
		CustomerDTO dto = null;
		String sql = "SELECT * FROM customers WHERE c_name=?";
		conn = DBUtil.getConn();
		
		try {
			st = conn.prepareStatement(sql);
			st.setString(1, name);
			rs = st.executeQuery();
			
			while(rs.next()) {
				dto = makeCustomerDTO(rs);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(conn, st, rs);
		}
		
		return dto;
	}
	
	// 전체 조회
	public List<CustomerDTO> selectAll() {
		List<CustomerDTO> clist = new ArrayList<>();
		String sql = "SELECT * FROM customers";
		conn = DBUtil.getConn();
		
		try {
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			
			while(rs.next()) {
				CustomerDTO dto = makeCustomerDTO(rs);
				clist.add(dto);
				System.out.println("읽음: " + dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(conn, st, rs);
		}
		
		return clist;
	}
	
	// 삭제
	public int deleteById(int no) {
		String sql = "DELETE FROM customers WHERE customer_id=?";
		conn = DBUtil.getConn();
		
		try {
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			
			count = st.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(conn, st, rs);
		}
		
		return count;
	}
	
	// 업데이트
	public int updateById(CustomerDTO dto) {
		String sql = "UPDATE customers SET c_name=?, c_email=?, c_phone=? WHERE  customer_id=?";
		conn = DBUtil.getConn();
		
		try {
			st = conn.prepareStatement(sql);
			
			st.setInt(4, dto.getCustomerId());
			st.setString(1, dto.getcName());
			st.setString(2, dto.getcEmail());
			st.setString(3, dto.getcPhone());
			
			count = st.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.dbClose(conn, st, rs);
		}
		
		return count;
	}

	

}
