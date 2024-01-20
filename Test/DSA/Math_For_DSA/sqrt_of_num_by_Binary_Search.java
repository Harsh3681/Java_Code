package Math_For_DSA;

public class sqrt_of_num_by_Binary_Search {

	static double sqrt(int n, int precision) {
		
		int start=0, end=n, mid=0;
		
		while(start<=end) {			// by using on "Binary Search" we can find "sqrt" of only proper nums like 1,4,9,16.... but using below		for loop wala code we able to find "decimal" wala sqrt also like 5, 3,17 so on...
			mid = (start +end)/2;
			if(mid*mid==n) {
				return mid;
			}
 			else if(mid*mid>n) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		
//		here above formula works for find "sqrt" of only proper nums like 1,4,9,16.... so on and if not getting answer there it will jump to below
		
//		-------------------------------------------------------
		
//		here above formula works for find "decimal" wala sqrt also like 5, 3,17 so on... so on 
		
		double root=0.0;
		double incre = 0.1;						 
		for(int i=0; i<precision; i++) {		
			while(root*root<=n) {
				root+=incre;
			}
//			once it break this cond
			
			root -= incre; 		// go to the previous place
			incre /= 10;	// why divide becz for loop goes for next decimal place here 4 then 2 then 1 like that see below comments
		}
		
		return root;
	}
	
//		%%%% NOTE %%%%
//	here "precision" means for creating let's assume some one sqrt is 3.421 then by using "precision" we goes line one by one i.e first "i" work for .4 then "i" work for 2 then , "i" work for 1 then like that
	
	
	public static void main(String[] args) {
		
//		video link koshawa
		
//		https://www.youtube.com/watch?v=lmSpZ0bjCyQ&list=LL&index=4
		
		int n=40, precision = 3;
		System.out.printf("%.2f ", sqrt(n,2));
		
//		don't think a lot becz here 
		double h = 1.8132470159104392;
		System.out.printf("%.6f",h);
		
	}

}
