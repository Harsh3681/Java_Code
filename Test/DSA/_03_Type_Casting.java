import java.util.*;

// 				**********Type casting in Java***********



/*	#	Integral family								#	Float family
 * 	 Data Types		"bytes" Req					Data Types		"bytes" Req
 * 			
 * 		byte		   	1						   float			4
 * 		short			2						   double			8
 * 		int				4
 * 		long			8						
 * 													#	Char Family
 * 												Data Types		"bytes" Req
 * 
 * 													Char			2		(unicode)
 * 										  in "C++"  Char            1
 * 
 * 													#	Booleans Family
 * 												Data Types		"bit" Req
 * 
 * 													True		1 bit
 * 													False		1 bit
 * 
 * 		
 * 			destination		source			yes/No		<--- casting Is Possible Or Not
 * 				
 * 				int		<-	 long			 Not		int take 4 byte and long takes 8 bytes so casting is generally not posiible
 * 				short	<-	 byte			 Yes
 * 				double	<-	 float			 Yes
 * 				short	<-	 int			 Not	
 * 				float	<-	 double			 Not
 * 				char	<-	 int			 Not
				int		<-   char			 Yes
  
		
		
*/

public class _03_Type_Casting {
	public static void main(String [] args) {
		
		System.out.println("Type Casting");
		Scanner kk = new Scanner(System.in);
		char a = 'A';
		int b = (int)(a);
		System.out.println(b);
		
		int k = 122;
		char l = (char)(k);
		System.out.println(l);
		
		float p = 9995554f ;
		byte g = (byte)(p);
		System.out.println(g);
		
		double j = (int)(5);
		System.out.println(j);
		
		System.out.println((char)(65)+" "+(char)(90)+"\n"+(char)(97)+" "+(char)(122));
		System.out.printf("%.2f",(5.782882));
		
		
		
		
	}

}
