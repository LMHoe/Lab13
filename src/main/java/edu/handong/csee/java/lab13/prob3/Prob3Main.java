package edu.handong.csee.java.lab13.prob3;

import java.util.Scanner;

public class Prob3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n1, n2;//new doubles
		Scanner Key = new Scanner(System.in);//new scanner
		
		System.out.print("Enter radius: ");//print out instruction
		n1=Key.nextDouble();//get double
		Circle circle1 = new Circle(n1);//new circle with n1
		
		System.out.println("Radius: "+circle1.get_Radius());//print out radius value
		circle1.display();//print out information about circle1
		
		System.out.print("Enter length and width: ");//print out instruction
		n1=Key.nextDouble();//get double
		n2=Key.nextDouble();//get double
		Rectangle rect1 = new Rectangle(n1,n2);//new rectangle with n1 and n2
		
		System.out.println("Length: "+rect1.get_Length());//print out length value
		System.out.println("Width: "+rect1.get_Width());//print out width value
		rect1.display();//print out information about rectangle1
	}

}
