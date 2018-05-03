package edu.handong.csee.java.lab13.prob5;

import java.util.Scanner;//import scanner

public class Prob5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2=0;//new int
		
		Prob4 prob = new Prob4();//import prob4
		
		Scanner keyboard = new Scanner(System.in);//get keyboard
		
		System.out.print("Enter row size(Masimun 5): ");//print out question
		n1 = keyboard.nextInt();//get value of n1
		
		System.out.print("Enter column size(Masimun 5): ");//print out question
		n2 = keyboard.nextInt();//get value of n2
		
		int[][] m1 = new int[n1][n2];//new array with n1, n2
		
		System.out.print("Enter row size(Masimun 5): ");//print out question
		n1 = keyboard.nextInt();//get value of n1
		
		System.out.print("Enter column size(Masimun 5): ");//print out question
		n2 = keyboard.nextInt();//get value of n2
		
		int[][] m2 = new int[n1][n2];//new array with n1, n2
		
		System.out.print("Enter List1: ");//print out question
		for(int i=0; i<m1.length;i++) {
			for(int j=0; j<m1[i].length;j++) {
				m1[i][j] = keyboard.nextInt();
			}
		}//get list1
		
		System.out.print("Enter List2: ");//print out question
		for(int i=0; i<m2.length;i++) {
			for(int j=0; j<m2[i].length;j++) {
				m2[i][j] = keyboard.nextInt();
			}
		}//get list2
		
		for(int i=0; i<m1.length;i++) {
			for(int j=0; j<m1[i].length;j++) {
				System.out.print(m1[i][j]+" ");
			}
			System.out.println();
		}//print out list1
		
		for(int i=0; i<m2.length;i++) {
			for(int j=0; j<m2[i].length;j++) {
				System.out.print(m2[i][j]+" ");
			}
			System.out.println();
		}//print out list 2
		
		System.out.println();//lint empty line
		
		if(prob.equals(m1,m2))
			System.out.println("The two arrays are approximately identical.");//print out if two lists are same
		else
			System.out.println("The two arrays are not identical.");//print out if two lises are not same


	}

}
