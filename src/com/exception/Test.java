package com.exception;

import java.util.Scanner;

public class Test {

	void chake() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Age...");
		int age =sc.nextInt();
		
		if(age <18) {
			
			throw new AgeNotValidException("Age Is Not Eligibale");
		}
		else {
			System.out.println("Eligible for Voting ");
		}
	}
	
	public static void main(String[] args) {
		
		Test t=new Test();
		try {
		t.chake();
		}catch(AgeNotValidException a) {
			
			System.out.println(a.getMessage());
		}
	}
}
