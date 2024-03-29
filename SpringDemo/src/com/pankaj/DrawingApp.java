package com.pankaj;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("deprecation")
public class DrawingApp {

	public static void main(String[] args) {
		
		//Triangle triangle = new Triangle();
		
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		//Triangle triangle = (Triangle)factory.getBean("triangle");
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Shape shape = (Circle)context.getBean("circle");
		shape.draw();
		
		//System.out.println(context.getMessage("greetings", null, "Default greeting", null));
		
		

	}

}
