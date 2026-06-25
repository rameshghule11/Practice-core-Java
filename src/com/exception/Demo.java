package com.exception;

public class Demo {

	 public static void main(String[] args) {
		
		 System.out.println("Hello My name is banti ");
		 System.out.println(10+10);
		 try {
		 System.out.println(10/0);
		 }catch(ArithmeticException e) {
			 System.out.println("we cant Divide by 0");
		 }
		 System.out.println("I am From pune ");
		 System.out.println("I am a Student ");
		 System.out.println("I like to play Video game And BGMI");
	}
}
