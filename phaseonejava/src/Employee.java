
public class Employee {

	int id;
	String name;

	
	Employee(int id,String name) { 
		this.id = id;
		this.name = name;
	}
	
	Employee(String name){
		this.name = name;
	}

	public static void main(String[] args) {

		
		Employee e2 = new Employee("Deepak");
		System.out.println(e2.name);
		
		
		Employee e = new Employee(10,"Deepak");

		System.out.println("employee id is " + e.id + " and employee name is =" + e.name);
		
		System.out.println("----------");
		
		Employee e1 = new Employee(20,"Raj");

		System.out.println("employee id is " + e1.id + " and employee name is =" + e1.name);
	}

}
