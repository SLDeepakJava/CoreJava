package com.oops;

interface I1 {

	final static  int i=10;
	default void test1() {
		System.out.println("test 1 logic");
	}
	void test2();

}

interface I2 {
	void test3();
}
interface I3 extends I2,I1{
	void test4();
}

class D {
	void test5() {
		System.out.println("test5 method in calss");
	}
}

abstract class A extends D implements I3{

	@Override
	public void test2() {
		System.out.println("test 2 method");
	}

}
class B extends A {

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println("test 3 mthod");
		
	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		
	}
	
}

public class IMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B a = new B();
		a.test1();
		a.test2();
		a.test3();
		a.test4();
		a.test5();
		//a.i = 100;
		System.out.println(I1.i);

	}

}
