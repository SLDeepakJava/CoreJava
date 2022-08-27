class Animals {
	
	String name = "hello";
	void eat() {
		System.out.println("animal eat method");
	}

	void sound() {
		System.out.println("animal sound");
	}
	
}

class Dog extends Animals {
	void sound() {
		System.out.println("dog sound");
	}
	
}

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals a = new Animals();
		a.eat();
		a.sound();
		System.out.println(a.name);
		System.out.println("--dog details --");
		Dog d = new Dog();
		d.eat();
		d.sound();
		System.out.println(d.name);

	}

}
