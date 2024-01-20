//package Clg_Practice;
//import java.util.*;
//
//
//class fib{
//	
//	static int x=0, y=1, sum=0;
//	
//	static void fibo(int a) {
//		
//		System.out.print("0  1");
//		
//		if(a<1) {
//			System.out.print(a);
//		}
//		else {
//			int i=1;
//			while(i<=(a-2)) {
//				sum= x+y;
//				x = y; 
//				y =sum;
////				sum= x+y;
//				i++;
//				System.out.print("  "+ sum);
//			}
//		}
//		
//	}
//}
//
//
//
//
//public class Fibonacci {
//
//	public static void main(String[] args) {
//		
////		fib f = new fib();
////		f.fibo(5);
//		
//		fib.fibo(3);
//	}
//
//
//}

//package Practical;
package Clg_Practice;

import java.util.*;
import java.lang.*;

//------------------------------------------------------------------

//			fibonacci


//public static int runningSum(int num) {
//	
//	if(num==1 || num==2) {
//		return num;
//	}
//	
//	return runningSum(num-1) +  runningSum(num-2);
//	
//}

//------------------------------------------------------------------




interface vehicle {

	public void Gear();

	public void Change_Gear();

	public void Speed_Up();

	public void Apply_break();
}

class bick implements vehicle {
	Scanner ss = new Scanner(System.in);
	int cg, chg, cs;
	static int s = 0;

	public void CureentSpeed() {
		System.out.println("Enter The Current speed - ");
		cs = ss.nextInt();
	}

	public void Gear() {
		System.out.println("Enter The Current gear - ");
		cg = ss.nextInt();
	}

	@Override
	public void Speed_Up() {
		if (cs==0 && chg == 1) {
			s = 35;
			System.out.println("After chang gear Speed Increase " + (cs + s));
		} 
		if (chg == 2) {
			s = 80-cs;
			System.out.println("After chang gear Speed Increase " + (cs + s));
		} 
		if (chg == 3) {
			s = 130-cs;
			System.out.println("After chang gear Speed Increase " + (cs + s));
		} 
		if(chg ==4) {
			s = 180-cs;
			System.out.println("After chang gear Speed Increase " + (cs + s));
		}

	}

	public void Speed_Down() {

		if (cg == 4) {
			
			if(chg==3 && cs>130 && cs<150) {
				
				System.out.println("After change gear Speed decrease " + (cs - 50));
			}
			if(chg==2 && cs>60 && cs<100) {
				
				System.out.println("After change gear Speed decrease " + (cs -100 ));
			}
			else {
				
				System.out.println("Invalid inpute");
			}

		}
		
		else if (cg == 2) {
			
			if(chg==1 ) {
				
				System.out.println("After change gear Speed decrease " + (cs -50 ));
			}
			else {
				
				System.out.println("Invalid Inpute " );
			}
		} 
		
		
		
		else if (cg == 3) {
		
			if(chg==2) {
				
				System.out.println("After change gear Speed decrease " + (cs - 50) );
			}
			if(chg==1 ) {
				
				System.out.println("After change gear Speed decrease " + (cs -100 ));
			}
			else {
				
				System.out.println("Invalid Inpute " );
			}
		} 
		
		else {
			if(chg==1) {
				
				System.out.println("After change gear Speed decrease " + (cs - 50) );
			}
		}

	}

	@Override
	public void Change_Gear() {
		System.out.println("On Which Gear U want Shift - ");
		chg = ss.nextInt();
		if (chg >= cg) {
			Speed_Up();
		}
		if (chg < cg) {
			Speed_Down();
		}
	}

	@Override
	public void Apply_break() {
		System.out.println("After Applying break Speed Reduced ");
	}

}

class car implements vehicle {
	int g, b, c;

	int cg, chg, cs;
	static int s = 0;
	Scanner ss = new Scanner(System.in);

	public void CureentSpeed() {
		System.out.println("Enter The Current speed - ");
		cs = ss.nextInt();
	}

	public void Gear() {
		System.out.println("Enter The Current gear - ");
		cg = ss.nextInt();
	}

	@Override
	public void Speed_Up() {
		if (cg == 1) {
			s = 50;
			System.out.println("After Applying break Speed Increase " + (cs + s));
		} else if (cg == 2) {
			s = 100;
			System.out.println("After Applying break Speed Increase " + (cs + s));
		} else if (cg == 3) {
			s = 150;
			System.out.println("After Applying break Speed Increase " + (cs + s));
		} else {
			s = 200;
			System.out.println("After Applying break Speed Increase " + (cs + s));
		}

	}

	public void Speed_Down() {

		if (cg == 1) {
			s = 50;
			System.out.println("After Applying break Speed decrease " + (cs - s));
		} else if (cg == 2) {
			s = 100;
			System.out.println("After Applying break Speed decrease " + (cs - s));
		} else if (cg == 3) {
			s = 150;
			System.out.println("After Applying break Speed decrease " + (cs - s));
		} else {
			s = 200;
			System.out.println("After Applying break Speed decrease " + (cs - s));
		}

	}

	@Override
	public void Change_Gear() {
		System.out.println("On Which Gear U want Shift - ");
		chg = ss.nextInt();
		if (chg >= cg) {
			Speed_Up();
		}
		if (chg < cg) {
			Speed_Down();
		}
	}

	@Override
	public void Apply_break() {
		System.out.println("After Applying break Speed Reduced ");

	}

}

class bicycle implements vehicle {
	int g, b;
	Scanner ss = new Scanner(System.in);

	public void Gear() {
		System.out.println("Enter The Current gear - ");
		g = ss.nextInt();
		System.out.println("Bicycle in " + g + " gear now");
	}

	@Override
	public void Change_Gear() {
		System.out.println("On Which Gear U want Shift - ");
		b = ss.nextInt();
		System.out.println("Gear is change From " + g + " to " + b);

	}

	@Override
	public void Speed_Up() {
		System.out.println("After changing gear Speed Increase ");

	}

	@Override
	public void Apply_break() {
		System.out.println("After Appling break Speed Reduced ");

	}
}

public class Fibonacci {

	public static void main(String[] args) {
		

//------------------------------------------------------------------

//		fibonacci		
		
		
//		for(int i=1; i<=5; i++) {
//			System.out.print(runningSum(i) + " ");
//		}
		
//------------------------------------------------------------------
		

		int c;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("********* Enter Choice ********* \n1.Bick\n2.Car\n3.Bicycle\n0.Exit");
			c = sc.nextInt();
			switch (c) {
				case 1:
					bick b1 = new bick();
					b1.Gear();
					b1.CureentSpeed();
					b1.Change_Gear();
					b1.Speed_Up();
					b1.Apply_break();
					b1.Speed_Down();
					break;

				case 2:
					car b2 = new car();
					b2.Gear();
					b2.CureentSpeed();
					b2.Change_Gear();
					b2.Speed_Up();
					b2.Apply_break();
					b2.Speed_Down();
					break;

				case 3:
					bicycle b3 = new bicycle();
					b3.Gear();
					// b3.CureentSpeed();
					b3.Change_Gear();
					b3.Speed_Up();
					b3.Apply_break();
					// b3.Speed_Down();
					break;

				case 0:
					break;
			}

		} while (c != 0);

	}

}

