package Module7;
import java.io.File;
import java.io.IOException;
public class CreateFileDemo {
public static void main(String[]args) {
	try {
		File file = new File("MyFile.txt");
		if(file.createNewFile()) {
			System.out.println("File Created Successfully");
		}else {
			System.out.println("File already Exist");
		}
	}
	
	catch(IOException e){
		System.out.println("Error Creating a File");
	}
	
}
}
