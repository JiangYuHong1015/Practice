package com.lambda;

public class TestLambda {
	
	private String name;
	private int age;
	private InterfaceTest interfaceTest;
	
	public void Test1(){
		System.out.println("我是TestLambda1");
	}



	public TestLambda(InterfaceTest interfaceTest){
		this.interfaceTest = interfaceTest;
	}
	
	public TestLambda( ){
	}
	
	
	
	public InterfaceTest getInterfaceTest() {
		return interfaceTest;
	}




	public void setInterfaceTest(InterfaceTest interfaceTest) {
		this.interfaceTest = interfaceTest;
	}



	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
