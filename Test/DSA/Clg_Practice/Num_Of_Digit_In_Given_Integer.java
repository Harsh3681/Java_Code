package Clg_Practice;

import java.util.*;

public class Num_Of_Digit_In_Given_Integer {

	public static void main(String[] args) {
		
		int c=0, r;
		
		int  x =236;
		while(x!=0) {
			r = (x%10);
			c++;
			x = x/10;
		}
		System.out.println("Num = "+ c);
		
	}

}
