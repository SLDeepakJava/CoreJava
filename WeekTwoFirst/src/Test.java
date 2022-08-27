
public class Test {

	public static void main(String[] args) {

		int i = 10;
		int j = i++ + 2 + check(i);
		// i = 10,11
		// j = 10 + 2 + 11
		
		System.out.println("i value is = " + i);
		System.out.println("j value is = " + j);
		
	}
	//acessmodifier void methodName(){}
	static int check(int i) {
		return i++;
	}

}
