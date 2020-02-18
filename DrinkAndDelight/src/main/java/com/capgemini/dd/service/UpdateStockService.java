package com.capgemini.dd.service;

import java.time.LocalDate;

import com.capgemini.dd.dao.UpdateStockDao;

public class UpdateStockService {
	UpdateStockDao s=new UpdateStockDao();
	public String service(String s,LocalDate deliveryDate,LocalDate manufacture,LocalDate expiry){
		String result="";
	
			if(s.matches("A[1,2,3]//d")) {
				
				result= UpdateStockDao.date(s,deliveryDate,manufacture, expiry);
			}
			else {
				 result= "not a valid String";
			}
			
			
		
		
		
			
		
		
	
	return result;
	}
}


