package Data_Structure_Java;

import java.util.ArrayList;

public class SubsequenceInteger {
	
	
		//	"subsequence" 		TC --->		O(2^n)		subsequence may be contiguous or non continues
			
		/*	
		 * 												(2^n)-1				
		* 					"123" 
			not continues
			1, 2, 3, {1, 2}, {2, 3}, {1, 3}, {1, 2, 3} 
		*/
		
		//	Subarray Always Continues 
				
//														n*(n+1)/2
/*				
* 				[1, 2, 3, 4],
* 				continues
* 				The subarrays are (1), (2), (3), (4), (1,2), (2,3), (3,4), (1,2,3), (2,3,4) and (1,2,3,4).
*/
	
		
	//	below subsequence code is By "Recursion"
		
	public static void printArray(int arr[], int n) {
		System.out.print("[");
		for(int i=0; i<n; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println(" ]");
		}
	//
	
	//ssarr[]  <-- subsequence array
	//ciss     <---  current index of subsequence
	//cia      <---- current  index of array
	
//											  length     0                      0
	public static void printSubSeq(int arr[], int n, int cia, int ssarr[], int ciss) {
	
		int sum=0;
		if(cia>=n) {
//			printArray(ssarr, ciss);
			return;
		}
	
		printSubSeq(arr, n, cia+1, ssarr, ciss);
		ssarr[ciss] = arr[cia];
		printSubSeq(arr, n, cia+1, ssarr, ciss+1);

	}
	
	//------------------------------------------------------------------------------------------\
	//		below subsequence code is By "With Recursion"
	
	public static ArrayList<Integer> Subsequence_without_Recursion(int arr[], int index, ArrayList<Integer> al) {
	
	//int arr[] = new arr.length[al.size()];
	
	if(index == arr.length) {
		if(al.size()>0) {
			Integer arr1[] = new Integer [al.size()];
			al.toArray(arr1);		// here we convert ArrayList To Array
			return al;
		}
	}
	
	else {
		
		al.add(arr[index]);
		
		// here we doesn't include the current index element
		System.out.println(Subsequence_without_Recursion(arr, index+1, al));
		
		al.remove(al.size()-1);
		
		// here we include the current index element
		Subsequence_without_Recursion(arr, index+1, al);
		
	}
	return al;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,17,7,3};
		int ssa[] = new int[4];
		
//		###########	How to create Subsequence ############
		
//		formula ---->   	(2^n)-1
		
//		Subsequence in "recursive"  way
		
//		printSubSeq(arr, 4, 0, ssa, 0);

//		Subsequece by "without recursion"
		
		
		
		ArrayList<Integer> ar = new ArrayList<>();
		Subsequence_without_Recursion(arr, 0, ar);
		
		
	
	}

}
