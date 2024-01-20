package Clg_Practice;

import java.util.*;
import java.lang.*;

public class LCM_equal_to_HCF__Of_2_Num {

	public static void main(String[] args) {
		
		int n1 = 50, n2= 60 , big;
		
		big = (n1>n2) ? n1 : n2;
		
		while(true) {
			
			if(big %n1 == 0 && big %n2==0) {
				System.out.println("LCM = "+ big);
				break;
			}
			big++;
		}
		
//		------------------------------------------------------
		
		int a = 3, b = 7, gcd = 1;  
		//finds GCD  first then
		for(int i = 1; i <= a && i <= b; ++i)   
		{  
			//divides both the numbers by i, if the remainder is 0 the number is completely divisible by i  
			//Checks that i is present in both or not  
			//returns true if both conditions are true  
			if(a % i == 0 && b % i == 0)  {
			//assigns i into gcd  
				gcd = i;  
			}
		}  
		//determines lcm of the given number  
		int lcm = (a * b) / gcd;  
		//prints the result  
		System.out.printf("The LCM of %d and %d is %d.", a, b, lcm);  

	}

}
