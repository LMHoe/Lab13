package edu.handong.csee.java.lab13.prob6;

public class UpPoint implements CapitalPrint {//class UpPoint implements CapitalPrint
	
private int x,y;//new int
	
	UpPoint(int x, int y){
		
		this.x = x;//set x
		this.y = y;//set y
	}
	
	public String toString() {
		
		return "x: "+x+" y:"+y;//return string
	}

}
