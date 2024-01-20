import java.util.Scanner;

public class _08_Array_Java {

	public static void main(String[] args) {
		
		Scanner kk =new Scanner (System.in);
		
		
/*		********** Arrays In JAva ************
 * 
 * 		int marks[] = {1,5,7,9,4,6}
 * 
 * 		float price[]= {1.2f, 6.5f , 4.9f, 7.8f, 2.0f, 7.6f }
 * 
 * 		String name[]= {"Ram", "Sham","Ganesh","Nilesh" }
		
		double price[]= {1.2d, 6.5d , 4.9d, 7.8d, 2.0d, 7.6d }
		
*/		
		
		
		
// Below is 1 way to create an array in java
		
//		int [] marks = new int[3];
//		marks[0]= 2;
//		marks[1]= 9;
//		marks[2]= 8;
		
//		for(int i=0; i<2; i++) {
//			System.out.println(marks[i]);
//		}
//		
		
		
// Below is 2 way to create an array in java
		
		int marks[] = {2,5,4,6,58,3};
		
		
//		for(int i=0; i<marks.length; i++) {
//			System.out.println(marks[i]);
//		}
		
//		********** Display The Array uSing "For Each Loop"  ***********
		
//		for(int x : marks) {
//			System.out.println(x);
//		}
		
//--------------------------------------------------------------------------------------------
		

//		************** Taking input And Print 1D Array *********************
		
		System.out.print("Enter size ");
		int s = kk.nextInt();
		int arr[] = new int[s];
		for(int i=0 ; i<s; i++) {
			System.out.print(i+1 +" num - ");
			arr[i] = kk.nextInt();
		}
		
		System.out.println("Array");
		
//		Print An Array By For each loop
		
		for(int x: arr) {
			System.out.print(x+" ");
		}
		
//		Print Array By Regular Method

//--------------------------------------------------------------------------------------------		

		
//		int arra[]  = {5,6,7,88};
//		
//		for(int i = 0 ; i<arra.length; i++) {
//			System.out.print(arra[i] + " ");
//		}
		
//--------------------------------------------------------------------------------------------		
	

		
		
		
		

	}

}
