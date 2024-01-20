package Data_Structure_Java;

import java.util.*;
import java.util.Stack;

public class String_Builder {

	// problem 2390
	
	public static String removeStar(String s) {
		Stack<Character> stk = new Stack<>();
		
		StringBuilder sb = new StringBuilder();		//  <-------------- used of string builder
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!='*') {
				stk.push(s.charAt(i));
			}
			else {
				
				stk.pop();
			}
		}
		while(!stk.isEmpty()) sb.append(stk.pop());		// <----------- String Builder
		sb.reverse();
		return sb.toString();
		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aa*jg**l";
		System.out.println(removeStar(s));
	}

}
