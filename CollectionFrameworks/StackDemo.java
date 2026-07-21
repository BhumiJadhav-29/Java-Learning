package CollectionFrameworks;
import java.util.Stack;
public class StackDemo {
public static void main(String[]args) {
	Stack<String>Stack = new Stack<>();
	Stack.push("Java");
	Stack.push("Python");
	Stack.push("C++");
	System.out.println( Stack);
	System.out.println(Stack.pop());
	System.out.println( Stack);

	
}
}
