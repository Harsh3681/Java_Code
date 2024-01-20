package Data_Structure_Java;

import java.util.*;
import java.util.ArrayList;



public class SubSequenceString {
	
	static List<String> st = new ArrayList<>();
	private static void findStrsubseqence(String str, String ans) {
		
		if(str.length()==0) {
			st.add(ans);
			return;
		}
		
		// here we adding 1st char in String
		
		findStrsubseqence(str.substring(1), ans + str.charAt(0));
		
		// Not Adding 1st char of String
		// becz the concept of "subSequence" is the Char will Present or Not
		
		findStrsubseqence(str.substring(1), ans);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 134;
		String s = a+"";
		findStrsubseqence(s," ");
		System.out.println(st.size());
		for(String h:st) {
			System.out.println(h);
		}
	}
	
	
		

}
