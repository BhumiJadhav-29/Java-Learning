package CollectionFrameworks;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
public static void main(String[]args) {
	ArrayDeque<String> deque = new ArrayDeque<>();
	deque.offerFirst("Apple");
	deque.offerLast("Banana");
	deque.offerFirst("Mango");
	System.out.println(deque);
	System.out.println(deque.pollFirst());
	System.out.println(deque);
	System.out.println(deque.peekLast());
}
}
