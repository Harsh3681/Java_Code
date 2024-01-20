package _1_Recursion;

public class fibonacci_Seriers {

	public static long fibbo(int n) {
		if(n<2) {
			return n;
		}
		return fibbo(n-1)+fibbo(n-2);
	}
	
	public static void main(String[] args) {
//		1st way to print
		System.out.println(fibbo(7));
		
//		2nd way to print
		
		for(int i=0; i<20; i++) {
			System.out.print(fibbo(i)+" ");
		}
	
	}

}
