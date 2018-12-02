package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UseStream {

	public static void main(String[] args) {
		
		testFilter();
		
		
		
		
	}
	
	public static void testFilter(){
		Stream<String> stream = Stream.of("i","love","china");
		
		stream.filter(str->str.length()>3).forEach(str->System.out.println(str));
		
	}
	
	
	public static void testList(){
		//list
		List<String> list = new ArrayList<String>();
		list.add("you");
		list.add("like");
		list.add("USA");
		list.stream().forEach(str->System.out.println(str));
	}

	
	public static void testArray(){
		//array
		String[] stringArray={"l","o","v","e"};
		
		Arrays.stream(stringArray).forEach(str->System.out.println(str));

	}
	
	public static void userStream(){
		Stream<String> stream =  Stream.of("i","love","china");
		stream.forEach(str->System.out.println(str));
	}
	
	
	
}
