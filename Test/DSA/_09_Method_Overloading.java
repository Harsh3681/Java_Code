
public class _09_Method_Overloading {
	
	void foo(int a) {						// 1st
		System.out.println("a = "+ a);
	}
	
	void foo(int a, int b) {					// 2nd
		System.out.printf("a = %d \nb = %d", a,b);
	}
	
	int foo(int a, int b, int c) {			// 3rd
//		System.out.printf("a = %d \nb = %d \nc = %d", a,b,c);
		return a+b+c;
	}
	
	static void foo(int a, int b, int c, int d) {			// 3rd
		System.out.printf("a = %d \nb = %d \nc = %d \nd = %d", a,b,c,d);
	}
	
//	********** NOTE But We can not create an same method() with same num of argu in java
//	let's see 2nd method()
	
//	static int foo(int a, int b) {					// 2nd
//		return a+b;
		
//	}		// it says it is an duplicate method() 
	
	
	public static void main(String[] args) {
		
		_09_Method_Overloading s = new _09_Method_Overloading();
		
		s.foo(7,90);		// without using static it also be inherited between first 2 class
		
		System.out.println();
		
		System.out.println(s.foo(1,5,7));		
		
		System.out.println();
		
		foo(4,8,7,99);
		

	}

}
