package com.oops;

public class TestMain4 {

	public static void main(String[] args) {
		//ARRAYS
		int[] intArr = new int[4];
		int[] arr = {10,20,30,4};
		intArr[0]=10;
		intArr[1]=20;
		intArr[2]=30;
		intArr[3]=40;
		System.out.println(intArr);
		intArr[2] = 100;
		System.out.println(intArr[2]);
		
		System.out.println("---array iterate---");
		for(int i : intArr) {
			System.out.println(i);
		}
		System.out.println(intArr.length);
		
		String s ="Hello";
		System.out.println(s.length());
		

	}

}
