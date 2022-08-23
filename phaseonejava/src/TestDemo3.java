
public class TestDemo3 {

	static int i=100;
	int j = 20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo3 t1 = new TestDemo3();
		System.out.println(t1.i);//100
		t1.j = 600;
		System.out.println(t1.j);//600
		t1.i = 200;
		TestDemo3 t2 = new TestDemo3();
		System.out.println(t2.i);//200
		System.out.println(t2.j);//20
		
		

	}

}
