package Module7;
import java.io.File;
import java.io.FileNotFoundException;


public class DeleteFile {
	public static void main(String[]args) {
		
			
			File  file = new File("Notes.txt");
			if(file.delete()) {
				System.out.println("File Deleted");
			}else {
				System.out.println("File Not Deleted");
			}
			
		
	}		
	
}