package All_Sorting_Algo;

import java.util.Arrays;

public class _2_Insertion_Sort {

			
		// ###########   Insertion sort   ###########
		
//		Worst Time Complexity  O(n^2)   <-- worst case time complexity
		
//		BestCase Complexity  O(n)	<--- Becz array already sorted
		
		// here we done sorting As Placing UnSorted elem in sorted array in Same Array
		
//	Ex.	[5,3,4,1,2]
//		so here we sort 0th index	[5]
//		then 	   from 0th to 1st	[5,3]
//		then 	   from 0th to 2nd	[5,3,4
//		then 	   from 0th to 3rd	[5,3,4,1]
//		then 	   from 0th to 4th	[5,3,4,1,2]	sort on by one 
//		so on...............
		
		
		
		
		public static void Insertion_Normal(int arr[]) {	
			for(int i=0; i<arr.length; i++) {
				for(int j=i; j>0; --j) {
					if(arr[j-1]>arr[j]) {
						int temp = arr[j-1];
						arr[j-1] = arr[j];
						arr[j] = temp;
					}else {
						break;
					}
				}
			}
		}
		
		public static void Insertion_Recursion(int arr[],int size) {
		
//		Or <-- $$$$$$$$$$$$$$$$$$$$$ OR $$$$$$$$$$$$$$$$$$$$$$
		
//							By "Recursion"
		
		
		if(size==0 || size==1) {
			return;
		}
		int i=size-1;			// just here we make small change
		int current  = arr[i];
		int j= i-1;
		
		while(j>=0 && arr[j]>=current) {	// to do "reverse" order sort change "arr[j]<=current" just "<="
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = current;

		Insertion_Recursion(arr,size-1);

		

		
//		Adv of " Insertion sort"
//		1)  Stable
//		2)  use for smllest value of N ==> beacz always "Array partially sorted"
//		3)  steps get reduce if array is "sorted" No.of swap reduced compare to "bubble sort"
	
		
		
		
		
	}

	public static void main(String[] args) {
		
//		https://www.youtube.com/watch?v=OGzPmgsI-pQ
		
		int array[] = {1,-2,5,2,-7,4,-1,3};

		Insertion_Normal(array);
		System.out.println(Arrays.toString(array));
		
		Insertion_Recursion(array,8);
		System.out.println(Arrays.toString(array));
	}

}
