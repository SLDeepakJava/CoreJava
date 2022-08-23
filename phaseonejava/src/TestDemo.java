

public class TestDemo {

	public static int i = 10;
	private static int j = 20;
	 static int k = 30;
	
	public static void main(String[] args) {

		System.out.println(i);
		System.out.println(j);
		System.out.println(k);	
	}
}

 class Hello {
	 
	 public static void main(String[] args) {
		 System.out.println("hello class");
		 System.out.println(TestDemo.i);
		 System.out.println(TestDemo.j);
		 System.out.println(TestDemo.k);
	 }
	
	
}
