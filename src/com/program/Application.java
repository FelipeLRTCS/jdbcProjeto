package com.program;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Application{
	public static void main(String[] args) {

		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Department dept = new Department(2, null);
		
		
		List<Seller> seller = sellerDao.findByDepartment(2);
		
		System.out.println("finding all");
		
		seller = sellerDao.findAll();
		
		for(Seller s: seller) {
			System.out.println(s);
		}
		
		
		
	}
}