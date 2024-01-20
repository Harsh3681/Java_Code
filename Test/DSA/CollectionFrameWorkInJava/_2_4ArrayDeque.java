package CollectionFrameWorkInJava;
import java.util.*;
import java.util.ArrayDeque;

public class _2_4ArrayDeque {

//	### NOTE ###	like "PriorityQueue"  "ArrayDequeu"		doesn't maintain "Indexing"
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Deque<Integer> ar = new ArrayDeque<>();			// valid
//		Queue<Integer> ae = new ArrayDeque<>();			// valid
		
		ArrayDeque<Integer> ad =  new ArrayDeque<>();
//		ad.add(5);			// add and offer add it at the "end"
//		ad.addLast(55);
//		ad.offer(6);
//		ad.offerLast(66);
//		ad.add(5);
//			
//		ad.offerFirst(33);
//		ad.addFirst(3);
//		
//		ad.push(100);		// add element at the top		last la taklela element nehami "top" jato

		
//		System.out.println(ad.peek());			// null
//		System.out.println(ad.element());		// error
//		System.out.println(ad.getFirst());
		
//		System.out.println(ad.poll());		// remove 1st element			null
//		System.out.println(ad.pop());		//  remove 1st element			error
//		System.out.println(ad.remove());	// same as above remove 1st element		error
		
		
//		ad.removeFirstOccurrence(5);
//		ad.removeLastOccurrence(5);
		
		System.out.println(ad);
		
		
		System.out.println(ad.contains(51));

	}

}
