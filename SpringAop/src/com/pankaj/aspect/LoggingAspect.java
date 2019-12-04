package com.pankaj.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.pankaj.model.Circle;

@Aspect
public class LoggingAspect {
	
	@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint joinPoint) {
		
		
	}
	
	@AfterReturning("args(name)")
	public void stringArgumentMethods(String name) {
		System.out.println("A method that takes String arguments has been called .The value is " + name);
	}
	
	@AfterThrowing("args(name)")
	public void exceptionAdvice(String name) {
		
		System.out.println("An exception has been thrown .");
	}
	/*@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second advice executed");
	}*/
	
	@Pointcut("execution(public * get*(..))")
	public void allGetters() {}

	@Pointcut("within(com.pankaj.model.Circle)")
	public void allCircleMethods() {
		
	}
}
