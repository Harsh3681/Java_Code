package _1_Recursion;

import java.util.ArrayList;
import java.util.List;

public class _3_Subsequence_String_Recursion_With_Without_ArryList {

//	Here Subsequence of String "Without" Store it in "ArrayList<>()"  X
	
	public static void subsequence_Without_StoreInArrayList(String inp, String out) {
		if(inp.isEmpty()) {
			System.out.println(out);
			return;
		}
		
		char ch = inp.charAt(0);
		subsequence_Without_StoreInArrayList(inp.substring(1),out);		// here 1 time exclude char
		subsequence_Without_StoreInArrayList(inp.substring(1),out+ch);	// here 1 time include cha
	}
	
//	--------------------------------------------------------------------------
	
//	Here Subsequence of String "With" Store it in "ArrayList<>()"  
	
	public static ArrayList<String> subsequence_With_StoreInArrayList(String inp, String out) {
		if(inp.isEmpty()) {
			
			ArrayList<String> ans = new ArrayList<>();
			
			ans.add(out);
			
			return ans;
		}
		char ch = inp.charAt(0);
		
		ArrayList<String> left = subsequence_With_StoreInArrayList(inp.substring(1),out);		// here 1 time exclude char
		ArrayList<String> right = subsequence_With_StoreInArrayList(inp.substring(1),out+ch);	// here 1 time include char
		
		left.addAll(right);
		
		return left;
	}
	
	public static void main(String[] args) {
		
//		Here also we generate "Subsequence" for String total generated "2^n" if "empty sequence consider else "2^n-1" without empty subsequence
//		here we consider "empty" subsequence also hence total "2^n" generated
		
//Here Subsequence of String "Without" Store it in "ArrayList<>()"  X
		
		String s= "abcc";
		subsequence_Without_StoreInArrayList(s, "");
		
//		here below and above "blank" "" place above the "c" is empty string which also be consider
		
//		--------------------------------------------------------------------------
//	https://www.youtube.com/watch?v=gdifkIwCJyg&t=861s
//		51:04 time 
		
//Here Subsequence of String "With" Store it in "ArrayList<>()"  
		
		System.out.println(subsequence_With_StoreInArrayList("abcc", ""));
//		System.out.println("s "+s.substring(1));
		
	}

}
