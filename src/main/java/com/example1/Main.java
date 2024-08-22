package com.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.service.TransactionService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ApplicationContext context = new AnnotationConfigApplicationContext
				               (com.example.config.AppConfig.class);
		 
		 
	     TransactionService transactionService = context.getBean(TransactionService.class);
	        
	     transactionService.makeTransaction("987321654", 10000.00);
		

	}

}
