package com.excep;

public class Test3 {

	public static void main(String[] args)throws Exception {
		System.out.println("program starts");
		Test3 t = new Test3();
		try {
		t.test1();
		}catch(Exception e) {
			System.out.println("handled");
		}
		System.out.println("program ends");
	}

	void test1() throws Exception,ArithmeticException  {
		System.out.println("test 1 method starts");
		test2();

	}

	void test2() throws Exception {
		System.out.println("test 2 method starts");
		
		int i = 10 / 0;
		
	}

}
