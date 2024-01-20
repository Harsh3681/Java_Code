import java.util.Scanner;


public class Practice_2_Loops {

	public static void main(String[] args) {
		
// Program To find out Area And Perimeter Of An Square
		
		
//		float a; float b;
//		Scanner in = new Scanner (System.in);
//		
//		System.out.print("Enter Side ");
//		a = in.nextFloat();
//		float area = (a*a);
//		float peri = (4*a);
//		System.out.println("Area " +area);
//		System.out.println("Peri " +peri);
		

		
//WAP Program to Print the Pattern
		
		
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<=i; j++) {
//			System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i=4; i>0; i--) {
//			for(int j=0; j<i; j++) {
//			System.out.print("*");
//			}
//			System.out.println();
//		}
		
// Print Pattern Like That		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
			System.out.print("*");
			}
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		
		for(int i=3; i>=0; i--) {
			for(int j=0; j<i; j++) {
			System.out.print("*");
			}for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
//			System.out.println();
		}
		


		

	}

}
