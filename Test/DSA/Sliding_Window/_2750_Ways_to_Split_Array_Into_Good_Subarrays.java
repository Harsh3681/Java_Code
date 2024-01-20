package Sliding_Window;

import java.util.ArrayList;
import java.util.List;

public class _2750_Ways_to_Split_Array_Into_Good_Subarrays {

	public static void main(String[] args) {
		
//		You are given a binary array nums.
//		A subarray of an array is good if it contains exactly one element with the value 1.
//		Return an integer denoting the number of ways to split the array nums into good subarrays.
//		As the number may be too large, return it modulo 109 + 7.
//		A subarray is a contiguous non-empty sequence of elements within an array.
		
//		Input: nums = [0,1,0,0,1]
//		Output: 3
//		Explanation: There are 3 ways to split nums into good subarrays:
//		- [0,1] [0,0,1]
//		- [0,1,0] [0,1]
//		- [0,1,0,0] [1]
		
		  int nums[] = {0,1,1,1,0,0,1};
		  final int MOD = 1000000007;
		    
		  List<Integer> indexes = new ArrayList<>();
		  for(int i = 0; i < nums.length; i++) {
			  if(nums[i] == 1) indexes.add(i);
		  }
		  System.out.println("ind "+indexes);
		  if(indexes.size() == 0) {
			  System.out.println(0);
		  }
		  long ways = 1l;
		  for(int i = 0; i < indexes.size() - 1; i++) {
			  System.out.println("1st "+indexes.get(i+1));
			  System.out.println("2nd "+indexes.get(i));
			  int space = indexes.get(i+1) - indexes.get(i);
			  ways = (ways * space) % MOD;
		  }
		  System.out.println((int)ways);

	}

}
