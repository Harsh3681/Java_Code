package _1_Recursion;

public class Factorial {

	public static int factorial(int n) {
		if(n<=1) {
			return 1;
			
		}else {
			return n*factorial(n-1);
		}
	}
	
//	-------------------------------------------------------
//	by iterative Mathod.
	
	public static int factoIterative(int n) {
		int ans = 1;
		if(n<=1) {
			return 1;
		}
		while(n>=1) {
			ans*=n;
			n = n-1;
		}
		return ans;
	}
	
	public static void main(String[] args) {
	 
//		by Recursion Mathod.
		System.out.println(factorial(0));
		
//		-------------------------------------------------------
//		by iterative Mathod.

		System.out.println(factoIterative(0));
		
	
	}
}
