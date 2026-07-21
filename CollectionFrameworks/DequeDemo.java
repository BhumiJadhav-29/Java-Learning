package CollectionFrameworks;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
public static void main(String[]args) {
	Deque<String>fruits = new ArrayDeque<>();
	
	fruits.addFirst("Apple");
	fruits.addLast("Banana");
	fruits.addFirst("Mango");
	System.out.println(fruits);
	System.out.println(fruits.removeLast());
	System.out.println(fruits);
	System.out.println(fruits.peekFirst());
}
}
