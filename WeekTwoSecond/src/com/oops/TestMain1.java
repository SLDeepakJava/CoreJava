package com.oops;

public class TestMain1 {

	public static void main(String[] args) {

		String s = "abc";// string constant
		String s2 = s;
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		
		s = s.concat("def");
		System.out.println(s);//abcdef
		System.out.println(s==s2);//false
		s.concat("kool");
		System.out.println("------");
		System.out.println(s);//
		
		System.out.println("------");
		String s6 = "Hello";// string constant
		String s7 = new String("Hello"); // string non-constant
		System.out.println(s6==s7);
		System.out.println(s6.equals(s7));
		String s8 = "Hello";//string constant
		System.out.println(s6==s8);//
		String s9 = "kool";
		System.out.println(s8==s9);
		
		
		
	}

}
