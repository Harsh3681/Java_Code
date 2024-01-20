package Sliding_Window;

public class _209_Minimum_Size_Subarray_Sum {

	public static void main(String[] args) {
		
		
//		###### NOTE ##### 
//		Maximum Size Subarray Sum Already taken in Book just see it
		
//		Que -> Given an array of positive integers nums and a positive 
//		integer target, return the minimal length of a subarray whose 
//		sum is greater than or equal to target. If there is no such subarray, return 0 instead.
		
//		Input: target = 7, nums = [2,3,1,2,4,3]
//		Output: 2
//		Explanation: The subarray [4,3] has the minimal length under the problem constraint.
		
		int nums[] = {8,11,12,3,1,1,1,1};
		int target = 7;
		
//		here we need to find the "size of window"
		
		if(nums.length==0 || nums==null){
           System.out.println("0");
        }
        int i=0,j=0,sum=0,ans=Integer.MAX_VALUE,n=nums.length;

        while(j<n){
            sum+=nums[j++];
            while(sum>=target){
                ans = Math.min(ans,j-i);
                sum-=nums[i++];               
            }
        }
        System.out.println(ans == Integer.MAX_VALUE ? 0 : ans);
	}

}
