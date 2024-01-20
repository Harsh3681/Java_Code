package CollectionFrameWorkInJava;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.*;

// 		FIFO

		/*						|  Queue |
		 * 						----------
		 * 						  /    \
	   			   	   __________/_    _\_______________
		 * 			   | LinkList |	   | PriorityQueue |
		 * 
		 * 	
		 * 		As the Q is an "Interface" , it cannot be instantiated . we need some concrete classes to implement the 
		 * 		functionality of the queue interface. 2 classes are implement queue interface i.e 
		 * 		1) LinkedList
		 * 		2) PriorityQueue 
		 * 		3) ArrayDeque
		 * 
		 * 		Ex.
		 * 		Queue<Integer> q = new LinkedList<>();
		 * 		Queue<Integer> q = new PriorityQueue<>();
		 * 		Queue<Integer> q = new ArrayDeque<>();
		 * 
		*/

public class _2_11Queue_ {
	
//		Queue<Integer> Q = new Queue<>();			// invalid
//		Queue<Integer> q = new Stack<>();			// invalid
		List<Integer> l = new LinkedList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Queue<Integer> Q = new ArrayDeque<>();		// Valid
//		Queue<Integer> q = new PriorityQueue<>();	// Valid
		
		Queue<Integer> q = new LinkedList<>();
		
		// linklist can implement all the method of "Queue" now
		
		//   ".offer" used to add element in the Queue
		//	".add" also be used
		
		// ".peek" show "top most" element in queue return "Null" if queue is empty
		// ".element" show "top most" element in queue show "exception" if queue is empty
		
		// ".poll" remove "top" element of Queue
		// ".remove"  It return an exception if queue is empty
		
		
		
		q.add(53);
		q.add(15);
		q.add(25);
		q.add(1);
	
		q.offer(50);	// "add" element in q *********
		
		System.out.println(q);
		System.out.println("peek "+ q.peek());	// ******	both return top most element
		
		q.remove();	// ."remove" specific element from list remove "53"
		
		
		q.remove(50);
		
		
		System.out.println(q.element());
		
		
		System.out.println(q.poll());	// ****** remove top element And "return it also"
		
		
		q.toArray();
		System.out.println(q);
		for(Integer h : q) {
			System.out.println(h+" ");
		}
		
		
	}

}
