package Sliding_Window;

import java.util.Arrays;

public class Reverse_the_Array_by_2_Pointer {

	public static void reverse(int arr[]) {
		int start=0;
		int end = arr.length-1;
		while(start<end) {
			swap(arr,start,end);
			start++;
			end--;
		}
	}
	
	public static void swap(int arr[],int ind1, int ind2) {
		int temp = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = temp;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,5,8,3,2,856};
		reverse(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
