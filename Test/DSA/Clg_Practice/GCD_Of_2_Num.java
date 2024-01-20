package Clg_Practice;

public class GCD_Of_2_Num {
	static int Calculate(int a, int b) {
		
//		Without Recursion
		
		while(a!=b) {
			if(a>b) {
				a = a-b;
			}
			else {
				b = b-a;
			}
		}
		return b;
//		------------------------------------------
		
//    	With Recursion
		
//		if(a==0) {
//			return b;
//		}
//		return Calculate(b%a, a);
	}
	public static void main(String[] args) {
		
		System.out.println(Calculate(21,12));
		
		
		
		

	}

}
