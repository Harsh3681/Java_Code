import java.util.Scanner;

public class _02_Strings {

	public static void main(String[] args) {
		
		Scanner kk = new Scanner(System.in);
		 
		Scanner sc = new Scanner(System.in);
		
//		String a = "Harsh";
//		System.out.println("A= "+ a);
		
//		System.out.println("Enter");
//		String j = kk.next();
//		System.out.println("Single Word -> "+j);
//		
//		System.out.println("Enter");
//		String h = sc.nextLine();
//		System.out.println("Along With Space -> "+h);


// ----------------------------------------------------------------------------------------------
		
		
		
/*		We used %d %f   wala format is called "Format Specifier"		

		%d		int
		%f		float
		%c		char
		%s		string
		
		********** Different Way of "Printing" ***********
		
		System.out.println()		// print on New line
		
		System.out.print()			// On Same line
		
		System.out.printf()	or System.out.format()		// print Along with format Specifier %d%f%c%s
		
*/	

// ----------------------------------------------------------------------------------------------

		
		int p =8;
		float q =9.2456334f;
		char c = 'S';
		String s = "Happy";
		
		System.out.println(p);
		System.out.print(q);
		System.out.println();
		System.out.printf("value of p= %d and q= %.2f  and c= %c and String= %s ",p,q,c,s);
										// above %.2f means after point only 2 digits
		System.out.println();
		
//		System.out.format("value of p= %d and q= %f  and c= %c and String= %s ",p,q,c,s);
//		
		
		
// ----------------------------------------------------------------------------------------------

		
//		************ String Methods *************
		
		
//					   0123456
		String name = "Bhaskar";
		
		System.out.println(name);
		
		int d = name.length();
		System.out.println(d);
		
		String ls = name.toLowerCase();
		System.out.println(ls);
		
		String lk = name.toUpperCase();
		System.out.println(lk);
		
		String hu = name.concat(" Patil");
		System.out.println(hu);
		
		byte []b = name.getBytes();
		System.out.println(b);
	
		
// ----------------------------------------------------------------------------------------------

		
		
//		Trimming the String
		String u = "    HashCode	";
		System.out.println(u);
		
		String hh = u.trim();		 //	.trim();		to remove the extra space of string
		System.out.println(hh);
		
		System.out.println("subString = " + name.substring(3));  // To written the string start from given "index"
		
		
		
		System.out.println("subString "+ name.substring(1,6));	// start from 1 and end at 6-1
		System.out.println("subSequece "+ name.subSequence(1,6));
		
		System.out.println(name.replace('a', 'p'));	 // replace 'a' with 'p'
		
		
		System.out.println(name.replace("Bha", "bhai")); 	// word also be change
		
		
		System.out.println(name.startsWith("Bha"));	   // Give "True" or "false" value if "Start" with
		System.out.println(name.endsWith("skar"));    	// endWith() 
		
		
		System.out.println(name.charAt(4));  		// Gives The char at given index

		
		System.out.println(name.indexOf('a')); 	  	// written The index of given Char and String
		
		
		System.out.println(name.indexOf("kar", 3));	 // give it the "char" or "String" and 
		// find out its index and tell index  "find" "index"
		
		
		String pi = "HarKhushalhal";
		System.out.println(pi.lastIndexOf('a'));	// becz in "HarKhushalhal"  'a' lastIndex is 11
		System.out.println(pi.lastIndexOf("hal",9));	// means Magun start hoil 9 "l" pasun start hoil and 0 parayanta jail
														// and 7th index pasun "hal" Ahe hence ans 7
		
		
		System.out.println(name.equals("bhaskar"));  // becz not equal to "Bhaskar" written "false" 
												// to written it "true" we have equalsIgnore()
		
		
		System.out.println(name.equalsIgnoreCase("bhaskar"));	// Now it written "True" 
		
		
		System.out.println("\"Hi My Name Is Harshal\"");
		System.out.println("\"Hi My Name Is Harshal\"" + " \"From that day\"");
//		( \" )		<----- used to put double quotes( " ) in string without Error
		
		
		
// ----------------------------------------------------------------------------------------------

		
//		**************** Used Of StringBuffer *******************
		
		
/*		Methods In String Buffer
 * 
 * 		.append();
 * 		.insert();
 * 		.delete();
 * 		.deleteCharAt();
 * 		.replace();
 * 		.reverse();
 * 
*/		
		
		StringBuffer ss = new StringBuffer("Hello");
		ss.append(" name");
		System.out.println(ss);
		
	}

}
