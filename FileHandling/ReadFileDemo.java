package Module7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileDemo {
	public static void main(String[]args) {
		try {
			
			File  file = new File("Notes.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
			String data = sc.nextLine();
			System.out.println(data);
			
		}
			sc.close();
	}catch(FileNotFoundException e){
			System.out.println("File Not Found");
		}
}
	}
	


