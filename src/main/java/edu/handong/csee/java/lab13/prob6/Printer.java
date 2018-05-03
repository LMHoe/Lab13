package edu.handong.csee.java.lab13.prob6;

public class Printer {
	
	public static void print(Object object) {
		
		String str = object.toString();//change object to string
		if(object instanceof CapitalPrint)
			str = str.toUpperCase();//change string to capital letters
		System.out.println(str);//print out string
	}

}
