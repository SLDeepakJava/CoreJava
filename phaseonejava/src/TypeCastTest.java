

public class TypeCastTest {

	public static void main(String[] args) {

		int i = 10;
		double d = i; //auto widening
		System.out.println("int value = " + i);
		//sysou
		System.out.println("double value = " + d);
		System.out.println("----------------------");
		
		double d1 = 123.456;
		int i1 =(int) d1; // explicit narrowing
		System.out.println("double d1 value = " + d1);
		System.out.println("int i1 value = " + i1);
		
		
		
	}

}
