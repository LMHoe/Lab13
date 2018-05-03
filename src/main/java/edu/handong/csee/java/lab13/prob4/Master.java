package edu.handong.csee.java.lab13.prob4;

import java.util.Scanner;

public class Master {
	
	public void feed(Pet pet) {
		
		System.out.println("feed: "+pet.food());//print out which food to feed
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cat_name, dog_name;//new string
		
		Master master = new Master();//get master
		Cat cat = new Cat();//get cat
		Dog dog = new Dog();//get dog
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the cat name and dog name: ");//print out question
		cat_name = keyboard.next();//get cat's name
		dog_name = keyboard.next();//get dog's name
		
		cat.setName(cat_name);//set cat name
		cat.getName();//print out cat name
		master.feed(cat);//print out food to feed
		
		dog.setName(dog_name);//set dog name
		dog.getName();//print out dog name
		master.feed(dog);//print out food to feed
	}

}
