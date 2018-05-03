package edu.handong.csee.java.lab13.prob3;

public class Circle extends Shape {//circle extends shape
	
	private double radius;//new double
	
	public Circle(double r) {
		
		radius = r;//set radius
	}
	
	public double area() {
		
		return Math.PI + Math.pow(radius,2);//calculate and return area of circle with radius r(pi*r*r)
	}
	
	public double perimeter() {
		
		return 2.0*Math.PI*radius;//calculate and return perimeter of circle with radius r(2*pi*r)
	}
	
	public double get_Radius() {
		
		return radius;//return radius value
	}

}
