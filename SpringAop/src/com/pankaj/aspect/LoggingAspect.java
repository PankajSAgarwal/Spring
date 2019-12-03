package com.pankaj.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("allGetters() && allCircleMethods()")
	public void LoggingAdvice() {
		System.out.println("Advice run . All circle Get method called .");
	}
	
	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second advice executed");
	}
	
	@Pointcut("execution(public * get*(..))")
	public void allGetters() {}

	@Pointcut("within(com.pankaj.model.Circle)")
	public void allCircleMethods() {
		
	}
}
