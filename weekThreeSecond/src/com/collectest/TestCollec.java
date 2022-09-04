package com.collectest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class TestCollec {

	public static void main(String[] args) {

		//collection --  this is interface
		//collections -- this is class
	//	List<String> list = new ArrayList<>();
	//	HashSet<String> set = new HashSet<>();
		LinkedHashSet set = new LinkedHashSet<>();
		set.add("Bagalore");
		set.add("Delhi");
		set.add("Mumbai");
		set.add("Cullcutta");
		set.add("Hyderabad");
		System.out.println(set);
	//	Collections.sort(set);
		System.out.println("-------");
	//	System.out.println(set);
		
		TreeSet ts = new TreeSet<>();
		ts.add("Bagalore");
		ts.add("Delhi");
		ts.add("Mumbai");
		ts.add("Cullcutta");
		ts.add("Hyderabad");
	//	System.out.println(ts);
		System.out.println("-------");
		
	//	System.out.println(ts.descendingSet());
	}

}
