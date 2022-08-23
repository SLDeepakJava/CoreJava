package com.one;

public class MathOperation {
	
	static int i =10;//static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int out = multMethod(20,20);
		//System.out.println("out put = " + out);
		
		int mul = addMethod(10,20);
		System.out.println(" add output = " + mul);
	}

	public static int addMethod(int i,int j) {
		
		int out = i + j;
		
		return out;
		
	}

	public static int multMethod(int k ,int l) {
		int mulout = k * l;
		return mulout;
	}

}
