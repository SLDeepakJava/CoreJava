package com.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmpWrite {

	public static void main(String[] args) {

		System.out.println("program starts");
		// TODO Auto-generated method stub
		Employee e1 = new Employee(11, "Deepak");
		Employee e2 = new Employee(22, "Rama");

		//serializeEmployeeObj(e1, e2);
		
		try {
			FileInputStream fis = new FileInputStream(new File("employee.ser"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee e = (Employee) ois.readObject();
			System.out.println(e);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("end");
		// usingFileWriter(e1, e2);

	}

	private static void serializeEmployeeObj(Employee e1, Employee e2) {
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("employee.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(e1);
			oos.writeObject(e2);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void usingFileWriter(Employee e1, Employee e2) {
		FileWriter fw;
		try {
			fw = new FileWriter(new File("employee.txt"));
			fw.write(e1.toString());
			fw.write(e2.toString());
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
