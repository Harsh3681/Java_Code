package Data_Structure_Java;
import java.util.*;
import java.util.stream.Collectors;

public class SubArray {

//					"subsequence" 		TC --->		O(2^n)		subsequence may be contiguous or non continues
/*					 			
 * 														(2^n)-1			
 * 					"123" 
					not continues
					1, 2, 3, {1, 2}, {2, 3}, {1, 3}, {1, 2, 3} 
*/
	
//					Subarray			Always Continues 
//														n*(n+1)/2
	/*				
	 * 				[1, 2, 3, 4],
	 * 				continues
	 * 				The subarrays are (1), (2), (3), (4), (1,2), (2,3), (3,4), (1,2,3), (2,3,4) and (1,2,3,4).
	 */
	
	
//	------------------------------------------------------------------------------------------\
	
	
		// Array Sorted or Not
	// condition
	// size of arr 0 or 1 return "true"
	// if "last 2 element of array" is Sorted then "recursive call of function" 
	// else return "False"
	
	
	static boolean ArraySortedOrNot(int arr[], int n) {
		
		if(n==0 || n==1) {
			return true;
		}
		return arr[n-1] >= arr[n-2] && ArraySortedOrNot(arr, n-1);
		
	}
	
	
	
//	---------------------------------------------------------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//	###########	How to create SubArray ############
		
//		formula ---->	n*(n+1)/2
//		TC is ---->     O(n^3)
		
		int arr[] = {1,2,3,2,7,15};
//		int arr[] = {2, 2, 2, 3, 3, 3};
		int n = arr.length;
		
		int g[] = new int[n];
		for(int f=0; f<n;f++) {
			g[f] = arr[f];
		}
		Arrays.sort(g);
		System.out.println("Tell Sorted Or Not "+ArraySortedOrNot(arr,n));
		
		
//		---------------------------------------------------------
//				SubArray By ArrayList
		
		
		ArrayList<Integer> ak = (ArrayList<Integer>) Arrays.stream(g).boxed().collect(Collectors.toList());
//		
		for(int c=0; c<n; c++) {
			for(int j=c+1; j<=n; j++) {
				List<Integer> ls = ak.subList(c,j);			// subList give us an subList from given 2 index from to To  To<-- excluded
				for(int k=0; k<ls.size(); k++) {
					System.out.print(" "+ls.get(k));
				}
				System.out.println();
			}
		}
//		
	
		
		
//		---------------------------------------------------------
				
//		for(int i=0; i<n ;i++) {
////			int v = n-(i+1);
//			for(int j=i; j<n; j++) {
//				for(int k=i; k<=j; k++) {
//					System.out.print(" "+arr[k]);
//				}
//				System.out.println();
//			}
//			
//		}
		
		
//		##########  Sum of sub Array  ##########
		System.out.println("-------------------");
		int s=0;
		int d=7;
		for(int i=0; i<n ;i++) {
			for(int j=i; j<n; j++) {
				for(int k=i; k<=j; k++) {
					s+=arr[k];
				}
				System.out.print(i+ " --> "+ s);
				System.out.println();
				s = 0;
			}

		}
		
//		###########	How to create Subsequence ############
		
//		formula ---->   	(2^n)-1
		
//		Subsequence in "recursive"  way
		

//		Subsequece by "without recursion"
		
//		ArrayList<Integer> ar = new ArrayList<>();
//		Subsequence_without_Recursion(arr, 0, ak);
	
		
	}

}
