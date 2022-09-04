package com.collectest;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add("hello");
		hs.add(10);
		hs.add(true);
		hs.add("hello");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.remove("hello"));
		System.out.println(hs.contains("hello"));
		System.out.println(hs);
		hs.clear();
		System.out.println(hs);
	
	}

}
