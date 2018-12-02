package com.lambda;

/**
 * 无参数的lambda无参数实现
 * @author Administrator
 *
 */
public class TestInterface {

	public static void main(String[] args) {

		Test();
	}
	
	
	public static void Test(){
	/*	new TestLambda(new InterfaceTest() {
			
			@Override
			public void TestLambda() {
				System.out.println("我是TestLambda2");
			}
		});*/
		
		/*new TestLambda(()->System.out.println("我是TestLambda3")).Test1();*/
		
		new InterfaceTest() {
			
			@Override
			public void TestLambda() {
				System.out.println("我是TestLambda2");
				
			}
		}.TestLambda();
		
		
		InterfaceTest interfaceTest = ()->{
			System.out.println("我是TestLambda3");
			System.out.println("我是TestLambda4");
		};
			
		interfaceTest.TestLambda();
		
		
	
		
	}

}
