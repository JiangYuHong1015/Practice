package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamSample {
	
	private static void testPE(){
		
		List<Apple> apples = new ArrayList<Apple>();
		apples.add(new Apple());
		
		//所有fruits的子类
		List<? extends Fruits> fruits = apples;
		
		//PE :只能制造（获取数据），不能消费（创建数据）
		//fruits.add(new Apple());
		Fruits f1 = fruits.get(0);
		System.out.println(f1);
		
	}
	
	
	private static void testCS(){
		
		List<Fruits> fruits = new ArrayList<Fruits>();
		//？Apple的父类
		List<? super Apple> fruits_1 = fruits;
		
		//CS只能消费（写入数据），不方便制造
		
		fruits_1.add(new Apple());
		fruits_1.add(new RedApple());
		//fruits_1.add(new Banana());
		
		//不知道存入的数据到底是什么，只能一个个判断
		System.out.println(fruits_1.get(0) instanceof Apple);
	}
	
	public static void main(String[] args) {
		testPE();
		testCS();
		//testMap();
		//testFlatMap();
		//testReduce();
	}
	
	
	private static void testMap(){
		
		Stream<String> stream = Stream.of("i","love","you");
		stream.map(str->str.toUpperCase()).forEach(str->System.out.println(str));
	}
	
	private static void testFlatMap(){
		Stream <List<Integer>> stream = Stream.of(Arrays.asList(1,2),Arrays.asList(1,2,3));
		stream.flatMap(list->list.stream()).forEach(i->System.out.println(i));
	}
	
	private static void testReduce(){
		
		//找出最长的单词
		Stream<String> stream2 = Stream.of("i","love","you","too");
		Optional<String> longest = stream2.reduce((s1,s2)->s1.length()>s2.length()?s1:s2);
		System.out.println(longest.get());
		
		//求单词长度之和
		Stream<String> stream = Stream.of("i","love","you","too");
		Integer lengthSum  = stream.reduce(0,//初始值
				(sum,str)->sum+str.length(),//累加器
				(a,b)->a+b);//部分和拼接器，并行执行时才会用到
		
		System.out.println(lengthSum);
				
		
	}

}
