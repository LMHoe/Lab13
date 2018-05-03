package edu.handong.csee.java.lab13.prob5;

public class Prob4 {
	
	public static boolean equals(int[][]m1, int[][]m2) {
		int count =0;//new int
		if(m1.length!=m1.length)//if two array's length are different
			return false;//return false
		for (int i=0;i<m1.length;i++) {
			for(int j=0;j<m1[i].length;j++) {
				if(m1[i][j]!=m2[i][j])
					count++;//if two values are different add 1 to count
			}//do process for m1[i]'s length times
		}//do process for m1's length times
		if(count<=3)//if count value is less then 3
			return true;//return true
		else
			return false;//otherwise retrun false
	}

}
