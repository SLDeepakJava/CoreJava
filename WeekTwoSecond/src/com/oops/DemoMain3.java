package com.oops;

public class DemoMain3 {

	public static void main(String[] args) {

		String s = "Hello|Kool|Ok|Fine";
		String[] arr = s.split("\\|");
		for(String ss : arr) {
			System.out.println(ss);
		}
	}

}
