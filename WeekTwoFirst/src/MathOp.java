
public class MathOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		int j = 20;
		MathOp math = new MathOp();
		math.add(i, j);
		math.add(10, 10l);
		math.add(i, i, 10);
	}

	// method overloading
	void add(int i, int j) {
		int out = i + j;
		System.out.println("add two number = " + out);
	}

	void add(int i, long k) {
		long l = i + k;
		System.out.println("long");
	}

	void add(int i, int j, int k) {
		int out = i + j + k;
		System.out.println("add three number = " + out);
	}

}
