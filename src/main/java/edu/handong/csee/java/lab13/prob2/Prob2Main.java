package edu.handong.csee.java.lab13.prob2;

public class Prob2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book = new Book("Simple Book");//new book
		Science science = new Science("Hello Physics!", "ScienceWorld");//new science with name and publisher
		History history1 = new History("What Is History", "E.H.Carr");//new history with name and author
		History history2 = new History("the History", "Jenny");//new history with name and author
		
		book.show();//show book's information
		science.show();//show science's information
		history1.show();//show history1's information
		history2.show();//show history2's information
	}

}
