
public class _10_Variable_Arguments_IMP {
	
//	********  If we Don't know how many arguments user generally pass into the function ************  <-----
//	But we Want to Perform Certain Operation Over that arguments like --->  sum  etc
//	 then This Variable Argument Method Is Generally used
	
	static void foo(int a) {						// 1st
		System.out.println("a = "+ a);
	}
	
	static void foo(int a, int b) {					// 2nd
		System.out.printf("a = %d \nb = %d"+ a,b);
	}
	
	static void foo(int a, int b, int c) {			// 3rd
		System.out.printf("a = %d \nb = %d \nc = %d"+ a,b,c);
	}
	
//	************* WE DON'T DO THIS ABOVE CASE FOR THAT  ******************
	
	static void sum(int ... arr) {
		int s=0;
		for(int i : arr) {
			s += i;
		}
		System.out.println("Sum = "+ s);
	}
	
//	************* Suppose we required "At least 1 value inside the funct" then we used below code  ***********
	
	static void sum2(int x, int ... arr) {
                           
		for(int i : arr) {
			x += i;
		}
		System.out.println("Sum = "+ x);
	}
	
	
	
	

	public static void main(String[] args) {
		
		sum();			// if we not pass anything it will Return '0' 	instated
		sum(4);
		sum(1,5,3);
		sum(4,6,7,9,4,3,5,6,4,8,77);		// Know We can Passed Num of value inside the funct
		
		
		
		
//		sum2();   // Know It shows an Error
		System.out.println();
		
		sum2(1,2);
		sum2(5,7,9,4);
		sum2(11);
		
		
		
		
		
		
		

	}

}
