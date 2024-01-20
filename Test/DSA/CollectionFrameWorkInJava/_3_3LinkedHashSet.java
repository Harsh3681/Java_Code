package CollectionFrameWorkInJava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class _3_3LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		set never maintain the ele according index so can't access any ele by "index"
//		Hence we used the new method "LinkedHashSet" which maintain the "index" maintain the order
//		And it all the properties of LinkedList
		
//		everything will be same only order maintain by linkedlist
		
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		hs.add(1);
		hs.add(16);
		hs.add(33);
		hs.add(14);
		hs.add(25);
		hs.add(13);
		
//		hs.add(13);	 cannot add one added element again
		
		hs.remove(14);
		
		
		
//		System.out.println(hs.isEmpty());
//		System.out.println(hs.size());
		
//		hs.clear();
		System.out.println();
		
		
		System.out.println(hs);

	}

}
