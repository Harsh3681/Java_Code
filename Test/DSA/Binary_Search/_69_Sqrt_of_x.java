package Binary_Search;

public class _69_Sqrt_of_x {
	
	public static int findSqrt(int x) {
		
		if(x==0 || x==1) {
			return x;
		}
		
		long first=0, last = x/2, ans=0;
		while(first<=last) {
			long mid = first + (last-first)/2;
			
			if(mid*mid==x) {
				return (int)mid;
			}
			
			if(mid*mid<x) {
				first = mid+1;
				ans = mid;
			}else {
				last = mid-1;
			}
		}
		
		return (int) (ans);
	}

	public static void main(String[] args) {
		
//		Q)	Given a non-negative integer x, return the square root of x rounded down to the nearest integer. 
//			The returned integer should be non-negative as well.
//			You must not use any built-in exponent function or operator.
		
//			int x=4; 	// o/t = 2
			int x=9;	// o/t = 2
			
			
			System.out.println(findSqrt(x));

	}

	

}
