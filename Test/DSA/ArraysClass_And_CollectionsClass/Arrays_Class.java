package ArraysClass_And_CollectionsClass;

import java.util.*;
import java.util.Arrays;

/*
 * 			this ArraysClass generally used to perform the multiple
 * 			operation on our permeative "array" that is simple array
 */


public class Arrays_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,4,5,6,7,8,3,9};
		Arrays.sort(arr);		// T.C  = O(n log(n))  "Quicksort implementations."
		
//		"binary Search" by it
		int in = Arrays.binarySearch(arr, 3);
		System.out.println(in);
		
		
		int so[] = {4,9,1,7,3,79,2,4,66,55};
		
//		"Sort" Array by it
//		Arrays.sort(so);		// used "quick sort" in backend by default
		
		Arrays.asList(so);		// now it is in "List" format
		
//		Arrays.fill(so, 5);		// fill Specific element in array
		
//		System.out.println(Arrays.equals(so, arr));		// compare 2 array 
		
//		Arrays.fill(so, 3, 7, 0);		// fill the element in array from "specific range" here from index 3 to 7 we fill 0
		
//		Arrays.parallelSort(so); 	  // same as sort
		
		
		
		for(int i : so) {
			System.out.print(i+ " ");
		}
		
	}

}
