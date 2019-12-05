package com.pankaj.service;

import com.pankaj.aspect.LoggingAspect;
import com.pankaj.model.Circle;

public class ShapeServiceProxy extends ShapeService {

	public Circle getCircle() {
		new LoggingAspect().loggingAdvice();
		return super.getCircle();
	}
}
