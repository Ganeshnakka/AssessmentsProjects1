package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before("execution(* com.example.service.TransactionService.makeTransaction(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Starting transaction: " + joinPoint.getSignature());
    }

    @After("execution(* com.example.service.TransactionService.makeTransaction(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("Completed transaction: " + joinPoint.getSignature());
    }

}
