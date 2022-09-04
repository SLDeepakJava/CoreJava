package com.collectest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
//arraylist ,linkedlist,vector
		//add,retreive,delete,update,size
		
	//	List<Integer> list = new ArrayList<Integer>();
		
		//List list = new ArrayList();
	//	List list = new Vector();
		//List list = new LinkedList<>();
		
		LinkedList list = new LinkedList();
		
		list.add(12);
		list.add("hello");
		list.add(30.55);
		list.add(true);
		list.add(-1);
		list.add("hello");
		list.addFirst("first");
		list.addLast("last");
		
		System.out.println(list);
		System.out.println("size = " + list.size());
		System.out.println("is empty = " + list.isEmpty());
		System.out.println("retrieve hello valuye = " + list.get(1));
		System.out.println("delte an elemebt = " + list.remove("hello"));
		System.out.println(list);
		
		System.out.println("------using for each--");
		for(Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println("-- iterator---");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		
		
	}

}
