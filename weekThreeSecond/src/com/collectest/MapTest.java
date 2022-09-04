package com.collectest;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {

	//	Map m = new HashMap();
		HashMap<String,String> m = new HashMap<String,String>();
		m.put("11", "eleven");
		m.put("12", "twelve");
		m.put("13", "thirteen");
		m.put("14", "fourteen");
		m.put("12", "again tweleve");
		m.put("15", "eleven");
		m.put(null, "nullkey");
		m.put("16", null);
		System.out.println(m);
		System.out.println(m.get("14"));
		System.out.println(m.size());
		//m.clear();
		m.containsKey("16");
		
		for(Map.Entry<String,String> mm : m.entrySet()) {
			System.out.print(mm.getKey() + " ");
			System.out.print(mm.getValue());
			System.out.println("--");
		}
	}

}
