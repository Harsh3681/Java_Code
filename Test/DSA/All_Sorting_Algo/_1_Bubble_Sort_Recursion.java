package All_Sorting_Algo;

import java.util.Arrays;

public class _1_Bubble_Sort_Recursion {
	
	public static void Bubble(int arr[]) {
		int temp;
		
		// In Ascending Order
//		In descending order
		
		// bubble sort means to biggest elem asel tyala just Perfect jagewar takne Compare karun
		//		"arr.length-i-1"		<-- means now ignore that last place
		
		
//		Time Complexity		O(n2)		<--  when array is not already sorted
//		Best Case			O(n)			<--- when array is already sorted	
//		Worst Case			O(n2)			<--  when array is not already sorted
//		Space Complexity	O(1)
//		
		
//		Here "n" is no.of comparison
		
//		bubble sort also non as "Inplace Sorting Algo"
		
		
		//	###########  bubble Sort	############
		
// ithe apan "arr.length-i-1" ka used kro karan aapan bigger ele directly last la pohachawalela asto "Comparision" karun .
//		Mag tyala Comparision madhe parat include karaychi garajach nhi. hence "arr.length-i-1"
		
//		see below
		
//		Ex.	[5,3,4,1,2]
		
//		then 	   from 0th to 4th	[3,4,1,2,5]	sort on by one 
//		then 	   from 0th to 3rd	[3,4,1,2]
//		then 	   from 0th to 2nd	[3,1,2]
//		then 	   from 0th to 1st	[1,2]
//		so here we sort 0th index	[1]
//		so on...............
		

//				####### Optimal Approach for "Bubble Sort" #######
		
//		The "issue" with previous algorithm was that it will always run all passes and iterations. Even if the arrays are already sorted, nearly sorted or not sorted
//		We can solve the above issue by bringing another boolean variable called swapped.
//		If in any pass no swapping happens, it means the array has become sorted and we do not need to run any further passes.
		
//		boolean swapOrnot = false;
//		for(int i=0; i<=arr.length-1; i++) {
//			for(int j=0; j<arr.length-i-1; j++) {
//				if(arr[j]>arr[j+1]) {					//  "<"	sign	descending
//													//  ">"	sign	Ascending			
//					temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//					swapOrnot = true;
//				}
//			}
//			if(swapOrnot==false) {
//				break;
//			}
//		}
		
	}	
//-----------------------------------------------------------------------
		
//		$$$$$$$$$$$$$$ BY Recursion $$$$$$$$$$$
		
		//	Ex.	[5,3,4,1,2]
			
		//	then 	   from 0th to 4th	[3,4,1,2,5]	sort on by one 
		//	then 	   from 0th to 3rd	[3,4,1,2]
		//	then 	   from 0th to 2nd	[3,1,2]
		//	then 	   from 0th to 1st	[1,2]
		//	so here we sort 0th index	[1]
		//	so on...............
	
	public static void Bubble_Recursion(int arr[],int n) {
		int temp;
		if(n==0 || n==1) {
			return;
		}
		for(int i=0; i<n-1; i++) {
			if(arr[i]>arr[i+1]) {
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		Bubble_Recursion(arr,n-1);	// <----- Recursion
		
	}
	
	
	
	public static void main(String[] args) {
		int ar[] = {3,5,2,1,87,3,0};
		Bubble(ar);
		System.out.println(Arrays.toString(ar));
		
		Bubble_Recursion(ar,7);
		System.out.println(Arrays.toString(ar));
	}

}
