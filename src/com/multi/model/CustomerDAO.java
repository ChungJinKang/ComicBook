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
		}
		
		return clist;
	}
	
}
