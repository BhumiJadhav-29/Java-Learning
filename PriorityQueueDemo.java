package CollectionFrameworks;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
public class PriorityQueueDemo {
	public static void main(String[]args) {
	PriorityQueue<Integer> pq = new PriorityQueue<>();

	pq.offer(40);
	pq.offer(15);
	pq.offer(25);

	System.out.println(pq.peek());

	System.out.println(pq.poll());

	System.out.println(pq.peek());
}
}
