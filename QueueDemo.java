package CollectionFrameworks;
import java.util.Queue;
import java.util.LinkedList;
public class QueueDemo {
	public static void main(String[]args) {
		Queue<String>queue = new LinkedList<>();
		queue.offer("Java");
		queue.offer("Python");
		queue.offer("C++");
		System.out.println(queue);
		System.out.println(queue.poll());
	System.out.println(queue);
	System.out.println(queue.peek());
	
	}
	
}
