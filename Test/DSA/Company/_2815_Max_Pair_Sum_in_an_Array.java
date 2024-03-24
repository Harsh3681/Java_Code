package Company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _2815_Max_Pair_Sum_in_an_Array {

	public static void main(String[] args) {
		
//		Below is an Quetion
		
//		Input: nums = [51,71,17,24,42]
//		Output: 88
//		Explanation: 
//		For i = 1 and j = 2, nums[i] and nums[j] have equal maximum digits with a pair sum of 71 + 17 = 88. 
//		For i = 3 and j = 4, nums[i] and nums[j] have equal maximum digits with a pair sum of 24 + 42 = 66.
//		It can be shown that there are no other pairs with equal maximum digits, so the answer is 88.
		
//		"equal maximum digits" means 71 and 17 have equal maximum digits is "7" like that
		
		int ar[] = {51,71,17,24,42};
		HashMap<Integer, List<Integer>> mp = new HashMap<>();
		int ans=-1;
		for(int i=0; i<ar.length; i++) {
//			int 
			int num = ar[i], max=0;
			while(num!=0) {
				max = Math.max(max, num%10);
				num/=10;
			}
			if(!mp.containsKey(max)) {
				mp.put(max, new ArrayList<>());
			}
			mp.get(max).add(ar[i]);
		}
		
		for(Map.Entry<Integer, List<Integer>> entry : mp.entrySet()) {
			entry.getValue().sort(Comparator.reverseOrder());
			if(entry.getValue().size()>=2) {
				ans= Math.max(ans, entry.getValue().get(0)+entry.getValue().get(1));
			}
		}
		
		System.out.println(ans);
		System.out.println(mp.entrySet());
		System.out.println("H");
		
		
		
	}

}
