package collectionframework;

import java.util.LinkedList;

public class queue {
	public static void main(String[] args) {
		LinkedList q = new LinkedList();
		q.offer("ram");
		q.offer("shyam");
		q.offer("vijay");
		q.offer("mohan");
		q.offer("ajay");
		q.offer("shaileder");
		
		
		
		
		
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q);
		
		
	}

}
