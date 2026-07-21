package Module7;
import java.io.FileWriter;
import java.io.IOException;
public class AppendFileDemo {
	
	public static void main(String[]args) {
		try {
			FileWriter writer = new FileWriter("Notes.txt",true);
			writer.write("\n I am Learning File Handling.");
			
			writer.close();
			System.out.println("Data Written Succcessfully");
		}
		
		catch(Exception e){
			System.out.println("Error Writing a File");
		}
		
	}
	}

