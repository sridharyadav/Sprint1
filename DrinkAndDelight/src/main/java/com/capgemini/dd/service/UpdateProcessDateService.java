package com.capgemini.dd.service;

import java.time.LocalDate;
import org.apache.commons.lang3.StringUtils;


import com.capgemini.dd.dao.UpdateProcessDateDao;



public class UpdateProcessDateService  {
	
	public static String service(String s,LocalDate processDate){
		
//		boolean flag=validate(s);
		String s1="A1";
		String s2="A2";
		String s3="A3";
		if(s.contentEquals(s1) || s.contentEquals(s2) || s.contentEquals(s3)) 
		{
			return UpdateProcessDateDao.date(s,processDate);
		}
		else {
			 return "not a valid String";
		}
		
	
	}
//	public boolean validate(String s) {
//		String sub=s.substring(0, 1);
//		String sub1=s.substring(1);
//		String ch="A";
//		boolean flag=false;
//		if(sub.contentEquals(ch)) {
//			boolean flag1=StringUtils.isNumeric(sub1);
//			if(flag1) {
//				int inum = Integer.parseInt(sub);
//				if(inum<4) {
//					flag=true;
//				}
//			}
//			
//			
//			
//		}
//		return flag;
//	}

}