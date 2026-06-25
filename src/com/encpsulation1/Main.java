package com.encpsulation1;

public class Main {

	public static void main(String[] args) {
		
		User u=new User();
		u.setPassword("hello");
		u.setUserId(1);
		u.setUsername("Banti");
		
		
		System.out.println("Password: "+u.getPassword());
		System.out.println("UserId: "+u.getUserId());
		System.out.println("Username: "+u.getUsername());
	}
}
