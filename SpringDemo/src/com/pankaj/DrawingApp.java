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
		Shape shape = (Shape)context.getBean("circle");
		shape.draw();
		
		

	}

}
