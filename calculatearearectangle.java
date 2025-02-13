package com.tushar;

import java.awt.Rectangle;

public class calculatearearectangle {
	private double length;
	private double breadth;
	
	//constructor
	public calculatearearectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public double calculatearea(){
		return this.length*this.breadth;
	}

	public static void main(String[] args) {
         Rectangle rectangle = new Rectangle();
         
         double area = rectangle.calculatearea();
         System.out.println("Area of the Rectangle: "+area);
	}

}
