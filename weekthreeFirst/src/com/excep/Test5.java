package com.excep;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) throws Exception {

		System.out.println("program starts");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		if(age > 18) {
			System.out.println("allow user major");
		}else {
			//throw new Exception("he is a minor");
			throw new MinorException("He is a minor");
		}
		System.out.println("program ends");
		
		
	}

}
