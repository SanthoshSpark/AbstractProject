package com.abstractt.bll;

public class Square extends Shape {
	private int side;
	
	public Square(int side) {
		this.side = side;
	}
	
	@Override
	public void findArea() {
		setArea(side * side);
	}

	@Override
	public void findCircumference() {
		setCircumference(4 * side);
	}

}
