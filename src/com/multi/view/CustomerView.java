package com.multi.view;

import java.util.List;

import com.multi.model.CustomerDTO;

public class CustomerView {
	// 여러건 출력
	public static void print(List<CustomerDTO> list) {
		for(CustomerDTO dto : list) {
			System.out.println(list);
		}
	}
	// 한건 출력
	public static void print(CustomerDTO dto) {
		System.out.println(dto);
	}
	// msg 출력
	public static void print(String msg) {
		System.out.println(msg);
	}
}
