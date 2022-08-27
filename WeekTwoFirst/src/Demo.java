
public class Demo {

	 static int i;
	
	Demo(){
		i++;	
	}
	public static void main(String[] args) {

		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		Demo d4 = new Demo();
		System.out.println("no of object created = " + i);
	}

}
