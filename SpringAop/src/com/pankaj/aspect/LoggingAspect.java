package com.pankaj.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.pankaj.model.Circle;

@Aspect
public class LoggingAspect {
	
	@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint joinPoint) {
		//System.out.println("Advice run . All circle Get method called .");
		System.out.println(joinPoint.toString());
		System.out.println(joinPoint.getTarget());
		
		Circle circle = (Circle)joinPoint.getTarget();
		
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
