package edu.handong.csee.java.lab13.prob1;

public class InstanceOf {
	
	public static void WhatFriend(Friend friend) {
		
		if(friend instanceof ClassFriend)//find whether class friend or not
			((ClassFriend)friend).classFriend();
		else if(friend instanceof SchoolFriend)//find whether school friend or not
			((SchoolFriend)friend).schoolFriend();
		else
			friend.JustFriend();
	}

}
