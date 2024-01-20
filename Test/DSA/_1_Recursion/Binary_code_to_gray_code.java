package _1_Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class Binary_code_to_gray_code {

//	Gray code has the property that two 
//	successive numbers differ in only one 
//	bit and used in K-maps, error correction,
//	and communication.
	
/*
 * Approach:
	The idea is to check whether the "last bit" and "second last bit"
	are same or not,
	if it is same then move ahead otherwise add 1.
	
	Follow the steps to solve the given problem:

	 binary_to_grey(n)
	 if n == 0
	 grey = 0;
	 else if last two bits are opposite  to each other
	 grey = 1 + 10 * binary_to_gray(n/10))
	 else if last two bits are same
	  grey = 10 * binary_to_gray(n/10))
  
 */
	
	public static int rev(int n) {
		int g = 0;
		if(n==0) {
			return 0;
		}
		else if(((n/10)%10)!=(n%10)) {		// (n/10)%10 <----- for second last bit  && (n%10) <-- for lastbit
			g = 1+(10*rev(n/10));			// not same "Add" 1
		}else {	
			g = 10*rev(n/10);
		}
		return g;
	}

	
	public static void main(String[] args) {
		
		int aa = 11010001;
		System.out.println(rev(aa));
		
		
	}

}
