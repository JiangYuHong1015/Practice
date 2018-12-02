package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class ListTestRemove {

	public static void main(String[] args) {
		
		testRemove();

	}

	
	public static void testRemove(){
		/*List<String> list = Arrays.asList("i","love","china");*/
		//ArrayList<String> list = (ArrayList<String>) Arrays.asList("i","love");
		ArrayList<String> list = new ArrayList<String>();
		list.add("i");
		list.add("love");
		Iterator<String> inIterator = list.iterator();
		while(inIterator.hasNext()){
			if(inIterator.next().length() > 3){
				inIterator.remove();
			}
		}
		
		/*List<String> list1 = Arrays.asList("i","love","china");
		list1.removeIf(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.length() > 3;
			}
		});
		
		List<String> list2 = Arrays.asList("i","love","china");
		list2.removeIf(str->str.length()>3);
		*/
		
		
		
		
	}
}
