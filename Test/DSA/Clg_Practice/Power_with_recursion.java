package Clg_Practice;

public class Power_with_recursion {
	
	//	Power "With" recursion
	
	private static double powerWith(double x, int m) {
		
		double temp = x;
		if(m==0) {
			return 1;
		}
		temp = powerWith(x, m/2);
		if(m%2==0) {
			return temp*temp;
		}
		else {
			if(m>0) {
				return temp*temp*x;
			}else {
				return (temp*temp)/x;
			}	
		}
	}
	
	
	
	public static void main(String[] args) {
		
//		Power "With" recursion

		double ans2 = powerWith(2.00000,100);
		System.out.printf("%d.2" , ans2);
		
	}

}
