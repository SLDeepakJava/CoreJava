package com.test;

public class Test7 {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 2 + ++i + ++i + i;
		
		//i = 10;11,12
		//j = 2 + 11 + 12 + 12
		
		System.out.println(i);
		System.out.println(j);
	}
	
}
