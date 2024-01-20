
import java.util.*;
import java.lang.*;
/*
 * 	there are two types of method in java
 * 	Static And Non-Static
 * 	
 * 	In java we see "static" And "public" key for method
 * 
 * 	"static" key along with Method "Does not" Required the----> "Object" To Call it
 * 
 * 	"public" key along with Method  Required the-----> "Object" To Call it
 * 
 * 
 */

public class _09_1Methods_in_java_means_Function {
	
	static int fun(int x, int y) {
		int z = x+y;
		return z;
	}
	
	public int mul(int a, int b) {
		int p = a*b;
		return p;
	}

	public static void main(String[] args) {
		
		Scanner kk =new Scanner(System.in);
		
//		1st Method to Call the methods() in java 
		
		int a= 8;
		int b= 8;
		System.out.println("sum = "+ fun(a,b));		// here we does not create obj
		System.out.println("s = "+ _09_1Methods_in_java_means_Function.fun(a, b));
		
//		2st Method to Call the methods() in java 		
		
//		System.out.println(fun(55,1));
		
		// To Call "mul" function We Have To First Create An Object For That... Then we can Call It
		
//		_09_1Methods_in_java_means_Function j =  new _09_1Methods_in_java_means_Function(); // here we create obj due to public
//		System.out.println("Mul = "+ j.mul(a,b));
		
	
	}

}
