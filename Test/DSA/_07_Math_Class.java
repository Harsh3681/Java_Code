import java.lang.*;
/*
 * 		Here Math Class Include The various Method for Performing Simple Operations In Math
 * 		here "PI"	and "E(Eural)"	are Constant
 * 			
 * 		1st We have to include the library	-->  import java.lang.*;
 * 		
 * 		T	<---- here T is An data type		
 * 
 * 		1)	abs()					// convert (-) negative value to positive
 * 			Math.abs(T value)	
 * 		
 * 		2)	exp()
 * 			Math.exp(T value)	<--- returns ans = e^value
 * 
 * 		3)	log()
 * 			Math.log(T value)	<--- return log value
 * 
 * 		4)	log10()
 * 			Math.log10(T value)
 * 
 * 		5)	max()
 * 			Math.max(value1, value2)
 * 
 * 		6)	min()
 * 			Math.min(value1, value2)
 * 
 * 		7)	pow()
 * 			Math.pow(value1, to the pow value2)
 * 	
 		8)	sqrt()
 			Math.sqrt(T value)
 			
 		9)	floor()
 			Math.floor(T value)
 			
 		10)	ceil()
 			Math.ceil(T value)
 			
 		11)	sin()		cos()		tan()
 */


public class _07_Math_Class {

	public static void main(String[] args) {
		
//		Other  Methods Also Be same As that Below

		
		int x = -10;
		int y = 5;
		System.out.println("jj = " + Math.pow(2, 2));
		System.out.println("abs = "+ Math.abs(x));
		System.out.println("Not abs = "+Math.abs(y));
		
		System.out.println("Exp = "+ Math.exp(y));
		System.out.println("f "+ Math.floor(5.5));
		System.out.println("C "+ Math.ceil(5.4));
		
		System.out.println((int)10e7);	// on 10 7 zero's extra
//		System.out.println(Math);
	}

}
