package com.excep;

public class Test {

	public static void main(String[] args) {

		System.out.println("program start");
		int i = 10;
		try {
			int out = i / 0;
			System.out.println(out);
		}
		catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("exception handled");
		}

		System.out.println("program ends");
	}

}
