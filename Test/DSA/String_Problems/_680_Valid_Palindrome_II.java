package String_Problems;

import java.util.Stack;
public class _680_Valid_Palindrome_II {
	
    public static boolean Pal(String st, int l, int r){
        if(st.length()<0){
            return false;
        }
        while(l<r){
            if(st.charAt(l)!=st.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    
//  -----------------------------------------------------------------
    
    public static boolean TwoPointer(String st){
    	int l = 0; int r=st.length()-1;
    	while(l<r) {
    		if(st.charAt(l)==st.charAt(r)) {
    			l++;
    			r--;
    		}else {
    			return Pal(st,l+1,r) || Pal(st,l,r-1);
    		}
    	}
		return true;
    }
    
//    -----------------------------------------------------------------
    
    public static boolean isPalindrome(String s, int low, int high){
    	   while(low < high)
    	      if(s.charAt(low++) != s.charAt(high--)) return false;
    	   return true;
    	} 
    
//  -----------------------------------------------------------------
    
	public static void main(String[] args) {

		
	
//		another question then 680_Valid_Palindrome_II
		
		System.out.println(TwoPointer("abca"));		// true
		System.out.println(TwoPointer("abc"));		// false
		
//		isPalindrome
		String a = "abbc"; String b = "abba";
		
		if(isPalindrome(b,0,a.length()-1)) {
			System.out.println("yos");
		}else {
			System.out.println("Np");
		}
		
		

	}

}
