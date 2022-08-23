

public class TypeCastTest2 {

	public static void main(String[] args) {

		double d = 123.456;
		byte b1 =(byte)(short)(int)d;
		System.out.println(b1);
		
		System.out.println("--------------");
		
		int a = 100;
		long b = a;
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
