package All_Sorting_Algo;

import java.util.Arrays;

public class _268_Missing_Number_by_Cyclic_sort {

	public static void main(String[] args) {
		
//		Given an array nums containing n distinct
//		numbers in the range [0, n], return the only
//		number in the range that is missing from the array.
		
		
//		Input: nums = [0,1]
//		Output: 2
//		Explanation: n = 2 since there are 2 numbers, 
//		so all numbers are in the range [0,2]. 2 is the
//		missing number in the range since it does not appear in nums.
		
		int[] arr = {9,6,4,2,3,5,7,0,1};
		
		int i=0, n=arr.length;
		while(i<n) {
			int correctPosition = arr[i];
			if(arr[i]<arr.length && arr[i]!=arr[correctPosition]) {	 
				
//  small change "arr[i]<arr.length" <-- it means "N" is not there in array that is length of array
//	And    		  "arr[i]!=arr[cor]"	 <--- means there correct position is not equal "becz" we start here array from "0th" index
//	above line means all ele should have to be at there own ind means "5" should be at index 5 , "0" should be at index 0 and so on........
				
				int temp = arr[i];
				arr[i] = arr[correctPosition];
				arr[correctPosition] = temp;
			}else {
				i++;
			}
		}
		
//		------------------------------------------
		
		Arrays.sort(arr);	// <---- the whole sorting work can be done by this single line also amm
		
//		------------------------------------------
		
//		now above array is goan a be sorted
		
		for(int ind=0; ind<arr.length; ind++) {
			if(arr[ind]!=ind) {
//				return ind;
				System.out.println(ind);
			}
		}
//		case 2
		
//		return arr.length;
//		System.out.println(arr.length);
		
		
		
	}

}
