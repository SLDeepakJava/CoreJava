package com.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("start");
		File f = new File("demoFOS.txt");
	//	usingFileWriter(f);
		//usingBufferedWriter(f);
		//usingPintwriter(f);
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(f);
			fos.write("hello".getBytes());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("end");
	}

	private static void usingPintwriter(File f) {
		try {
			PrintWriter pw = new PrintWriter(f);
			pw.println("hello");
			pw.print("world");
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void usingBufferedWriter(File f) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(f);
			BufferedWriter bw= new BufferedWriter(fw);
			//bw.write("hello");
			bw.append("hello");
			bw.newLine();
			bw.append("world");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void usingFileWriter(File f) {
		try {
			FileWriter fw = new FileWriter(f);
			fw.write("hello\n");
			fw.write("world");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
