
public class TestDemo4 {

	{
		System.out.println("non-static block 1");
	}
	{
		System.out.println("non-static block 2");
	}

	public static void main(String[] args) {
		TestDemo4 t1 = new TestDemo4();
		System.out.println("----");
		TestDemo4 t2 = new TestDemo4();

	}

}
