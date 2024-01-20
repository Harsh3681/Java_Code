import java.util.Scanner;

public class _05_Loops {
	
	public static int fact(int i) {
		if(i<=1) {
			return 1;
		}
		return i*fact(i-1);
	}
	
	public static void main(String [] args) {
		
//		for and while loops same as that C ad C++
		
//		**************	"for each" loop	 on array *******************
		
		Scanner kk = new Scanner (System.in);
//		
//		int a[] = {5,7,9,7,6,12,6};
//		
//		for(int i:a) {     	//	<----- for each loop	for(data type variable : array collection)
//			System.out.print(i+" ");		// 	"," coma cha jagi +
//		}
		
		
		
//		 Examples On Loops
		
// Q)	WAP To Print Pattern
		
//		for(int i=0; i<5; i++) {
//			for(int j=5; j>i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
// Q) 	WAP to Print Sum of 1st "n" even numbers means EX. 1st 4 even num = 0,2,4,6
//		Ex. 1st 9 even num = 0,2,4,6,8,10,12,14,16		yanchi sum
		
//		System.out.print("Enter Num - ");
//		int num = kk.nextInt();
//		int i=0;
//		int sum=0;
//		while(i<num) {		
//			sum = sum+(2*i);	// we Calculate tHat "even" Num By (2*i) mens 2*1=1, 2*2=4, 2*3=6 etc	
//			i++;				// for "odd" num  (2*(i-1))
//		}
//		System.out.println(sum);
		
		
//	Q)  WAP to Print Multification Table In Reverse Order
//  Q) Along With We Also Covers in this program To Calculate Sum of All Multification VAlues
		
//		System.out.print("ENter - ");
//		int num = kk.nextInt();
//		int i=10;
//		int sum=0;
//		while(i>=1) {
//			System.out.println(num + "X" + i+ "="+ num*i);
//			sum =sum+(num*i);
//			i--;
//		}
//		System.out.println("Sum = "+sum);	// <--- sum OF all Multification
		
//	Q) WAP to Find FActorial By using For Loop
		
//		int sum=1;
		System.out.print("ENter - ");
		int num = kk.nextInt();
//		for(int i=num; i>=1; i--) {
//			sum= sum*i;
//		}
//		System.out.println("Sum= "+sum);
		
//		Recursion
		System.out.println(fact(num));
		
		
		
	}

}
