package CollectionFrameWorkInJava;

import java.util.*;
import java.util.PriorityQueue;


public class _2_2priorityQ {
	
//					########  we can create "Mean" and "Max" Heap by PriorityQueue  #######


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	Same As Queue
		 * 
		 *     ##########    PriorityQueue used Heap data structure  ######### 
		 *     
		 *     Priority Q does not maintain "indexing"  so we are not able to access the element by "Index"
		 * 
		 * To Add Element
		 * 	.add()
		 * 	.offer()
		 * 
		 * To Remove Element
		 * 	.remove()		<--- to remove Top most  element
		 * 	.remove(15)		<--- to remove specific  element
		 * 	.poll()
		 * 
		 * To view Top most element
		 * 	peek()
		 * 	element()
		 * 
		 * 
		 * */
	
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();		// here priority Q to small element  *** Mean Heap ***

		
//		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());	// here priority Q to big element *** Max Heap ***
		
		pq.add(4);
		pq.add(6);
		pq.add(2);
		pq.add(8);
		
		pq.offer(10);

		
//		System.out.println(pq);
		
//		pq.remove();		// remove top most element
//		pq.poll();			// remove top most element
		
		
//		System.out.println(pq.peek());		// return top most element			no error
//		System.out.println(pq.element());	// return top most element			get error if empty Q
		
		  
		System.out.println((pq));
		    
		
	}

	
}
