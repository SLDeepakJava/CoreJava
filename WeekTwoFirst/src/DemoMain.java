class Animal {
	void eat() {
		System.out.println("eat animal");
	}
}
class Tiger extends Animal { // one level
	
}
class Lion extends Animal {// second level   // multi-level inhiritance
	
}

class Elephant extends Animal{
	Tusk tusk;
}

class Tusk {
	int noOfTusk = 2;
}
public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elephant e = new Elephant();
		e.eat();
		e.tusk = new Tusk();
		System.out.println(e.tusk.noOfTusk);

	}

}
