
public class TestDemo8 {

	int i;
	int j;
	
	TestDemo8(){
		System.out.println("default cons");
	}
	
	TestDemo8(int a){
		System.out.println("signle arg cosnt");
		i = a;
	}
	
	TestDemo8(int a, int b){
		System.out.println("two arg const");
		i = a;
		j = b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo8 t1 = new TestDemo8(150);
		System.out.println("i = " + t1.i);
		System.out.println("******");
		TestDemo8 t2 = new TestDemo8(200);
		System.out.println("i = " + t2.i);
		System.out.println("******");
		TestDemo8 t3 = new TestDemo8();
		System.out.println("i = " + t3.i);
		System.out.println("******");
		
		TestDemo8 t4 = new TestDemo8(10,20);
		System.out.println("i = " + t4.i);
		System.out.println("j = " + t4.j);
		System.out.println("******");
		
		

	}

}
