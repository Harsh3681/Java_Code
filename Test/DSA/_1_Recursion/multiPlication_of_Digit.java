
package _1_Recursion;

public class multiPlication_of_Digit {

	public static int Multi(int n) {
		
		if(n%10==n) { // when there is only single digit remaining then use it
			return n;
		}else {
			return n%10 * Multi(n/10);
		}

	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Multi(102));
		System.out.println(Multi(128));
		

	
	}

}
