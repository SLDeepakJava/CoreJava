package com.oops;

class Animal {
	void eat() {
		System.out.println("animal eat");
	}
	void sound() {
		System.out.println("sound animal");
	}
}
class Tiger extends Animal {
	void fastRunning() {
		System.out.println("running");
	}

	/*@Override
	void sound() {
		System.out.println("tiger sound");;
	}
	*/
	
}
public class PolyMain {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		a.sound();//sound animal
		System.out.println("---tiger details--");
		Tiger t = new Tiger();
		t.eat();
		t.sound();//tiger sound
		t.fastRunning();
		System.out.println("---upcasting--");
		Animal a1 = new Tiger(); // upcasting -- converting subclass objec to super class object 
		a1.eat();
		a1.sound();//sound animal
		//a1.fastRunning();
		
		Tiger t1 =(Tiger) a1;
		t1.fastRunning();
		
		
		
		//Tiger t1 = new Animal(); // direct downcasting -- direct downcating not allwoed in java only upcasted object
		//can be downcasted
		
		
	}

}
