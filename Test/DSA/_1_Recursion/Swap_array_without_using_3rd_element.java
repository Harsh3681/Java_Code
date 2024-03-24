package _1_Recursion;

import java.util.Arrays;

public class Swap_array_without_using_3rd_element {

	public static void swap(int[] arr, int i, int j) {
	    if (i != j) { // check if the indices are different
	    	
//	        arr[i] = arr[i] ^ arr[j]; // XOR the elements at indices i and j
//	        arr[j] = arr[i] ^ arr[j]; // XOR the result with the element at index j
//	        arr[i] = arr[i] ^ arr[j]; // XOR the result with the element at index i
	    	
//	    	Or used below
	    	
	    	arr[i] = arr[i] + arr[j];
			arr[j] = arr[i] - arr[j];
			arr[i] = arr[i] - arr[j];
	    }
	}
	public static void main(String[] args) {
	    int[] arr = {1, 2, 3, 4, 5};
	    int i = 2; // this are index
	    int j = 4;
	    System.out.println("Before swapping: " + Arrays.toString(arr));
	    swap(arr, i, j);
	    System.out.println("After swapping: " + Arrays.toString(arr));
	   
	}
}
