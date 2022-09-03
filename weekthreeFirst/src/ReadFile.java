import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	usingFileFReader();
		
		File f = new File("New");
		f.mkdir();
		
		try {
			List<String> lines = Files.readAllLines(Paths.get("demo.txt"));
			
			Files.delete(Paths.get("demo.txt"));
	
			
			System.out.println(lines);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void usingFileFReader() {
		char[] in = new char[50];
		int size = 0;
		try {
			FileReader fr = new FileReader("demo.txt");
			try {
				size = fr.read(in);
				System.out.println("size of data == " + size);
				for(char c: in) {
					System.out.print(c);
				}
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
