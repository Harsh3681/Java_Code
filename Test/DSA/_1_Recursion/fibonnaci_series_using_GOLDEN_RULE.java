package _1_Recursion;

public class fibonnaci_series_using_GOLDEN_RULE {

//	we can take anything instead of "int" only may be 
//	long , double, int,  float
	
	public static long fibbo_Golden_Rule(int n) {
//		(((1+ sqrt(5))/2)^n)/Math.sqrt(5)   <--- one + under-root of 5 whole bracket divide by 2, whole bracket rest to(pow) "n" and divide by under-i9  .root of 5
		
		return (int)(Math.pow( ((1+Math.sqrt(5)) / 2), n)/Math.sqrt(5) );
		
//		return (long) ((long) Math.pow((1+Math.sqrt(5)/2), n)/Math.sqrt(5));   // for long
		
	}
	
	public static void main(String[] args) {
		System.out.println(fibbo_Golden_Rule(7));
		for(int i=1; i<=7; i++) {
			System.out.print(fibbo_Golden_Rule(i)+" ");
		}
	} 
}
