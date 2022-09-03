package com.files;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("start");
		//create a file
		File f = new File("/home/projectjava52gm/test1.txt");
		//f.delete();
		System.out.println("absolute path " + f.getAbsolutePath());
		System.out.println("name " + f.getName());
		try {
			f.createNewFile();
	
			System.out.println("file created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(f.exists()) {
			System.out.println("file exsits ");
		}else {
			System.out.println("file does not exist");
		}
		System.out.println("end");

	}

}
