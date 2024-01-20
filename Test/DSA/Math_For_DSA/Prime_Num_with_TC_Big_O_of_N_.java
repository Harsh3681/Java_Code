package Math_For_DSA;

public class Prime_Num_with_TC_Big_O_of_N_ {

	private static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		
		for(int i=2; i*i<=n; i++) {	// simple math we are using here for (i*i) i.e let's 3 = sqrt(8) we can convert [ 3*3 = 8 ] by giveup "sqrt" as "*"(multiplication) sign 
			
			if(n%i==0) {
				return false;
			}
		}
		
		
		return true;
	}
	
	public static void main(String[] args) {
		
//		 Here TC- of above algo is "O(sqrt(n))"		 from "O(n)"
//		becz here we are consider number upto only sqrt(i) here "i" the num which we try to search.
//		Becz all we know all the numbers after certain limit's will be repeated them self. see below
		
//		let n = 36		now try to find nums which divides the 36
//		1 * 36
//		2 * 18
//		2 * 12
//		4 * 9
//		6 * 6
//		9 * 4	<--- from here all the nums are repeated
//		12 * 3
//		18 * 2
//		36 * 1
		
//		so for repeated nums why we should check again an again which increases TC here we find new way 
		
//		$$$$$$$ NOTE $$$$$$$ 
//		"1" is not "Prime" or "Composite"
		
		int n=5;
		for(int i=0; i<=n; i++) {
			System.out.println(i + " "+ isPrime(i));
		}
	}

	

}
