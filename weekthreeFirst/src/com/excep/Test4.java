package com.excep;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program starts");
		try {
			int i = 10/2;
			System.out.println("output ");
			try {
				///
			}catch(Exception e) {
				
			}
		System.exit(0);
		}catch (Exception e) {
			try {
				
			}catch(Exception e1) {
				
			}
			// TODO: handle exception
			System.out.println("handled");
		}
	
		finally {
			System.out.println("program ends");
		}
		
		
		try {
			System.out.println("try");
		}finally {
			System.out.println("finally");
		}

	}

}
