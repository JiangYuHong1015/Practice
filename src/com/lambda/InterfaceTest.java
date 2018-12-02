package com.lambda;

/**
 * Lambda特性，只能是接口里面只有一个特有的方法，才可以 ，可以在接口里面加上funtionalInterface注解，
 * 提示在此类中只能有一个特有的抽象方法，里面可以有object里面的方法 如toString equals
 */
@FunctionalInterface//函数形接口
public interface InterfaceTest {
	
	void TestLambda();
	
	

}
