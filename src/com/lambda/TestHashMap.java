package com.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		
		HashMap<List, List> mapList = new HashMap<List, List>();
		
		List<String>flightList = new ArrayList<String>();
		List<String>flightList2 = new ArrayList<String>();
		List<String>ticketPromotionList = new ArrayList<String>();
		List<String>ticketPromotionList2 = new ArrayList<String>();
		flightList.add("i");
		flightList.add("love");
		flightList.add("china");
		flightList2.add("china");
		ticketPromotionList.add("you");
		ticketPromotionList.add("like");
		ticketPromotionList.add("usa");
		ticketPromotionList.add("usa");
		ticketPromotionList.add("usa");
		ticketPromotionList2.add("usa");
		mapList.put(ticketPromotionList, flightList);
		mapList.put(ticketPromotionList2, flightList2);

		for(List list:mapList.keySet()){
			for(Object obj : list){
				String str = (String)obj;
				System.out.println(str);
			}
			List list2 = mapList.get(list);
			for(Object obj2 : list2){
				String str2 = (String)obj2;
				System.out.println(str2);
				
			}
		}
		
	
		

	}

}
