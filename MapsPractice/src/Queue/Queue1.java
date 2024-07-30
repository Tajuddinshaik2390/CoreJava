package Queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
public static void main(String[] args) {
	Queue<Integer> q=new LinkedList<>();
	q.add(1);
	q.offer(2);
	q.offer(3);
	while(!q.isEmpty()) {
		System.out.println(q.poll());

			}
	
	
	
	
	
//	System.out.println(q.peek());
//	System.err.println(q.poll());
//	System.out.println(q);
//	//System.out.println(q.remove());
//	System.out.println(q.contains(2));

}
}
