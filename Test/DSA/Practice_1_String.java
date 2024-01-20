import java.util.*;

public class Practice_1_String {
	public static void main(String[] args) {
		
		Scanner kk =new Scanner(System.in);
		
// Q) Written Given String In capital Case
		
//		String s ;
//		System.out.print("Enter String ");
//		s = kk.nextLine();
//		s = s.toUpperCase();
//		System.out.print("New String - "+s);
		
// Q)  Remove "Space" And And put "_" <---this at that Place.
		
//		System.out.println();
//		s = s.replace(" ", "_");
//		System.out.println("New String - "+s);
		
// Q)  Put the Special Name At the Place of <|name|>
		
		String j = "Hello <|name|> , Thanks For Wish Me";
		j = j.replace("<|name|>", "Harsh");
		System.out.println(j);
		
// Q) WAP to detect double ANd triple Spaces in the string
		
		String l = "Hey  man please tell   where are  u going";
		int p = l.indexOf("   ", 0);
		int q = l.indexOf("  ");
		int r = l.indexOf("  ", p+3);
		System.out.println(p);	// 1st triple space
		System.out.println(q);	// 1st double space
		System.out.println(r);	// 2nd double space
		
//  Q) WAP to Count vowel In String
		
		String vo;
		int c =0;
		System.out.print("Enter String - ");
		vo = kk.nextLine();
		int in = vo.length()-1;
//		char ar[] = {'a','e','i','o','u'};
		String vowel = "aeiou";
		for(int i=0; i<=in; i++) {
			String a = vo.charAt(i)+"";
			if(vowel.contains(a)) {
				System.out.print(a +" ");
			}
		}
	
		
		
	}

}
