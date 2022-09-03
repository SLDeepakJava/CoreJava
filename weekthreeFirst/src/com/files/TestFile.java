package com.files;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = null;
		
		for(int i=0;i<10;i++) {
			try {
				f = new File("Files/"+"test"+i);
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
