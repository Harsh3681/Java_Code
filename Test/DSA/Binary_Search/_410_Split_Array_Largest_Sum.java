package Binary_Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _410_Split_Array_Largest_Sum {

	public static void main(String[] args) {
		
//		Given an integer array nums and an integer k, 
//		split nums into k non-empty subarrays such that
//		the largest sum of any subarray is "minimized" <--
//		Return the minimized largest sum of the split.
//		A subarray is a contiguous part of the array.
		
//		lets arr = [7,2,5,10,8]
		
//		so here meaning of question is 						### Largest ###	
//		[7,2,5,10] --> sum=	24		[8]	--> sum= 8			 		24
//		[7,2,5]	--> sum= 14		    [10,8]	--> sum= 18				18
//		[7,2] --> sum= 9			[5,10,8]	--> sum= 23			23
//		[7] --> sum= 7				[2,5,10,8]   --> sum= 25		30
		
//	 Among all this largest we need to find the "smallest" sum i.e	"18"
		ArrayList<Integer> ar = new ArrayList<>();
		int nums[] = {7,2,5,10,8}, k = 2;
		
		
//		This below solution work only when they give the "k" as 2
		
		int dumar[] = new int[nums.length];
		dumar = nums; // copy one array to another
		Arrays.sort(dumar);
		if(k==dumar.length) {
			System.out.println(dumar[dumar.length-1]);
		}
		int n=nums.length-1, ans1=0, ans2=0;
		for(int i=0; i<nums.length; i++) {
			for(int p=0; p<=i; p++) {
				ans1+=nums[p];
			}
			for(int j=i+1; j<=n; j++) {
				ans2+=nums[j];
			}
			ar.add(Math.max(ans2, ans1));
			ans1=0; ans2=0;
		}
		System.out.println(Collections.min(ar));
		
	}

}
