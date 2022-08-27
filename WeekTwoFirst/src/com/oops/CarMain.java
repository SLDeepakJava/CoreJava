package com.oops;

abstract class Car {
	
	
	abstract void milege();//abstract 
}
class Maruthi extends Car{
	void milege() {
		System.out.println(" maruthi 30kmph milage");
	}
}
class Indica extends Car {
	void milege() {
		System.out.println("indica 40kmph milage");
	}
}

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maruthi m = new Maruthi();
		m.milege();
		System.out.println("---indica detail --");
		Indica in = new Indica();
		in.milege();
		

	}

}
