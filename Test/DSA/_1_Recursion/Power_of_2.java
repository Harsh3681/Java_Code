package _1_Recursion;

public class Power_of_2 {

	public static int Pow2(int n) {
	if(n==0) {
		return 1;
	} 
	return 2* Pow2(n-1);	
	}
	
//	----------------------------------------------------------------------------------------
//	Power as per our choice
	
	public static int pow(int n,int s) {
		if(s==0) {
			return 1;
		}
		return n*pow(n,s-1);
	}
	
	
	public static void main(String[] args) {
		System.out.println(Pow2(3));
		
		System.out.println(pow(2,5));
	}

}
