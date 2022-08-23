
public class TestDemo5 {

	TestDemo5() {
		this(10,20);
		System.out.println("no-arg constr");

	}

	TestDemo5(int i) {
		this();// this statement

		System.out.println("single arg constructor");
	}
	
	TestDemo5(int i,int j) {

		System.out.println("three arg constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo5 t = new TestDemo5(10);

	}

}
