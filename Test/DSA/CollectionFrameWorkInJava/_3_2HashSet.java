package CollectionFrameWorkInJava;
import java.util.*;
import java.util.Set;


public class _3_2HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		set never maintain the ele according index so can't access any ele by "index"
		
//		 In hashSet All Operation Carry out in --->  O(1) means in "constant Time"  <--- time Complexity 
		
		Set<Integer> hs = new HashSet<>();
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
		
		
		
		System.out.println(hs);

	}

}
