package All_Sorting_Algo;

import java.util.Arrays;
import java.util.Collections;

public class _5_Quick_sort {
	
//	Quick_sort  not stable sorting Algo
	
//	Time Complexity
	
//	Time Complexity				O(n log n)
//	Best Case					O(n log n)
//	Worst Case					O(n2) 
//	Space Complexity			O(1)

//	In Place	Yes	<-- because we are not making a any new array
	
//	Process to follow
	
//	1)	Choose the pivot element.
//	2)	Move the elements smaller than pivot in the left partition
//	3)	Move the elements greater than pivot to the right partition
//	4)	The partition index is discovered at the end
	
//	And always we need to put the "new pivot"
	
//	 Compare to "merge sort" <--- 	"merge sort" will goes upto "end" even if the Array is sorted
//		but "Quick sort" Not go , that is "Advantage"
	
//	 here we use partition logic
	
	static int partition(int arr[], int start, int end) {
		int pivot = arr[start];
		int temp;
		int count = 0;
		for(int i=start+1; i<=end; i++) {
			if(arr[i]<=pivot) {
				count++;
			}
		}
		
//		 we get count then we get "Actual" Place of "Pivot" element
		
		int PivotIndex = count + start;
//		Now place the "Pivot" element at correct position by swaping
		
		int temp = arr[PivotIndex];
		arr[PivotIndex] = arr[start];
		arr[start] = temp;
		
		int i =start, j =end;
												//	  	 0 1 2 3 4	<-----Index
		while(i<PivotIndex && j>PivotIndex) {	// means 2,15,6,1,8	<-----elements
												//		 i   p   j	<----- i pivot j
									//  "i" move -----> side 	side <------ this move "j"
			
			while(arr[i]<=pivot) {	// 1st case
				i++;
			}
			while(arr[j]>pivot) {	// 2nd case
				j--;
			}
			
//			if there not any case from above 2 then there is an some elements "less than" pivot are at right side and some elements "Greater than" pivot are at Left side side ex. 2,15,6,1,8 here pivot "6"	here 15 "greater" then pivot 1 "less" then pivot
			
//			we need to swap by checking below condition
			
			if(i<PivotIndex && j>PivotIndex) {
				int dummy = arr[i];
				arr[i] = arr[j];
				arr[j] = dummy;
				
				i++; 
				j--;		
			}	
		}
		
		return PivotIndex;
		
	}
	
	
	static void Quick_Sort_Recursion(int arr[], int start, int end) {	// it is nothing but the "first" and "last" position of array
		
		if(start>=end) {
			return;
		}
		
//		here we do "Partitioning" of the arrray
		int p = partition(arr,start, end);
		
		Quick_Sort_Recursion(arr, start, p-1);		// here p-1 is exclude
		Quick_Sort_Recursion(arr, p+1, end);	//  here p+1 is include
		
		



		
		
	}
	
	public static void main(String[] args) {
		
//		https://www.youtube.com/watch?v=sNaHN4tZmRk&list=PLDzeHZWIZsTryvtXdMr6rPh4IDexB5NIA&index=40
		
		int ar[] = {3,1,65,555,22,7,221,0,-22};
		int n = ar.length;
		Quick_Sort_Recursion(ar, 0, n-1);
		System.out.println(Arrays.toString(ar));
	}

}
