package _1_Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1_Subsequence_or_Subset_Recursion_with_ArrayList {
	
	public static void genSequence(List<List<Integer>> ans, int[] num, List<Integer> tempList, int start) {
        if (start == num.length) {
            ans.add(new ArrayList<>(tempList));
            return; 		// this 1st change
        }
 
//        genSequence(ans, num, tempList, start + 1); // uncomment it for print ans in "reverse" order
        
        // Include the current element
        tempList.add(num[start]);
        genSequence(ans, num, tempList, start + 1);
        
        // Exclude the current element
        tempList.remove(tempList.size() - 1);
        genSequence(ans, num, tempList, start + 1);	// <--- "Comment it Here is natural Order if we comment it 
        											// and "Uncomment" above we get reverse oreder
     // this 2st change 2 time recursion used
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        genSequence(list, nums, new ArrayList<>(), 0);
        return list;
    }
    
    public static void main(String[] args) {
    
//NOTE  ---> here this above code not able to eliminate the duplicate element
//	    for that we use backtracking with for loop.
	    
    	int[] a = {1,2,3};
	    List<List<Integer>> result = subsets(a);
	
	    System.out.println("Total how many Subsequnce generated: " + result.size());
	
	    System.out.println("Generated Subsequnce:"+ result);
	//    for (List<Integer> subset : result) {
	//        System.out.println(subset);
	//    }
    }
}
