package com.pankaj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pankaj.service.FactoryService;
import com.pankaj.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		//ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
		FactoryService factoryService = new FactoryService();
		ShapeService shapeService = (ShapeService)factoryService.getBean("shapeService");
		shapeService.getCircle();
		//System.out.println(shapeService.getCircle().getName());

	}

}
