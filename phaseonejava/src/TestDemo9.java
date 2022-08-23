
public class TestDemo9 {

	int i=10;
	static int j=20;
	public static void main(String[] args) {
		System.out.println(j);
		int k=10;
	}
	
	static void test() {
		static int k=100;
		System.out.println(i);
		System.out.println(j);
	}
	
	void test2(){
		static int k =500;
		System.out.println(i);
		System.out.println(j);
	}

}
