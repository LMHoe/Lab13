package edu.handong.csee.java.lab13.prob3;

public class Rectangle extends Shape {//rectangle extends shape
	
	private double width;//new double
	private double length;//new double
	
	public Rectangle(double length, double width) {
		
		this.length=length;//set length
		this.width=width;//set width
	}
	
	public double area() {
		
		return length*width;//calculate and return area of rectangle (length*width)
	}
	
	public double perimeter() {
		
		return 2.0*(length+width);//calculate and return perimeter of rectangle(2*(length+width))
	}
	
	public double get_Length() {
		
		return length;//return length
	}
	
	public double get_Width() {
		
		return width;//return width
	}

}
