package CollectionFrameWorkInJava;
import java.util.*;
import java.util.Set;


public class _3_5TreeSet {

//	 "TreeSet" Extend From SortedSet therefore it will works in sorted form
//	and implement through BST
	
//	implement by "set"  = all element are "unique"
//	build by "BST"  = so element are in sorted form ascending
	
//	when we want are "unique" and also be in "sorted order" then we used "TreeSet"
//	remaining ALl is Same as "Set"
	
	
//	In TreeSet All operation Are carry out in O(Log n)  due to BST
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Set<Integer> s = new TreeSet<>();		// Valid
		
		SortedSet<Integer> ss = new TreeSet<>();
		
		ss.add(1);
		ss.add(16);
		ss.add(33);
		ss.add(14);
		ss.add(25);
		ss.add(13);
		ss.add(2);
		
//		ss.add(13);	 cannot add one added element again
		
		ss.remove(14);
		
//		System.out.println(ss.first());		// return 1st element in "set"
		
//		System.out.println(ss.last());		// return last element in "set"
		
//		System.out.println(ss.isEmpty());
//		System.out.println(ss.size());
		
//		ss.clear();
		
		System.out.println(ss);
		
		
		
		
		
	}

}
