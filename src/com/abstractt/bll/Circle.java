package com.abstractt.bll;

public class Circle extends Shape {
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	
	@Override
	public void findArea() {
		double area = Math.PI * radius * radius;
		setArea(area);
	}
	
	@Override
	public void findCircumference() {
		double circum = 2 * Math.PI * radius;
		setCircumference(circum);
	}
}
