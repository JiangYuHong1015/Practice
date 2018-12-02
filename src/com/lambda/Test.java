package com.lambda;

public class Test {

	public static void main(String[] args) {
		
		noParamTest();
		
		

	}
	
	
	
	public static void noParamTest(){
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("before java8,");
				
			}
		}).start();
		
		new Thread(()->System.out.println("java8 special")).start();
	}
	
	

}
