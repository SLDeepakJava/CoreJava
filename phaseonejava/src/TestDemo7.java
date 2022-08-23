
public class TestDemo7 {

	int i;

	TestDemo7() {
		i = 10;
		System.out.println("construcotr");
	}

	public static void main(String[] args) {

		System.out.println("start");
		TestDemo7 t = new TestDemo7();
		System.out.println(t.i);
		TestDemo7 t1 = new TestDemo7();
		System.out.println(t1.i);

	}

}
