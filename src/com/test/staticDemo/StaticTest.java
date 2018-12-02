/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.test.staticDemo;

public class StaticTest{
	
	public static int staticVar = 0;
	public int instanceVar = 0;
	
	public StaticTest(){
		staticVar++;
		instanceVar++;
		System.out.println("staticVar的值是：" + staticVar);
		System.out.println("instanceVar的值是：" + instanceVar);
		
	}
	
}

