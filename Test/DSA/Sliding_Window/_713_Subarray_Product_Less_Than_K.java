package Sliding_Window;

public class _713_Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
			
//		Input: nums = [10,5,2,6], k = 100
//		Output: 8
//		Explanation: The 8 subarrays that have product less than 100 are:
//		[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
//		Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
		
		
		int nums[] = {10,5,2,6};
		int k=100;
		
		boolean flag = false;
        int n = nums.length,l=0,r=0,c=0;
        long mul=1;
        for(; r<n; r++){
            
            mul*=nums[r];
            for(;mul>=k && l<=r;l++){ // here before ; means l=0
               System.out.println("me");
            	mul/=nums[l];
            }
            c+=(r-l+1);
            System.out.println(c);
        }
        System.out.println(c);
        
        
//        by while
        
//        int i=0,j=0,m=1,n=nums.length,k = 100,c=0;
//        while(j<n) {
//			m*=nums[j];
//			while(i<=j && m>=k) {
//				m/=nums[i];
//				i++;
//			}
//			c+=(j-i+1);
//			j++;
//		}System.out.println(c);
		
	}

}
