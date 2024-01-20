package CollectionFrameWorkInJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// 		LIFO

public class _1_2LinkedList {
	
	// Swap Function
    public static void swap(LinkedList<Integer> list,
                            int ele1, int ele2)
    {
  
        // Getting the positions of the elements
        int index1 = list.indexOf(ele1);
        int index2 = list.indexOf(ele2);
  
        // Returning if the element is not present in the
        // LinkedList
        if (index1 == -1 || index2 == -1) {
            return;
        }
  
        // Swapping the elements
        list.set(index1, ele2);
        list.set(index2, ele1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		#################     How To Swap The linked List  ##################
		
		  
        LinkedList<Integer> ll = new LinkedList<>();
        // Adding elements to Linked List
        ll.add(10);
        ll.add(11);
        ll.add(12);
        ll.add(13);
        ll.add(14);
        ll.add(15);
        Iterator h = ll.descendingIterator();		// for desceding order
        while(h.hasNext()) {
        	System.out.println(h.next());
        }

        Iterator p = ll.listIterator();		// for Ascending order
        while(p.hasNext()) {
        	System.out.println(p.next());
        }
        System.out.println("me");
        System.out.println(ll.subList(0, 2));
        	
//        ----------------------------------------------------
        
        // Elements to swap
        int element1 = 11;
        int element2 = 14;
  
        System.out.println("Linked List Before Swapping :-");
  
        for (int i : ll) {
            System.out.print(i + " ");
        }
  
        // Swapping the elements
        swap(ll, element1, element2);
        System.out.println();
        System.out.println();
  
        System.out.println("Linked List After Swapping :-");
  
        for (int i : ll) {
            System.out.print(i + " ");
        }
    
  
   
		
		
		
	//------------------------------------------------------------------------------------------------------------------------------	
		
		
		
		
		
		// here we can convert array to linked list also
		
		
		Integer[] studentsName = new Integer[5];
		studentsName[0] = 1;
		studentsName[1] = 2;
		studentsName[2] = 3;
		studentsName[3] = 4;
		studentsName[4] = 5;
		
		
		LinkedList<Integer> stud = new LinkedList<>(Arrays.asList(studentsName));
		
		System.out.println("\nBefor");
		
		System.out.println(stud);
		swap(stud,2,4);
		System.out.println(stud);
		
		//------------------------------------------------------------------------------------------------------------------------------	
		
		
		
		
		System.out.println("\n");
		LinkedList<String> stu = new LinkedList<>();			// creating ArrayList of String data Type
		
		System.out.println(stu);
		
		stu.add("Rammu");
		stu.add("RAj");
		stu.add("Dipak");
		stu.add("Akash");
		
		stu.add(2, "Zhiya");
		
//		stu.addFirst("a");
//		stu.addLast("z");
		
		stu.add("A");
		stu.add("B");
		stu.add("C");
		
//		System.out.println(stu.element());
		
		stu.offer("Last ele");
		
		stu.push("First ele");
		
		
		// 	************* IMP ************
		
		/*			.add()			// at the "end"
		 * 			.offer()	  // this both are add element at "end" of list
		 * 
		 * 			.push()		// add ele at "front" of list
		 * 			
		 * 	-----------------------------------------------------------	
		 * 			.remove() ;    remove 1st element of the list
		 * 			.poll() 	   remove first element of list
		 * 			.pop()		   remove 1st element		
		 * 	
		 * 	-----------------------------------------------------------	
		 * 			.peek() 	show the head of linklist not remove
		 * 			.get()
		 */
		
		
		// 1)  .addFirst();	add element at 1st of linklist
		// 2)  .addLast(); add element at 1st of linklist
			
		// 4)  .getFirst() return first element of list
		// 5)  .getLast() return Last element of list
		
//			    
		// 6)  .removeFirst()
		// 7)  .removLast() 
		// 8)  .clear()
		
		// ******* IMP ******* .push() insert the element at "Front" of the linklist
		// ******* IMP ******* .pop() remove the element at "Front" of the linklist
		
		
		// .offer()  insert the element at last
		// .offerFirst insert the element at first
		// .offerLast insert the element at last
		
		// 
		// .peekFirst()
		// .peekLast()
		
		// 
		// .pollFirst()
		// .pollLast()
		
		// 6) .element() show the element at head of the linklist
		
		// 7)  .removeFirstOccurrence()
		
		// 8)  .removeLastOccurrence()
		
		// 9)   .set(Index, Element) 
		
		
		// ***** IMP ****	   " .listIterator() " is used to iterate the list from given index to upto n-1 index
		
//		Iterator<String> it = stu.listIterator(5);
//		while(it.hasNext()) {
//			System.out.println("Itereator "+ it.next());
//		}
		
		
		// ***** IMP ****    ".descendingIterator()"	used to iterate a elements in reverse order
		
//		Iterator<String> it = stu.descendingIterator();
//		while(it.hasNext()) {
//			System.out.println("Itereator "+ it.next());
//		}
		
		
		
		
//		System.out.println(stu.element());
		
//		stu.push("aa");
//		stu.offer("ji");
//		stu.pop();
		
		
		
//		System.out.println(stu);
		for(int i=0; i<stu.size(); i++) {
			System.out.print(stu.get(i) + "--> ");
			if(i==(stu.size()-1)) {
				System.out.print("Null");
			}
		}
		
		System.out.println();
		
		stu.sort(Comparator.naturalOrder());
		for(int i=0; i<stu.size(); i++) {
			System.out.print(stu.get(i) + "--> ");
			if(i==(stu.size()-1)) {
				System.out.print("Null");
			}
		}
		
		System.out.println();
		
		stu.sort(Comparator.reverseOrder());
		for(int i=0; i<stu.size(); i++) {
			System.out.print(stu.get(i) + "--> ");
			if(i==(stu.size()-1)) {
				System.out.print("Null");
			}
		}
		
		System.out.println();
		
		
		
	}


}
