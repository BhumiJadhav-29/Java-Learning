package Module7;
import java.io.FileWriter;
import java.io.IOException;
public class WriteAndAppendDemo {
	
	public static void main(String[]args) {
		try {
			FileWriter writer1 = new FileWriter("Notes.txt");
			writer1.write("Java is Fun");
			writer1.close();
			
			FileWriter writer2 = new FileWriter("Notes.txt",true);
			writer2.write("\n I am Learning File Handling.");
			
			writer2.close();
			System.out.println("Data Written Successfully");
			
		}
		
		catch(IOException e){
			System.out.println("Error Writing a File");
		}
		
	}
	}

