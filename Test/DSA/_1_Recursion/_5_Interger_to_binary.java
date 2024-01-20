package _1_Recursion;

public class _5_Interger_to_binary {

	public static long Binary(int n) {
		
		if(n==1 || n==0) {
			return n;
		}else {
			
			return Binary(n/2) *10 + (n % 2);
		}
	}

	public static void main(String[] args) {
		
		int n = 8;
		long ans = Binary(n);
		System.out.println(ans);
		
//		 By Build in function
		
		System.out.println();
		String b = Integer.toBinaryString(n);
		long ans1 = (Long.parseLong(b));
		System.out.println(ans1);

//	 by iterative method
		
		long r=0, ans2=0;
		while(n>0) {
			r = n%2;
			n = n/2;
			ans2 = ans2*10+r;
		}
		System.out.println(ans2);
		
//		----------------------------------------------------------------
//		By build in function
		System.out.println(Integer.toBinaryString(4));
	    System.out.println(Integer.parseInt("100",2));
		
		
	}

}
