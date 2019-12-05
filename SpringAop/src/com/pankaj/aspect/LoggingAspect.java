package com.pankaj.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


public class LoggingAspect {
	
	/*@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint joinPoint) {
		
		
	}
	
	@AfterReturning(pointcut = "args(name)",returning = "returnString")
	public void stringArgumentMethods(String name, String returnString) {
		System.out.println("A method that takes String arguments has been called .The value is " + name + "The output value is "+returnString);
	}
	
	@AfterThrowing(pointcut="args(name)", throwing = "ex")
	public void exceptionAdvice(String name,RuntimeException ex) {
		
		System.out.println("An exception has been thrown " + ex);
	}*/
	
	
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		
		Object returnValue = null;
		
		try {
			System.out.println("Before Advice .");
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("After returning .");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("After throwing .");
		}
		
		System.out.println("After finally . ");
		return returnValue;
		
		
	}
	/*@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second advice executed");
	}*/
	
	

	/*@Pointcut("within(com.pankaj.model.Circle)")
	public void allCircleMethods() {
		
	}*/
	
	public void loggingAdvice() {
		System.out.println("Logging from the advice");
	}
}
