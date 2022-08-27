import java.util.Scanner;

public class Employee {

	int empId;
	String empName;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empid");
		int eid = sc.nextInt();
		System.out.println("Enter employee name");
		String ename = sc.next();
		Employee emp = new Employee();
		
		emp.empId = 12;
		/*if(eid !=0) {
			emp.empId = eid;
		}else {
			System.out.println("emp id is invalid");
		}*/
		
		emp.empName = ename;

		System.out.println("emp id = " + emp.empId);
		System.out.println("emp name = "+emp.empName);

	}

}
