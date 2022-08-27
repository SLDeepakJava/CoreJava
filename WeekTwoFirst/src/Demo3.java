abstract class DD {
	void test() {
		System.out.println("test dd");
	}
	abstract void test1();
}
class EE extends DD{
	void test1() {
		System.out.println("test ee");
	}
}
class FF extends DD {
	void test1() {
		System.out.println("test ff");
	}
}
public class Demo3 {

	public static void main(String[] args) {

		EE e = new EE();
		e.test();
		e.test1();
		System.out.println("--- ff details--");
		FF f = new FF();
		f.test1();
		f.test();
	}

}
