package com.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class MapTestRemove {

	
	public static void main(String[] args) {
		
		//testMapForeach();
		testReplaceAll();
		
	}
	
	
	public static void testMapForeach(){
		
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1, "i");
		map1.put(2, "love");
		map1.put(3, "china");
		
		for(Map.Entry<Integer, String> entry:map1.entrySet()){
			System.out.println("我是map1-->"+entry.getKey() + entry.getValue());
		}
		
		
		HashMap<Integer,String> map2 = new HashMap<Integer,String>();
		map2.put(1, "i");
		map2.put(2, "love");
		map2.put(3, "china");
		
		map2.forEach(new BiConsumer<Integer, String>() {


			@Override
			public void accept(Integer t, String u) {
				System.out.println("我是map2-->"+ t + u);
			}
		});
		
		HashMap<Integer,String> map3 = new HashMap<Integer,String>();
		map3.put(1, "i");
		map3.put(2, "love");
		map3.put(3, "china");
		
		map3.forEach((Integer t,String u)->System.out.println("我是map3-->"+ t + u));
		
		
	}
	
	
	public static void testReplaceAll(){
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1, "i");
		map1.put(2, "love");
		map1.put(3, "china");
		
		map1.replaceAll(new BiFunction<Integer, String, String>() {

			@Override
			public String apply(Integer t, String u) {
				// TODO Auto-generated method stub
				return u.toUpperCase();
			}
		});
		
		HashMap<Integer,String> map2 = new HashMap<Integer,String>();
		map2.put(1, "i");
		map2.put(2, "love");
		map2.put(3, "china");
		
		map2.replaceAll((Integer u,String t)->t.toUpperCase());
		map2.forEach((Integer u,String t) -> System.out.println("我是map3-->"+t));
		map1.forEach((Integer u,String t) -> System.out.println("我是map1-->"+t));
		
		
	}
}
