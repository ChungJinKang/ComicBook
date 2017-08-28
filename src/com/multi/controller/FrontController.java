package com.multi.controller;

import java.util.HashMap;
import java.util.Map;

public class FrontController {

	public static void main(String[] args) {
		Map<String, Object> data = new HashMap<String, Object>();
		ControllerInterface ci = null;

		// ************************************** 아래 코드는 예시!! ************************************** //
		
		// 입력 받는 곳
		int input = 1;
		
		switch(input) {
		case 1:
			ci = new AdminController();
			//data.put("test1", "hello");
			break;
		case 2:
			ci = new ReservController();
			break;
		case 3:
			break;
			
		default:
				
		}
		ci.exec(data);
		
		System.out.println(data.get("test2"));
	}

}
