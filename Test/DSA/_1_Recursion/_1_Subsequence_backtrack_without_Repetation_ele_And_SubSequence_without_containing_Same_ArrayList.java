package _1_Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1_Subsequence_backtrack_without_Repetation_ele_And_SubSequence_without_containing_Same_ArrayList {
	
//	#### "subsequence" ####		--->	has order but "not continues"	
//    		O(2^n)		
/*					 			
* 		(2^n)-1 subsequence	created
* 
* 					"123" 

		1, 2, 3, {1, 2}, {2, 3}, {1, 3}, {1, 2, 3} 
*/

	
//			#### "Subarray" ####			Always "Continues" 
//
//			n*(n+1)/2	subarray created
/*				
* 				[1, 2, 3, 4],
* 				
* 				The subarrays are
* 	 (1), (2), (3), (4), (1,2), (2,3), (3,4), (1,2,3), (2,3,4) and (1,2,3,4).

//------------------------------------------------------------------------------------------\

	#### "Subarray" ####: It always should be in contiguous form.

	For example, lets take an array int arr=[10,20,30,40,50];
	
	  subarr=[10,20] //true
  	  subarr=[10,30] //false, because its not in contiguous form
      subarr=[40,50] //true
* 
	
	#### "subsequence" ####: which don't need to be in contiguous form but same order.
z
	For example, lets take an array int arr=[10,20,30,40,50];
	
	  subseq=[10,20]; //true
	  subseq=[10,30]; //true
	  subseq=[30,20]; //false, because order isn't maintained

 */

//------------------------------------------------------------------------------------------\


	 private static void backtrack(List<List<Integer>> ans, List<Integer> tempList, int [] nums, int start){
      
		 
		ans.add(new ArrayList<>(tempList));	// base case

        for(int i = start; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue; // skip duplicates
           
            tempList.add(nums[i]);	// else condition
             
            backtrack(ans, tempList, nums, i + 1); // until this step doesn't complete by recursion below not run
            
            tempList.remove(tempList.size() - 1);
        }
	  }
	 
	 public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();   // here we declered 2D Array
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
	 }
	 
//	 -----------------------------------------------------------------------------------------------
//	 "SubSet" Or "Subsequence" without repetition of "Same ArrayList"
	 
	 static ArrayList<List<Integer>>subSetIterative(int ar[]){
			Arrays.sort(ar);
			ArrayList<List<Integer>> outer = new ArrayList<>();
			
			outer.add(new ArrayList<>());
			
			for(int num : ar) {
				int n = outer.size();
				for(int i=0; i<n ;i++) {
					List<Integer> inner = new ArrayList<>(outer.get(i));
					inner.add(num);
					if(!outer.contains(inner)) {		// here we "prevent" "outer" ArrayList<> from getting add ele repeatedly
						outer.add(inner);
					}else { // otherwise eliminated remaining thing
						continue; // just continue
					}
				}
			}
			return outer;
		}
	 
//	 -----------------------------------------------------------------------------------------------

	public static void main(String[] args) {
		
//		here below we find out #### "subsequence" ####: ---> has order but "not continues"
	
//		(2^n) 		<-------That much subsequence created "if consider blank also"
//		(2^n) - 1	<------- "Without consider blank also"
		
        int ar[] = {1,2,3,2};	// here 2 will not consider becz of it's repetition and total generate "16" i.e (2^4)
//      int ar[] = {1,2,3};	// total generate "8" i.e (2^3)
        
        List<List<Integer>> an = new ArrayList<>();
        an =  subsets(ar); // function
        System.out.println("Total how many subset generated "+an.size());
        System.out.println(an);

        
//        for(List<Integer> obj:an){
//
//            List<Integer> temp = obj;
//
//            for(Integer job : temp){
//                System.out.print(job+" ");
//            }
//            System.out.println();
//        }
        
//        -------------------------------------------------------------------------------------
        
//   	 "SubSet" Or "Subsequence" without repetition of "Same ArrayList"
        System.out.println();
        System.out.println("SubSet Or Subsequence without repetition of Same ArrayList\nBut With Repetition Of ele in array in List like [1,2,2]");
        ArrayList<List<Integer>> ans  = new ArrayList<>();
		int ar1[] = {1,2,3,2};
		ans = subSetIterative(ar1);
		System.out.println(ans.size());
		System.out.println(ans);
	}
}
