package Data_Structure_Java;

import java.util.ArrayList;
import java.util.Arrays;

public class Recursion_Java {

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
		if(r==1|| c==1) {
			return 1;
		}
		return boxWay(r-1,c) + boxWay(r, c-1);
		
		 
	}
//	--------------------------------------------------------------------------------------------

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Q) Below Que Id for Find The Sum of "n" Natural Number by Recusion 
		System.out.println(Nnatural(5));
//		--------------------------------------------------------------------------------------------
		
//		Q)  Calculate a^b by "Recursion";
		System.out.println(pow(5,5));
		
		
//		--------------------------------------------------------------------------------------------
//		Q) box Way sum problem
		
		System.out.println(boxWay(3,5));
		
		
		
	}

}
