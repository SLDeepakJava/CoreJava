
public class TestDemo1 {

	static int j;// static variable
	int k; // non-static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;//local variable
		System.out.println("local variable = " + i);// local variable
		System.out.println("static variable direct = " + j); // static variable direct access
		System.out.println("static variable using class name = " + TestDemo1.j);// static variable access using classname

		System.out.println("----------------");
		TestDemo1 deepakObject = new TestDemo1();// object ,instance
		
		System.out.println("non-static = " + deepakObject.k);
	}

}
