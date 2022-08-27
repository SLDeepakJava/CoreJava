
class Car {
	
	void milage() {
		System.out.println("milage method");
	}
}

class Indica extends Car { 
	
}
class Maruthi extends Car {
	
}
class Tesla extends Car{
	ElectricFeature electricFeature; //has-a
}

class ElectricFeature{
	void electricCar() {
		System.out.println("electric car");
	}
}

public class TestMainI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Indica in = new Indica();
		in.milage();
		Maruthi m = new Maruthi();
		m.milage();
		System.out.println("--tesla---");
		Tesla t = new Tesla();
		t.milage();
		t.electricFeature = new ElectricFeature();
		t.electricFeature.electricCar();

	}

}
