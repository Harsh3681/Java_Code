package Binary_Search;

import java.util.Arrays;

public class _33_Search_in_rotated_sorted_Array {
	public static void main(String args[]){
//		 int nums[] = {4,5,6,7,0,1,2},target=0;
//		 o/t = 4
		
//		int nums[] = {1} , target=0;
//		o/t = -1;
		
		int nums[] = {4,5,6,7,0,1,2}, target=0;
//		o/t = -1
		
		
//		Q) There is an integer array nums sorted in ascending order (with distinct values).
//		Here we assume the pivot point from which array is "rotated" i.e  "max" ele
//		let 4,5,6,7,0,1,2 here pivot is "7" becz it is max ele
		
//		Here so how will we find that "pivot"
//		when mid>(mid+1)		// when mid=7 then is here 7>0 that the "pivot"
//		Or
//		when mid<(mid1-1)		// when mid=0 then then is here 7<0  becz mid-1 = 7 and mid=0 that the "pivot"
		
		
		
		int start = 0, end = nums.length - 1;
	    while (start < end) {
	        int mid = (start + end) / 2;
	        if (nums[mid] > nums[end]) {  // eg. 3,4,5,6,1,2
	            if (target > nums[mid] || target <= nums[end]) {
	                start = mid + 1;
	            } else {
	                end = mid;
	            }
	        } else {  // eg. 5,6,1,2,3,4
	            if (target > nums[mid] && target <= nums[end]) {
	                start = mid + 1;
	            } else {
	                end = mid;
	            }
	        }
	    }
	    if (start == end && target != nums[start]) System.out.println(-1);
	    else System.out.println(start);
		
		
		
		
		
		 
	}
}
