package javacollection;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
//		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Comparator.reverseOrder());//reverse the array
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(12);
		queue.offer(72);
		queue.offer(34);
		queue.offer(64);
		queue.offer(4);// bye default minheap
		queue.offer(8);
		
		System.out.println(queue);
		queue.poll();//remove
		System.out.println(queue);
		System.out.println(queue.peek());//fifo displayed first value
	}

}
