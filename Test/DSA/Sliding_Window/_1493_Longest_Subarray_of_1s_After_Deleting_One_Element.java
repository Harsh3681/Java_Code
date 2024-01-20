package Sliding_Window;

public class _1493_Longest_Subarray_of_1s_After_Deleting_One_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Input: nums = [1,1,0,1]
//				Output: 3
//				Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
//				Example 2:
//
//		Input: nums = [0,1,1,1,0,1,1,0,1]
//				Output: 5
//				Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
//				Example 3:
//
//		Input: nums = [1,1,1]
//				Output: 2
//				Explanation: You must delete one element.
				
		
			int arr[] = { 1,1,1};			
			int ans=0,i=0,j=0,n=arr.length;
			int c0=0;
			while(j<n) {
				
				if(arr[j]==0) {
					c0+=1;
				}
				while(c0>1) {
					if(arr[i]==0) {
						c0--;
					}
					i++;
				}
				ans = Math.max(ans, j-i+1);
				
				j++;
			}
			System.out.println(ans-1);
		
		
	}

}
