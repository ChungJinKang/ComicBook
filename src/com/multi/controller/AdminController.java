package com.multi.controller;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.multi.model.CustomerDAO;
import com.multi.model.CustomerDTO;
import com.multi.view.CustomerView;

public class AdminController implements ControllerInterface {

	@Override
	public void exec(Map<String, Object> data) {
		
		int adminMenu = (int) data.get("adminMenu");
		Scanner sc = new Scanner(System.in);
		
		// 관리 기능
		switch(adminMenu) {
		case 1:	// managing customers
			System.out.println("***** 고객 관리 *****");
			System.out.println("1. 고객 전체 조회");
			System.out.println("2. 특정 고객 조회");
			System.out.println("3. 고객 추가");
			System.out.println("4. 고객 삭제");
			System.out.print(">> ");
			int choice = Integer.parseInt(sc.nextLine());
			
			CustomerDAO dao = new CustomerDAO();

			switch(choice) {
			case 1:
				// 고객 전체 조회
				List<CustomerDTO> list = dao.selectAll();
				CustomerView.print(list);
				break;
			case 2: {
				// 특정 고객 조회 (id로)
				System.out.print("id입력: ");
				int no = Integer.parseInt(sc.nextLine());
				CustomerDTO dto = dao.selectById(no);
				CustomerView.print(dto);
			} 	
				break;
			case 3:
				// 고객 추가
				
				break;
			case 4: {
				// 고객 삭제
				System.out.print("삭제할 id 입력: ");
				int no = Integer.parseInt(sc.nextLine());
				int cnt = dao.deleteById(no);
				System.out.println("삭제한 id=" + no + "수: " + cnt);
			} 	
				break;
			default:
			} break;
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
