package weekthreeFirst;
class Animal {
	
	void test1() {
		System.out.println("test 1 in animal class");
	}
}
class Tiger extends Animal { 
	
	void test2() {
		System.out.println("test 2 in tiger class");
	}
}
public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a.test1();
		Tiger t = new Tiger();
		t.test1();
		t.test2();
		System.out.println("-----");
		Animal a1 = new Tiger();//upcasting
		a1.test1();//
		Tiger t1 = (Tiger)a1;// downcasting
		t1.test2();
		
		

	}

}
