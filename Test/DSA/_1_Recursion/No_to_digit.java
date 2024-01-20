package _1_Recursion;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class No_to_digit {

	public static void printDig(int n) {
		
		if(n==0) {
			return;
		}
		HashMap<Integer, String> hm = new LinkedHashMap<>();
		hm.put(0,"Zero");
		hm.put(1,"one");
		hm.put(2,"Two");
		hm.put(3,"Three");
		hm.put(4,"Four");
		hm.put(5,"Five");
		hm.put(6,"Six");
		hm.put(7,"Seven");
		hm.put(8,"Eight");
		hm.put(9,"Nine");
		hm.put(10,"ten");
		
		printDig(n/10);
		System.out.print(hm.get(n%10)+" ");
		
		
	}
	
	public static void main(String[] args) {
//		Ex - 243;
//		o/t - two four three
		printDig(506987);
		
		
	}

}
