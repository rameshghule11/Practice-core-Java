package com.encpsulation1;

public class Main {

	public static void main(String[] args) {
		
	User u=new User();
	u.setId(101);
	u.setName("NOBITA");
	u.setPassword("@mruta1432");
	
	
	System.out.println(u.getId());
	System.out.println(u.getName());
	System.out.println(u.getPassword());
	}
}
