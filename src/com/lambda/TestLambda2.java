package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 有参数的lambda的实现
 * @author Administrator
 *
 */
public class TestLambda2 {

	public static void main(String[] args) {
		//Test();
		TestLambda testLambda = new TestLambda();
		System.out.println(testLambda);
	
		
	}
	
	
	public static void Test(){
		List<String> list = new ArrayList<String>();
		list.add("i");
		list.add("love");
		list.add("china");
		
		Collections.sort(list,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				if(o1==null){
					return -1;
				}
				if(o2==null){
					return 1;
				}
				return o1.length()-o2.length();
			}
			
		});
		
		System.out.println(list.toString());
		
		List<String> list1 = new ArrayList<String>();
		list1.add("i");
		list1.add("love");
		list1.add("china");
		
		List<String> list2=Arrays.asList("i","love","china");
		
		Collections.sort(list1,(o1,o2)->{
			if(o1==null){
				return -1;
			}
			if(o2==null){
				return 1;
			}
			return 0;
		});
		System.out.println(list1.toString());
		
		
		
		
	}
	
	
	

}
