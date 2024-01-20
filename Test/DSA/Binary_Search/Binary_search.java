package Binary_Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Binary_search {

		//	$$$$$$$$$$$ NOTE $$$$$$$$$$$
		//	for binary Search Array Must Need in Sorted Order
	
	
	public static int binary_search(int arr[], int first, int last, int key) {
		
//	 Here we can able to find it is "Ascending Order" or "Descending Order" arr and apply Algo According
//			see below
		
		boolean AsOrDis = arr[first]<arr[last]; // if "AsOrDis" is "true" then "Ascending" otherwise "Descending"
		
		while(first<=last) {
			int mid = first + (last-first)/2; 	// its just same as (first + last)/2 	how look 
												// simple math 		 2*first + last - first / 2; ---> i.e  2*first-first = first 
												// i.e --->		    (first + last)/2
			// and why would we do that only because if sometime the "first" and "Last" value is greater it will exccessed "Integer" range that's why
			
			
//	 ### Note ###  Hint --> Ascending key> means at right side then "increase" left "i.e" "first" i.e "mid+1" vice versa		
			
//   ### Note ###  Hint --> Descending key> means at left side then "decrease" right "i.e" "last" i.e "mid-1" vice versa		
	
			
			if(arr[mid]==key) {
				return mid;
			}
			
			if(AsOrDis) {			// here for "Ascending"
				if(arr[mid]<key) {
					return binary_search(arr,mid+1,last,key);
//					OR
//					first = mid+1;
				}
				else {
					return binary_search(arr,first,mid-1,key);	
//					OR
//					last = mid-1;
				}
				
			}else {						// here for "Descending"
				if(arr[mid]<key) {
					return binary_search(arr,first,mid-1,key);	// this for "descending Order"
//					OR
//					last = mid-1;
				}
				else {
					return binary_search(arr,mid+1,last,key);	// this for "descending Order"
//					OR
//					first = mid+1;
				}
			}
			
		}
		
		return -1;
		
	}
	
// -------------------------------------------------------------------------
	
//	Binary Search By "Recursion"
	
	public static boolean bs_Recursion(int ar[], int s, int e, int k) {
		if(s>e) {
			return false;
		}
		int mid = s + (e-s)/2;
		if(ar[mid]==k) {
			System.out.println("Index "+mid);
			return true;
		}else if(ar[mid]<k) {
			return bs_Recursion(ar, s+1, e, k);
		}else {
			return bs_Recursion(ar, s, e-1, k);
		}
		
	}
	
	
	
	
//	--------------------------------------------------------------------------
	
	public static void main(String[] args) {
		
		
//		$$$$$$$$$$$ NOTE $$$$$$$$$$$
//		for binary Search Array Must Need in Sorted Order
		
		int arr[] = {5,7,7,8,8,10};		// here we must need to use the sorted array
		
//		int arr[] = {66,60,54,43,34,22,19,10,5,2,-2,-4,-10};	// descending Order
		
		int start = 0;
		int end = arr.length-1;
		
		int r = binary_search(arr,start,end,10);
		
		System.out.println("10 will be at index "+r);
		
		
		// new method to converting an array to arraylist
		
		ArrayList<Integer> ans = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		// new method to converting an "arraylist" to "array"
		
		Integer simpArray[] = new Integer[ans.size()];
		ans.toArray(simpArray);
		
		System.out.println("Me simple Array ");
		for(int i:simpArray) {
			System.out.print(i+" ");
		}
		
//		By In-build Function
		System.out.println("\nBy buildin Function");
		System.out.println(Collections.binarySearch(ans, 10));
//		System.out.println(ans);
		
		
		//  $$$$$$$$$$$$$$$$ by recursion  $$$$$$$$$$$$$$$$
		System.out.println(bs_Recursion(arr,0,arr.length-1, 10));
	}

}

