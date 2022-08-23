package com.two;

import com.one.FirstTest;

public class SecondTest extends FirstTest{

	int ii;//non-static variable
	static int k;// static variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FirstTest.i);
		
		System.out.println(k);
		//System.out.println(ii);

	}

}
