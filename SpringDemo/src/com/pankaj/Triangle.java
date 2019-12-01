package com.pankaj;

public class Triangle {
	
	//private List<Point> points;
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	//private ApplicationContext context = null;
	
	
	
	public Point getPointA() {
		return pointA;
	}



	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}



	public Point getPointB() {
		return pointB;
	}



	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}



	public Point getPointC() {
		return pointC;
	}



	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}



	
	

	/*public List<Point> getPoints() {
		return points;
	}



	public void setPoints(List<Point> points) {
		this.points = points;
	}*/


	public void draw() {
		
		
			System.out.println("Point  A= ("+ pointA.getX() + " , " +pointA.getY() +")");
			System.out.println("Point  B= ("+ pointB.getX() + " , " +pointB.getY() +")");
			System.out.println("Point  C= ("+ pointC.getX() + " , " +pointC.getY() +")");
		
		
	}



	/*@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		
		this.context = context;
		
	}



	@Override
	public void setBeanName(String beanName) {
		
		System.out.println("The bean name is : "+ beanName);
		
	}*/



	
	/*
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("InitializeBean init method called for Triangle");
	 * 
	 * }
	 * 
	 * 
	 * 
	 * @Override public void destroy() throws Exception {
	 * System.out.println("DisposableBean destroy method called ");
	 * 
	 * }
	 * 
	 * 
	 * public void myInit() {
	 * 
	 * System.out.println("My init method called for Triangle"); }
	 * 
	 * public void cleanUp() {
	 * System.out.println("My destroy method called for Triangle"); }
	 */
}
