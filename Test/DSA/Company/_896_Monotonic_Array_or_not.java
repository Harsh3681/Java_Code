
package Company;

public class _896_Monotonic_Array_or_not {
	
	 public static boolean isMonotonic(int[] nums) {
	        boolean inc = true;
	        boolean dec = true;

	        for(int i=0; i<nums.length-1; i++){
	            if(nums[i]>nums[i+1]){
	                inc = false;
	            }
	            if(nums[i]<nums[i+1]){
	                dec = false;
	            }
	        }
	        return inc || dec;
	 }
	public static void main(String[] args) {
		
//		https://leetcode.com/problems/monotonic-array/description/
		
//		The problem statement asks you to determine whether a given array nums is monotonic.
//		An array is considered monotonic if it is either monotone increasing or monotone decreasing.
//		
//		1. Monotone Increasing : An array is considered monotone increasing
//		if for all indices i and j where i <= j, the element at index i is less than or equal to
//		the element at index j. In other words, the values in the array are non-decreasing as you
//		move from left to right.
//
//		2. Monotone Decreasing : An array is considered monotone decreasing if for all indices i and j 
//		where i <= j, the element at index i is greater than or equal to the element at index j. 
//		In other words, the values in the array are non-increasing as you move from left to right.
		
//		Example 1:
//			Input: nums = [1,2,2,3]
//			Output: true

//			Example 2:
//			Input: nums = [6,5,4,4]
//			Output: true

//			Example 3:
//			Input: nums = [1,3,2]
//			Output: false
		
		int nums[] = {6,5,4,4};
		System.out.println(isMonotonic(nums));
		
	}

}
