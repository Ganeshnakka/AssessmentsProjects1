package com.example.service;

import org.springframework.stereotype.Service;


@Service
public class TransactionService {
	
	public void makeTransaction(String accountNumber, double amount) {
        // Implementation of transaction logic
        System.out.println("Transaction executed for account: " + accountNumber + " with amount: " + amount);
    }

}
