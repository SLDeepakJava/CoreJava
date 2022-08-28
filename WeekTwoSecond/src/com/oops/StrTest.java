package com.oops;

public class StrTest {

	public static void main(String[] args) {
                  //01234
		String s = "HelloWorld";
		System.out.println(s.length());
		System.out.println(s.charAt(4));
		System.out.println(s.substring(5));
		System.out.println(s.substring(0, 5));
		System.out.println(s.toUpperCase());
		
		System.out.println("------");
		
		String s1 = "spring";
		String s2 = s1 + "summer ";
		s1.concat("fall ");//springfall
		s2.concat(s1);//springsummerspring
		s1 += "winter ";
		System.out.println(s1 + " " + s2);//springwinter springsummer
		
		String ss = "Hello";//this is efficent way, 1 obejct 
		String sss = new String("Hello");// 2 object will be created
		
		System.out.println("----------");
		
		
		
		
		
	}

}
