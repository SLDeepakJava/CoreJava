package com.excep;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program start");
		int[] array = new int[3];
		try {
			int i = 10 / 0;
			//array[7] = 3;
		}catch(ArithmeticException e) {
			
		}
		 catch(Exception ex) {
				System.out.println("exception handled");
			}
		System.out.println("program ends");

	}

}
