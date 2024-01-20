package String_Problems;

public class Pallindrome_String {

	private static String Palindrome(String s) {
		if(s.isEmpty()) {
			return "";
		}
		return Palindrome(s.substring(1))+s.charAt(0);
		
	}
	
//	---------------------------------------------------------
	
	 public static boolean isPalindrome(String s, int low, int high){
  	   while(low < high)
  	      if(s.charAt(low++) != s.charAt(high--)) return false;
  	   return true;
  	} 
	
	
	public static void main(String[] args) {
		String s = "abbababkabba";
		System.out.println(Palindrome(s).equals(s));
		
//		-------------------------------------------------------------
		
//		Pallindrome Above by "Recursion"
//		below by 2 Pointers
		
		
		int i=0, j=s.length()-1;
		boolean ty=true;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				ty=false;
				break;
			}
			i++; j--;
		}
		if(ty) {
			System.out.println("y");
		}else {
			System.out.println("n");
		}
//	-------------------------------------------------------------
		
		if(isPalindrome(s, 0, s.length()-1)) {
			System.out.println("y");
		}else {
			System.out.println("n");
		};
		
		
		
	}

}
