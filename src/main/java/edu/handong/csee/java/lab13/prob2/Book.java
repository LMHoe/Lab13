package edu.handong.csee.java.lab13.prob2;

public class Book {
	
	private static int idCount = 0;//new int
	private String BookName;//new string
	private int id;//new int
	
	public Book(String Name) {
		
		this.BookName = Name;//set BookName
		idCount++;//add idcount
		id = idCount;//set id as idCount
	}
	
	public String toString() {
	
		return "\n\tId: "+id+"\n\tBook Name: "+BookName;//return sting value		
	}
	
	public void show() {
		
		System.out.println("<<<BOOK>>>"+this.toString());//print out information
	}

}
