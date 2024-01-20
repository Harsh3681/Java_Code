package _1_Recursion;

import java.util.ArrayList;

public class _2_Permutation_of_string {

//	subset does not Order nor Continuity.
	
/*	Subset: which mean any possible combinations.

	For example, lets take an array int arr=[10,20,30,40,50];

	-->Now lets see its various combinations:

		  subset={10,20}; //true
		  subset={10,30}; //true
		  subset={30,20}; //true
	 
	 * */
	
	
	
//	Here we just try to find out all possible "permutation" of "String"

//	"Not" finding any "subsequence" , "subArray" or "subset"

	
//	-------------------------------------------------------------------------------------
// Without ArrayList	
	
	public static void Permutation(String inp, String out) {

		if(inp.isEmpty()) {
			System.out.println(out);
			return;
		}
		for(int i=0; i<inp.length(); i++) {
			char ch = inp.charAt(i);
			String ll = inp.substring(0,i);
			String rr = inp.substring(i+1); 
			String result = ll + rr;
			Permutation(result, out+ch);
		
		}
//		System.out.println(c);
	}
	
//	-------------------------------------------------------------------------------------
// With ArrayList	
	
	public static ArrayList<String> Permutation1(String inp, String out) {
		if(inp.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(out);

			return list;
		}
		ArrayList<String> ans = new ArrayList<>();
		for(int i=0; i<inp.length(); i++) {
			char ch = inp.charAt(i);
			String ll = inp.substring(0,i);
			String rr = inp.substring(i+1); 
			String res = ll+rr;
			ans.addAll(Permutation1(res, out+ch));	
		}
		return ans;
	}
	
//	-------------------------------------------------------------------------------------
// 		Find "Count" How many Permutation Possible
	
	public static int PermutationCount(String inp, String out) {
		int count=0;
		if(inp.isEmpty()) {
			return 1;
		}
		for(int i=0; i<inp.length(); i++) {
			char ch = inp.charAt(i);
			String ll = inp.substring(0,i);
			String rr = inp.substring(i+1); 
			String res = ll+rr;
			count = count + PermutationCount(res, out+ch);	
		}
		return count;
	}
	
//	-------------------------------------------------------------------------------------

	
	
	public static void main(String[] args) {
		
//		Here we just try to find out all possible "permutation" of "String"

//		"Not" finding any "subsequence" , "subArray" or "subset"
		
		Permutation("abc","");
//		-------------------------------------------------------------------------------------
		
//		ArrayList<String> ans = Permutation1("abc","");
//		Or
		ArrayList<String> ans = new ArrayList<>();
		ans = Permutation1("abc","");
		System.out.println(ans);
//		-------------------------------------------------------------------------------------
		
		System.out.println("Total No of Permutation - "+PermutationCount("abc",""));
		System.out.println("bc".substring(0,1));
//		-------------------------------------------------------------------------------------

	}

}
