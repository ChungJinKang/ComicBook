package com.multi.controller;

import java.util.Map;

public class AdminController implements ControllerInterface {

	@Override
	public void exec(Map<String, Object> data) {
		
		int adminMenu = (int) data.get("adminMenu");

		// 관리 기능
		switch(adminMenu) {
		case 1:	// managing customers
			// 고객 조회

			// 고객 추가
			
			// 고객 삭제
			
			break;
		case 2:	// managing products
			// 물품 조회
			
			// 물품 추가
			
			// 물품 삭제
			
			break;
		case 3:	// managing books
			// 책 조회
			
			// 책 추가
			
			// 책 삭제
			
			break;
		case 4:	// managing stores
			// 가게 조회
			
			// 가게 추가
			
			// 가게 삭제
			
			break;
		default:
		
		}
		
	}
	
}
