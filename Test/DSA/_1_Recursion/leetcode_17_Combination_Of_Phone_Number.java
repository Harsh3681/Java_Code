package _1_Recursion;

import java.util.ArrayList;

public class leetcode_17_Combination_Of_Phone_Number {

	public static void Phone_Number_Combine(String inp, String out) {
		if(inp.isEmpty()) {
			System.out.println(out);
			return;
		}
		
		char ch = inp.charAt(0);
		int digit = ch - '0';
		int posi = (digit - 1)*3;
		
		for(int ind = posi ; ind<digit*3; ind++) {
//	just "debug" it once on the IntelliJ IDE		
			char alphabet = (char)('a'+ind);
			Phone_Number_Combine(inp.substring(1), out+alphabet);
		}	
	}
	
//	--------------------------------------------------------------------------
	
//	With "ArrayList" now
	
	public static ArrayList<String> ArrayList_Phone_Number_Combine(String inp, String out){
		if(inp.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(out);
			return list;
		}
		
		char ch = inp.charAt(0);
		int digit = ch - '0';
//		digit = digit-1;
		int posi = (digit - 1)*3;
		
		ArrayList<String> ans = new ArrayList<>();
		for(int ind = posi ; ind<digit*3; ind++) {	
			char alphabet = (char)('a'+ind);
			ans.addAll(ArrayList_Phone_Number_Combine(inp.substring(1), out+alphabet));
		}
		return ans;
	}
	
//	--------------------------------------------------------------------------
	
//	Count Total such "Combination" Possible.
	public static int Count_Phone_Number_Combine(String inp, String out){
		if(inp.isEmpty()) {
			return 1;
		}
		
		char ch = inp.charAt(0);
		int digit = ch - '0';
		int posi = (digit - 1)*3;
		int count = 0;

		for(int ind = posi ; ind<digit*3; ind++) {	
			char alphabet = (char)('a'+ind);
			count = count + Count_Phone_Number_Combine(inp.substring(1), out+alphabet);
		}
		return count;
	}
	
//	--------------------------------------------------------------------------
	
	
	public static void main(String[] args) {
		
//		https://www.youtube.com/watch?v=9ByWqPzfXDU&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=34
		
		Phone_Number_Combine("12","");
//		--------------------------------------------------------------------------
		
//		With "ArrayList" now
		ArrayList<String> ans = new ArrayList<>();
		ans = ArrayList_Phone_Number_Combine("12","");
		System.out.println(ans);
//		--------------------------------------------------------------------------
		
//		Count Total such "Combination" Possible.
		System.out.println("How many phome combination "+Count_Phone_Number_Combine("12",""));
		
	}

}
