package com.oops;

class Employee {
	
	String deptName;
	String companyName = "simplilearn";

	void empDept() {
		System.out.println("emp dept");
	}

	void empPersonalDetails() {
		System.out.println("emp personal details");
	}
}

class Deepak extends Employee{
	
	void empDept() {
		deptName = "programming";
		System.out.println("deepak working in programming dept");
	}
}

class Rama extends Employee {
	
	void empDept() {
		deptName = "script";
		System.out.println("rama working in script dept");
	}
}

public class EmployeeMain {

	public static void main(String[] args) {
		Deepak d = new Deepak();
		System.out.println(d.companyName);
		d.empDept();
		d.empPersonalDetails();
		System.out.println(d.deptName);
		System.out.println("----rama details--");
		Rama r = new Rama();
		r.empDept();
		r.empPersonalDetails();
		System.out.println(r.deptName);
	}

}
