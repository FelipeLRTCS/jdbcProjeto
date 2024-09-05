package com.program;

import com.entities.Department;

public class Application{
	public static void main(String[] args) {
		Department bk = new Department(1, "books");
		Department bk2 = new Department(1, "books");
		
		
		
		System.out.println(bk.equals(bk2));
	}
}