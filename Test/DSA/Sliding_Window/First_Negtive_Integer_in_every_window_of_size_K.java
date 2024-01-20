package Sliding_Window;

import java.util.ArrayList;
import java.util.Arrays;

public class First_Negtive_Integer_in_every_window_of_size_K {

	public static void main(String[] args) {
		
		
		
		int arr[] = {2,-5,-1,8,-2,9,-1,-30,-12,11};

		//		here we need to print 1st negative number within window size "3"
	
//		Ex o/t --> 	 -5, -5, -1, -2, -2, -1, -1, -30
		
		int n = arr.length;
		int k = 3;
		int i=0,j=0,sum=0,max = Integer.MIN_VALUE;
		ArrayList<Integer> ans = new ArrayList<>();
		while(j<n) {
			if((j-i+1)<k) {
				j++;
			}
			else if((j-i+1)==k) {
				int te = i;
				while(te<=j) {
					if(arr[te]<0) {
						ans.add(arr[te]);
						break;
					}
					te++;
				}
				i++;
				j++;
			}
		}System.out.println(ans);
		
	}
}
