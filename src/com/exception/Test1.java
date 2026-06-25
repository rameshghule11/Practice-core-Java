package com.exception;

public class Test1 {

	void fun() throws ArithmeticException{
		
		System.out.println(10/0);
	}
	
	public static void main(String[] args) {
		Test1 t1=new Test1();
		
		
		try {
			t1.fun();
		}catch(ArithmeticException a){
	System.out.println(a.getMessage());
		}
	}
}
