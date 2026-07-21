package CollectionFrameworks;
import java.util.ArrayList;

public class Array1 {
public static void main(String[]args) {
	ArrayList<String> languages = new ArrayList<>();
	languages.add("Java");
	languages.add("Python");
	languages.add("C++");
	System.out.println(languages);
	System.out.println(languages.get(1));
	System.out.println(languages.size());
}
}
