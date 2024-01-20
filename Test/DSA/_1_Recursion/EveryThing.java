package _1_Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class EveryThing {
	

//	Q) Below Que Id for Find The Sum of "n" Natural Number by Recusion 
	
//	 Thuis Both Problem works in O(n) timeComplexity becz loop run upto "n" times
	
	public static int Nnatural(int a) {
		if(a==0) {
			return 0;
		}
		return a+ Nnatural(a-1);
	}
	
//	--------------------------------------------------------------------------------------------

//	Q)  Calculate a^b by "Recursion";
	
	public static int pow(int x, int y) {
		if(y==0) {
			return 1;
		}
		return (pow(x,y-1)*x);
				
	}
//	--------------------------------------------------------------------------------------------

//	Q) Box Problem see it on Aptitude vahi end page
	
	public static int boxWay(int r, int c) {		// but it is not optimal solution
		if(r==1 || c==1) {
			return 1;
		}
		return boxWay(r-1,c) + boxWay(r, c-1);
		
		 
	}
//	--------------------------------------------------------------------------------------------
	
//	Array Sorted Or not
	
	static boolean ArraySortedOrNot(int arr[], int n) {
//		 n = lemgth of array
		if(n==0 || n==1) {
			return true;
		}
		return arr[n-1] >= arr[n-2] && ArraySortedOrNot(arr, n-1);
		
	}
	
//	--------------------------------------------------------------------------------------------

	
	
	public static void main(String[] args) {

		
		int ar[]= {2,4,1,5,8};
		System.out.println("ArraySortedOrNot "+ArraySortedOrNot(ar,ar.length));
		
//		Q) Below Que Id for Find The Sum of "n" Natural Number by Recusion 
		System.out.println(Nnatural(5));
//		--------------------------------------------------------------------------------------------
		
//		Q)  Calculate a^b by "Recursion";
		System.out.println(pow(5,85));
		
		
//		--------------------------------------------------------------------------------------------
//		Q) box Way sum problem
		
		System.out.println(boxWay(3,3));
		
		
		
		
	}

}
