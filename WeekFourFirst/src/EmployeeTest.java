import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp1 = new Employee(11, "Deepak");
		Employee emp2 = new Employee(01, "Albert");
		Employee emp3 = new Employee(33, "Camel");
		
		ArrayList<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		System.out.println(list);
		Collections.sort(list);
		//comparable and comparator
		System.out.println("----after soritng--");
		System.out.println(list);
	}

}
