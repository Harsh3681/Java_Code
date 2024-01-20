package All_Sorting_Algo;

import java.util.Arrays;


	//Merge Sort One of the Fasted technique from all sorting algo

		//Applications of Merge Sort:

		//Sorting large datasets: Merge sort is particularly well-suited for sorting large datasets due to its guaranteed worst-case time complexity of O(n log n).

		//External sorting: Merge sort is commonly used in external sorting, where the data to be sorted is too large to fit into memory.

		//Custom sorting: Merge sort can be adapted to handle different input distributions, such as partially sorted, nearly sorted, or completely unsorted data.



//				"For Merge Sort"
			
			//Time Complexity	Θ(n Log n)
			//Best Case			Ω(n Log n)
			//Worst Case		O(n Log n)
			//Space Complexity	O(n)

// NOTE - Until Array length is "become 1" we continue our work
//			thta's an base case of Algo


//		Merge Sort is better for "linked list", or unlike arrays where "continues Memory allocation happen"

public class _4_merge_sort {
	
	public static int[] Merge_Sort(int arr[]) {
		
//	 NOTE - Until Array length is "become 1" we continue our work
//	thta's an base case of Algo
		
		if(arr.length==1) {		// "Base Case"
			return arr;
		}
		int mid = arr.length/2;
		
		int left[] = Merge_Sort(Arrays.copyOfRange(arr, 0, mid));
		int right[] = Merge_Sort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left, right);
	}
	
	private static int[] merge(int[] first, int[] second) {
		int[] mix = new int[first.length + second.length];
		
		int i=0, j=0, k=0; // here "k" is pointer for new Array
		
		while(i<first.length && j<second.length) {	// if any of the array will "terminate" first
			if(first[i]<second[j]) {
				mix[k] = first[i];
				i++;
			}else {
				mix[k] = second[j];
				j++;
			}
			k++;
		}
		
//		 Here any one of the array is not completed
		while(i<first.length) {		// if "i" is not finish copy the remaining ele in "mix" array 
			mix[k] = first[i];
			i++;
			k++;
		}
		
		while(j<second.length) {
			mix[k] = second[j];		// if "j" is not finish copy the remaining ele in "mix" array 
			j++;
			k++;
		}
		
		return mix;
	}

	public static void main(String[] args) {
		
		
//		 Merge Sort One of the Fasted technique from all sorting algo
		
		int ar[] = {9,500,4,2,1,5,0,-3,1000,10};
		ar = Merge_Sort(ar);
		System.out.println(Arrays.toString(ar));
		
		
		
	}

}
