package Math_For_DSA;

import java.util.ArrayList;
import java.util.Comparator;

public class Factors_of_num {
	
	public static void main(String[] args) {
		
//	T.C  =  O(n)		// we can make it more optimal	
		int n=20;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		
//  T.C  =  sqrt(n)	

//		to avoid the repetition we will reduce value
		
		ArrayList<Integer> ar = new ArrayList<>();
		for(int i=1; i<=Math.sqrt(n); i++) {
			if(n%i==0) {
				if(n/i==i) {		// here n/i means lets here num be 20 and 2*10 is 20 	so here we know 2 divide 20 also 5 divide 20 and here 2*5 is 20 so why would we wast our time in find extra for 5 also hence complete in 5 & 2 at same time
					ar.add(i);
				}else {
					ar.add(i);
					ar.add(n/i);		
				}
			}
		}
		
		ar.sort(Comparator.naturalOrder());
		System.out.println(ar);
		
		
	}

}
