
package All_Sorting_Algo;

import java.util.Arrays;

public class _3_Selection_Sort {

	public static void Selection(int arr[]) {
		
//	 	###########  selection Sort	  ############
		
//			Here select the ele and put it on the correct index
//			This is done by "pickout" largest or smallest ele and put on correct ind
//	 		here sorting Done for one-one by elements at a time only 
//			one element get Sort 
		
		
		int temp;
		
//		space complexity = O(1)

//		Time Complexity  O(n^2)   <-- worst case time complexity

//		BestCase Complexity  O(n^2)	<--- Becz here it will finding always "Max" ele in array 

		for(int i=0; i<=arr.length-1; i++) {
			for(int j=i; j<=arr.length-1; j++) {
				int select = i;
				if(arr[select]>arr[j]) {		// to reverse order sort change ">" to "<"
					select = j;
				}
////			Here this statement execute definitely even if "if Statement" execute or not
				temp = arr[select];		
				arr[select] = arr[i];
				arr[i] = temp;
			}
		}
	}
	
	
//	--------------------------------------------------------------------------------------
	
// 	########### "Recursion" selection Sort	  ############ 

	
	 static void recurSelectionSort(int ar[], int row, int col,int max) { // here "max" is nothing but the "index" initial "0"
		 if(row==0) {
			 return;
		 }
		 if(col<row) {
			 if(ar[col]>ar[max]) {
				 recurSelectionSort(ar, row, col + 1 , col);
			 }else {
				 recurSelectionSort(ar, row, col + 1 , max);
			 }
		 } else {
			 int temp = ar[max];
			 ar[max] = ar[row-1];
			 ar[row-1] = temp;
			 recurSelectionSort(ar, row-1, 0, 0);
		 }
        
	 }
	
	 
	 
		
//		--------------------------------------------------------------------------------------

	public static void main(String[] args) {
		
//		https://www.youtube.com/watch?v=xWBP4lzkoyM
		
		int array[] = {2,4,-1,-3,5,9};
		Selection(array);
		System.out.println(Arrays.toString(array));
		
		
//		Kunal Kushwha Recursion
//		https://www.youtube.com/watch?v=ymgnIIclCF0&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=29
		
		recurSelectionSort(array, array.length, 0, 0);
		System.out.println(Arrays.toString(array));
		
		
	}

}
