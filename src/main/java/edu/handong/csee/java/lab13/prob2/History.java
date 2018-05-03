package edu.handong.csee.java.lab13.prob2;

public class History extends Book {//history extends book
	
	private String Author;//new string
	
	public History(String Name, String Author) {
		
		super(Name);//set name using class Book
		this.Author = Author;//set author
	}
	
	public String toString() {
		
		return super.toString()+"\n\tAuthor: "+Author;//return string
	}
	
	public void show() {
		
		System.out.println("<<<History>>>"+this.toString());//print out information
	}

}
