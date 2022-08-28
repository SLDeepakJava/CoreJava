package com.oops;

public class TestStringMain {
	
	

	public static void main(String[] args) {
//string are immutable class
		String s = "Hello";
		String s1 = new String("Hello");
		System.out.println((s==s1)); // it will compare address
		System.out.println((s.equals(s1)));// it will compare the value
		
		s1 = s;
		System.out.println((s==s1));
		
		
	}

}
