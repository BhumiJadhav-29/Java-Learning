package Module7;
import java.io.File;
import java.io.FileNotFoundException;


public class FileExistDemo {
	public static void main(String[]args) {
		try {
			
			File  file = new File("Notes.txt");
			if(file.exists()) {
				System.out.println("File Exists");
			}else {
				System.out.println("File Not Found");
			}
			
		
			
	}catch(Exception e){
			System.out.println("File Not Found");
		}
}
}
	
