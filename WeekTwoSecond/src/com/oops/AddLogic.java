package com.oops;

public class AddLogic {

	void add(int i,int j) {
		int out = i+j;
		System.out.println(out);
	}
	
	void add(int i,int j,int k) {
		int out = i+j+k;
		System.out.println(out);
	}
	
	public static void main(String[] args) {

		AddLogic al = new AddLogic();
		al.add(10, 20, 30);
		al.add(50, 60);
	}

}
