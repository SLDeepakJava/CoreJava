package com.files;

public class InnerClassTest {
	
	private String msg = "welcome to java";
	
	class Inner {
		
		void hello() {
			System.out.println(msg + " learning inner class");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClassTest obj = new InnerClassTest();
		InnerClassTest.Inner in = obj.new Inner();
		in.hello();
		
	}

}
