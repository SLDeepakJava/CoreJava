package com.oops;

class X {
	void test3() {
		System.out.println("test logic");
	}
}
//
class Y {
	void test3() {
		System.out.println("test3 logic");
	}
}

class Z extends X {
	void test2() {
		System.out.println("test2 logic");
	}
}

public class DemoMain {

	public static void main(String[] args) {
		X x = new X();
		//x.test1();
		System.out.println("-----");
		Y y =new Y();
		//y.test1();//inherited method
		y.test2();//defined method
	}

}
