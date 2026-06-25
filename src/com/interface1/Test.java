	package com.interface1;
	
	public interface Test {
	
		public abstract void login();
		
		void work();  //   Method in Interface bye default public & Abstract; 
	}
	
	 class Demo implements  Test{
		
		public   void login() {
			
			System.out.println("login Method");
		}
		
		public void  work() {
			
			System.out.println("Work Method ");
		}
		
		public static void main(String[] args) {
		
			Demo d=new Demo();
			d.login();
			d.work();	
		}
	}