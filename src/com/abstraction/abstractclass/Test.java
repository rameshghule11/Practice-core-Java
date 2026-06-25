package com.abstraction.abstractclass;

public class Test extends Student {

	void login() {
		System.out.println("Login Method");
	}
	
	void regester() {
		
		System.out.println("Regester Method ");
	}
	void work() {
		
		System.out.println("WOrkd methd ");
	}
	
	public static void main(String[] args) {
		
		Test t=new Test();
		t.login();
		t.regester();
		t.work();
	}
}
