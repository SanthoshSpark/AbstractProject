package com.abstractt.pll;

import com.abstractt.bll.Circle;
import com.abstractt.bll.Rectangle;
import com.abstractt.bll.Shape;
import com.abstractt.bll.Square;

public class TestShape {

	public static void main(String[] args) {
		//Shape s = new Shape();
		
		Shape s= new Circle(1); // base  class reference can hold derived class object
		
		s.findArea();
		s.findCircumference();
		
		System.out.println(s.getArea());
		System.out.println(s.getCircumference());
		System.out.println("\n***********************");
		
		s = new Rectangle(1, 1);
		
		s.findArea();
		s.findCircumference();
		
		System.out.println(s.getArea());
		System.out.println(s.getCircumference());
		
		System.out.println("\n***********************");
		
		s = new Square(1);
		
		s.findArea();
		s.findCircumference();
		
		System.out.println(s.getArea());
		System.out.println(s.getCircumference());
	}

}
