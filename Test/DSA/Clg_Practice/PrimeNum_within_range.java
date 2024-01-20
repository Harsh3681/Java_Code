package Clg_Practice;

import java.util.ArrayList;

public class PrimeNum_within_range {
	
//			%%%%%%%% By Recursion %%%%%%%
	
	public static boolean Prime_or_Not_Recursion(int n, int i) {
		if(n<=2) {
			return (n==2) ? true : false;
		}
		if(n%i==0) {
			return false;
		}
		if(i*i > n) {
			return true;
		}
		return Prime_or_Not_Recursion(n,i+1);
	}
	
	
	

	public static void main(String[] args) {

	//	the no which divide by "Itself" and by "1" i.e "Prime No"	
		
		int n=10;boolean flg=false;
		ArrayList<Integer> ak = new ArrayList<>();
		ArrayList<Integer> bk = new ArrayList<>();
		for(int i=2; i<=10; i++) {
			for(int j=2 ; j<i; j++) {
				if(i%j==0) {
					flg=false;
					break;
				}else {
					flg=true;
				}
				if(flg=true) ak.add(i);
				break;
			}	
			
		}
		System.out.println(ak);
		
//		%%%%%%%% By Recursion %%%%%%%

		int num=5;
		 if (Prime_or_Not_Recursion(num, 2)) 
	            System.out.println("Yes");
		 else
           System.out.println("No");
		
	}

}
