package Clg_Practice;
import java.lang.*;
import java.util.*;

class Pallindrome{
	
	static void Pali(int n) {
		int r =0, s = 0;
		
		int temp = n ;
		int f=0;
		
		while(n!=0) {
			
				r= n%10;
				s= (s*10) + r;
				n= n/10;
				
			
		}
		
		
		
		if(temp==s) {
			System.out.println("Pallindrome");
			
		}
		else {
			System.out.println("Not Pallindrome");

		}

	}
	
}


public class Pallindrome_num {

	public static void main(String[] args) {
		
		Pallindrome.Pali(-121);
	}

}
