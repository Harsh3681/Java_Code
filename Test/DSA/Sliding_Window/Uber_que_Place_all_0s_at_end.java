package Sliding_Window;

import java.util.Arrays;

public class Uber_que_Place_all_0s_at_end {

	public static void zero_at_end(int arr[],int n) {
		int left = 0, right = 0;
		while(right<n) {
			if(arr[right]!=0) {
//				here we swap left with right
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
			}
			right++;
		}
	}
	
	public static void main(String[] args) {
		
//		Here is que that we need to put all zeros at the end 
//		 so we used "2 pointer method" now
		
//		i/p = 0,1,0,3,12
//		o/t = 1,3,12,0,0
		
		int ar[] = {0,1,0,3,12}; // 1 ,3,12,0,0
		zero_at_end(ar,ar.length);
		System.out.println(Arrays.toString(ar));
	}

}
