package com.oops;

public class Employee extends Object{

	int empId;
	String empName;

	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	
	
//Object class
	@Override
	public String toString() {
		return "Employee details [empId=" + empId + ", empName=" + empName + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(11,"Deepak");
		System.out.println(e);
	//	System.out.println(e.empId);
		//System.out.println(e.empName);



	}

}
