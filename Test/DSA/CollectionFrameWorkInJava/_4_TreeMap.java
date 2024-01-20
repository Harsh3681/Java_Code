package CollectionFrameWorkInJava;

import java.util.Arrays;
import java.util.TreeMap;

public class _4_TreeMap {
	
//		TreeMap<> mainly used for the ----> "sorting" <---- our contain in Map<>
	

	public static void main(String[] args) {
		
//		Q) 	Input: s = "is2 sentence4 This1 a3"
//			Output: "This is a sentence"
//			Explanation: Sort the words in s to their
//			original positions "This1 is2 a3 sentence4", 
//			then remove the numbers.
		
		
		TreeMap<Integer,String> tm=new  TreeMap<Integer,String> ();  
		String s = "is2 sentence4 This1 a3";
		String ar[]= s.split(" ");
		System.out.println(Arrays.toString(ar));
		
		for(int i=0; i<ar.length; i++) {
			int val = ar[i].charAt(ar[i].length()-1)-'0';
			tm.put(val, ar[i].substring(0, ar[i].length()-1));
		}
		String p = "";
		for(String i : tm.values()) {
			p+=i+" ";
		}System.out.println(p.trim());	// why use "trim()" becz we want output length also be same hence "trim()" 1st and last space"
		
	}

}
