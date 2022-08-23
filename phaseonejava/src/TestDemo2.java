
public class TestDemo2 {

	int i;
	int j;// non-static variable / instance variables
	static int k;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("static variable = " + k);//0
		System.out.println("obj 1 ------");
		TestDemo2 ref1 = new TestDemo2();
		ref1.k = 100;
		System.out.println("static variable using obj 1 = " + ref1.k);//100
		System.out.println("non-static first obj i = " + ref1.i);//0
	
		ref1.i = 10;
		System.out.println("non-static i after init= " + ref1.i);//10
		System.out.println("obj 2 -----");
		TestDemo2 ref2 = new TestDemo2();
		System.out.println("non-static second obj i = " + ref2.i);//0
		System.out.println("static variable  = " + ref2.k);//0
		ref2.k= 500;
		System.out.println(k); //500
		
		System.out.println("obj 3 ----- ");
		TestDemo2 ref3 = new TestDemo2();
		System.out.println("static variable  = " + ref3.k);//0

	}

	public void testMethod() {
		System.out.println("non-static method");
	}

}
