package _1_Recursion;

public class subsequence_Recursion_without_ArrayList {
	
//	#### "subsequence" ####		--->	has order but "not continues"	
//		    O(2^n)		
/*					 			
* 		(2^n)-1 subsequence	created
* 
* 					"123" 
	
	1, 2, 3, {1, 2}, {2, 3}, {1, 3}, {1, 2, 3} 
*/

//	#### "Subarray" ####			Always "Continues" 
//		
//		n*(n+1)/2	subarray created
/*				
* 				[1, 2, 3, 4],
* 				
* 				The subarrays are
* 	 (1), (2), (3), (4), (1,2), (2,3), (3,4), (1,2,3), (2,3,4) and (1,2,3,4).
* 
*	------------------------------------------------------------------------- 	
* 	
* 	#### "Subarray" ####: It always should be in contiguous form.

	For example, lets take an array int arr=[10,20,30,40,50];
	
	  subarr=[10,20] //true
  	  subarr=[10,30] //false, because its not in contiguous form
      subarr=[40,50] //true
* 
	
	#### "subsequence" ####: which don't need to be in contiguous form but same order.

	For example, lets take an array int arr=[10,20,30,40,50];
	
	  subseq=[10,20]; //true
	  subseq=[10,30]; //true
	  subseq=[30,20]; //false, because order isn't maintained


	here belwo we find out #### "subsequence" ####:

 */
//------------------------------------------------------------------------------------------\


	public static void printArray(int arr[], int n) {
		System.out.print("[");
		for(int i=0; i<n; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println(" ]");
	}
	
	
	//ssarr[]  <-- subsequence array
		//ciss     <---  current index of subsequence
		//start      <---- current  index of array
		
//											  length     0                      0
	public static void printSubSeq(int arr[], int n, int start, int ssarr[], int ciss) {
		
		if(start>=n) {
			printArray(ssarr, ciss);
			return;
		}
	
		printSubSeq(arr, n, start+1, ssarr, ciss);
		ssarr[ciss] = arr[start];
		printSubSeq(arr, n, start+1, ssarr, ciss + 1);	// ciss + 1 

	}
	
	public static void main(String[] args) {
		
//		here belwo we find out #### "subsequence" ####:
		
		int arr[] = {1,2,2,3};
		int ssa[] = new int[3];
		
//		###########	How to create Subsequence ############
		
//		formula ---->   	(2^n)-1
		
//		Subsequence in "recursive"  way
		
		printSubSeq(arr, 3, 0, ssa, 0);
	}

}
