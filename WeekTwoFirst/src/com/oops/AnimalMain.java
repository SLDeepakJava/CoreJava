package com.oops;

abstract class Animal {
	Animal() {
		System.out.println("ANIMAL CONST");
	}

	// LEGS methods logic should be shared to all sub class
	// i want all the subclass to mandatorily provide their ownlogic for sound
	// method
	void legs() {
		System.out.println("4 legs");
	}

	abstract void sound();

	abstract void test();

}

class Tiger extends Animal {

	void sound() {
		System.out.println("tiger sound ");
	}

	@Override
	void test() {
		System.out.println("test in tiger class");
	}

}

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a;

		Tiger t = new Tiger();
		t.legs();
		t.sound();

	}

}
