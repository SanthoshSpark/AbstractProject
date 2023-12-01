package com.abstractt.bll;

public class Rectangle extends Shape {
	private int length, width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public void findArea() {
		setArea(length * width);
		
	}

	@Override
	public void findCircumference() {
		setCircumference(2 * ( length + width));
		
	}

}
