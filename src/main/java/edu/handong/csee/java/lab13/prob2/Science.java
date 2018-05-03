package edu.handong.csee.java.lab13.prob2;

public class Science extends Book{//science extends book
	
	private String publisher;//new string
	
	public Science(String Name, String Publisher) {
		
		super(Name);//set name using class Book
		this.publisher = Publisher;//set publisher
	}
	
	public String toString() {
		
		return super.toString()+"\n\tPublisher: "+publisher;//return string
	}
	
	public void show() {
		
		System.out.println("<<<Science>>>"+this.toString());//print out information
	}


}
