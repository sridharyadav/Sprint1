package com.capgemini.dd.ui;



import java.time.LocalDate;
import java.util.*;


import com.capgemini.dd.service.UpdateProcessDateService;
import com.capgemini.dd.service.UpdateStockService;


public class UpdateStockMain  {
	public static void main(String[] args) {
		UpdateStockService obj=new UpdateStockService();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter 1 for delivery && manufacture Date && expiry date ");
			System.out.println("enter 2 for process date ");
			System.out.println("enter 3 to break");
			int n=sc.nextInt();
			
			switch(n) {
			case 1:
				System.out.println("Enter a String as A1, A2,A3");  
				String s=sc.next();
				System.out.println("Enter manufactureDate ");  
				String manufacture=sc.next();
				LocalDate manufactureDate=LocalDate.parse(manufacture);
				System.out.println("Enter deliveryDate ");  
				String delivery=sc.next();
				LocalDate deliveryDate=LocalDate.parse(delivery);
				System.out.println("Enter expiryDate ");  
				String expiry =sc.next();
				LocalDate expiryDate=LocalDate.parse(expiry);
				String result=obj.service(s,deliveryDate,manufactureDate,expiryDate);
				System.out.println(result);
				
				
				continue;
				
			case 2:
				System.out.println("Enter a String as A1, A2,A3");
				String d=sc.next();
				System.out.println("Enter processDate ");  
				String process=sc.next();
				LocalDate processDate=LocalDate.parse(process);
				System.out.println(UpdateProcessDateService.service(d, processDate));
				
				continue;
			
			case 3:
				break;
				
			}
	
			break;
		
		
			
		}

	sc.close();
	}


	


}
