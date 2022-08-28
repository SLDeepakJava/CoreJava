package com.oops;
class X1 {
	void test1() {
		System.out.println("test1() implemented in x");
	}
}
class Y1 extends X1 {
	void test1() {
		System.out.println("test1() implemented in y");
	}
}
class Z1 extends Y1{
	void test1() {
		System.out.println("test1() implemented in z");
	}
}

class Start {
	
	static void execution(X1 y) {
		y.test1();
	}
}
public class RunTimePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X1 x = new X1();
		//x.test1();
		Y1 y = new Y1();
	//	y.test1();
		Z1 z = new Z1();
	//	z.test1();
		Start.execution(x);
		Start.execution(y);
		Start.execution(z);
		

	}

}
