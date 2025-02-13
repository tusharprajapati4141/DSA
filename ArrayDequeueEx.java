package javacollection;

import java.util.ArrayDeque;

public class ArrayDequeueEx {

	public static void main(String[] args) {
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
	    queue.offer(14);
		queue.offerFirst(16);
		queue.offerLast(46);
		queue.offer(67);
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.peekFirst());
		System.out.println(queue.peekLast());
		queue.poll();//remove first element
		System.out.println(queue);
	}

}
