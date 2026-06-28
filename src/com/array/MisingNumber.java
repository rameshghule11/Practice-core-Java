package com.array;

public class MisingNumber {

 public static void main(String[] args) {
	
	 int [] arr= {1,2,3,5};
	 
	 for(int i=0;i<arr.length-1;i++) {
		 if(arr[i+1]-arr[i] !=1) {
			 System.out.println("Missing No is:"+arr[i]+1);
		 }
		 
	 }
 }
}

