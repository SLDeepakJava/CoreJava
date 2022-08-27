
class A1 { // suepr class
	
	public void test() {
		System.out.println("test method");
	}
}
class B1 extends A1{ // sub class
	
	void test1() { // defined method
		System.out.println("test1 method");
	}
	
	
}
public class TestMain {

	public static void main(String[] args) {

		A1 a = new A1();
		a.test();//defined method
		B1 b = new B1();
		b.test1();//defined
		b.test();//inherited method
		
	}

}
