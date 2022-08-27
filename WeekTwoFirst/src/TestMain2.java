
class X {

	void test() {
		System.out.println("test method");
	}

	void test(int i) {
		System.out.println("test with i");
	}
}

class Y extends X {
	void test1() {
		System.out.println("test1 method in y");
	}

	void test(int i, int j) {
		System.out.println("test overlaoded with two arg");
	}
}

public class TestMain2 {

	public static void main(String[] args) {

		X x = new X();
		x.test();
		Y y = new Y();
		y.test();
		y.test1();
		y.test(10, 20);
	}

}
