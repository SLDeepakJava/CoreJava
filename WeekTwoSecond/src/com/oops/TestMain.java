package com.oops;
 class A1 {
	static int i=10;
	final int j=100;
	 void test() {
		System.out.println("test a1");
	}
}
class B1 extends A1 {
	
	void test() {
		System.out.println("test b1");
	}
	
}
public class TestMain {

	public static void main(String[] args) {
		
		
		final A1 a1 = new A1();
		a1.i = 100;
		a1.test();
	//	a1 = new B1();
		
		

		A1 a = new A1();
		a.i = 100;
		//a.j = 500;
		System.out.println(A1.i);
		System.out.println(a.j);
		System.out.println("------");
		B1 b1 = new B1();
		b1.test();
	}

}
