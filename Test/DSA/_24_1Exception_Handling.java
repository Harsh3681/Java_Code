
import java.util.*;


public class _24_1Exception_Handling {

	private static boolean String;

	public static void main(String[] args) {
		
		Scanner kk = new Scanner(System.in);
		
//	ArithmeticException
		
//		int a=10, b=5, c=3;
//		
//		try {
//			
//			int d = (a/(b-c));
//			System.out.println("D = "+d);
//			
//		}
//		catch(Exception e){
//			
//			System.out.println("Exception Handling");
//			System.out.println(e);
//		}
//		
//		int p = (a/(b+c));
//		System.out.println("D = "+ p);
		
		
//	ArrayIndexOutOfBoundsException
		

//		int k[]= {5,7,9,4,6};
//		System.out.print("Enter num - ");
//		int n = kk.nextInt();
//		try {
//			System.out.println("Index - "+ (k[n]));
//		}
//	
//		catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("Exception "+ e);
//		}
////		
//		System.out.println("Correct");
		
		
		
//		NumberFormatException
		
		
		String h = "ABC";
		System.out.print("Enter num - ");
		int j = kk.nextInt();
		String g = kk.nextLine();
		try {
			j = Integer.parseInt(h);
		}
		catch(NumberFormatException e){
			System.out.println("h "+ j);
			System.out.println(e.getMessage());
		}
	
		

		
		
		
		
		
		
		
	}

}
