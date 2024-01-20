package Company;

import java.util.ArrayList;
import java.util.Comparator;

public class Accenture_find_sum_of_2nd_largest_even_and_odd_position {

	public static void main(String[] args) {
		
		int ar[] = {3,2,1,7,5,4};
		int c=0,s=0;
		ArrayList<Integer> ans1 = new ArrayList<>();
		ArrayList<Integer> ans2 = new ArrayList<>();
		for(int i=0; i<ar.length; i++) {
			if(i%2==0) {
				ans1.add(ar[i]);
			}else {
				ans2.add(ar[i]);
			}
		}ans1.sort(Comparator.naturalOrder());ans2.sort(Comparator.naturalOrder());
		System.out.println((ans1.get(1)+ans2.get(1)));
	}

}
