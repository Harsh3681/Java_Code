package Binary_Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class _81_Search_in_Rotated_Sorted_Array_II {

	public static void main(String[] args) {
		
		int nums[] = {4,5,6,7,0,1,2}, target=0;
		
		int start = 0, end = nums.length - 1;
        while(start <= end) {
	        int mid = start + (end - start) / 2;
	        if(nums[mid] == target) {
//	        	return true;
	        	System.out.println(mid);
	        	break;
	        }
	        
	        //if there are duplicates
	        if(nums[start] == nums[mid] && nums[mid] == nums[end]) {
	            start ++;
	            end --;
	        }
	        
	        //left half is sorted
	        else if(nums[start] <= nums[mid]) {
	            if(target >= nums[start] && target <= nums[mid])
	            end = mid - 1;
	
	            else
	            start = mid + 1;
	        }
	
	        //right half is sorted
	        else {
	            if(target <= nums[end] && target >= nums[mid])
	            start = mid + 1;
	
	            else
	            end = mid - 1; 
	        }
        }
		
		
		
		
//        return false;
        
	}

}
