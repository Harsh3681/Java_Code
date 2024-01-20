package ArraysClass_And_CollectionsClass;

import java.util.*;

/*
 * 		by using "Collection Class" we can solve small problems like find min max
 * 		sort and lot of problem		from collection "FrameWork"
 */

public class Collection_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Integer arr[]= {2,3,5,7,8,2,55};
//		ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(arr));
		
		
//		Queue<Integer> a  = new PriorityQueue<>();		// Invalid
//		Deque<Integer> a  = new ArrayDeque<>();			// Invalid
		
//		Set<Integer> a = new HashSet<>();				// Invalid
//		Set<Integer> a = new LinkedHashSet<>();			// Invalid
		
//		SortedSet<Integer> a = new TreeSet<>();			// Invalid
		
		
//		Note #### This Below properties valid only for this 3 "List" wale data types 
		
		
//		ArrayList<Integer> a = new ArrayList<>();			// valid
		LinkedList<Integer> a = new LinkedList<>();			// valid
//		Stack<Integer> a = new Stack<>();					// valid
		
		a.add(6);
		a.add(59);
		a.add(4);
		a.add(9);
		a.add(9);
		a.add(9);
		a.add(5);
		a.add(1);
		a.add(66);

		
//		System.out.println(Collections.indexOfSubList());
		
		System.out.println("Binary Search "+Collections.binarySearch(a, 5));
//		System.out.println("Min " + Collections.min(a));
//		System.out.println("Max " + Collections.max(a));
//		System.out.println(Collections.frequency(a,9));
		
//		Collections.fill(a, 0);		// fill list with all the 0s
		
//		System.out.println(Collections.emptyList());	// when we required empty list it return empty list also
//		System.out.println(Collections.emptySet());		// return empty set
		
//		Collections.sort(a, Collections.reverseOrder());		// descending order sort
//		Collections.sort(a);							// ascending order sort
//		
//		Collections.sort(a,Comparator.reverseOrder());
		
//		Collections.swap(a, 1, 3);		// swap the element of specific index with other index in array
//		
//		Collections.shuffle(a);			// it will shuffle the array for us random shuffle is done
		
//		Collections.rotate(a.subList(2, 9) , 3);		// +ve -ve both value allow (-ve) means from top -2 means index 2 from top, 
										// if (+ve) then index 2 from bottom  
										// "To move elements "backward", use a "positiveshift" distance.
		
//		System.out.println(a);
//		Collections.replaceAll(a, 5, 500);		// replace old value with new one
		
		System.out.println(a);
		

		
	}

}
