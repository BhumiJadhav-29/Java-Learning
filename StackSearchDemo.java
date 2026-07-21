package CollectionFrameworks;

import java.util.Stack;

public class StackSearchDemo {
	public static void main(String[]args) {
		Stack<String>Stack = new Stack<>();
		Stack.push("Apple");
		Stack.push("Mango");
		Stack.push("Banana");
		System.out.println(Stack.search("Banana"));
		System.out.println(Stack.search("Oranges"));
	
	}
}
