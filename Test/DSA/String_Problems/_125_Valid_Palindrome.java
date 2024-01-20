package String_Problems;

import java.util.*;

public class _125_Valid_Palindrome {
	

    public static boolean Pal(String st){
        if(st.length()<0){
            return false;
        }
        int l = 0; int r=st.length()-1;
        while(l<r){
            if(st.charAt(l)!=st.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]",""); //<--- it is mainly for this kind of string "A man, a plan, a canal: Panama"
        boolean ans = Pal(s.toLowerCase());
        if(ans==true){
            return true;
        }
        return false;
    }
    
//    both above combine give ans
    
    
//    here 
//    The meaning of "[^a-zA-Z0-9]" is a regular expression pattern 
//    that matches any character that is not an uppercase letter, 
//    lowercase letter or number. The "^" character inside square 
//    brackets means "not", so the pattern matches any character that
//    is not in the range of a-z, A-Z or 0-9.
    

	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome("aba"));
		
		// TODO Auto-generated method stub
		
//	Que No - 125 "Valid Pallindrome"
		
//		String s = "A man, a plan, a canal: Panama";
//		System.out.println(s.length());
//		StringBuilder sb = new StringBuilder();
//		sb.append(s);
	
//		s = s.replaceAll("[^a-zA-Z0-9]","");
//        boolean ans = Pal(s.toLowerCase());
//        if(ans==true){
//            return true;
//        }
//        return false;
		
	
//______----------------------------------------------------------------------
		
		
//pro No - 1312 (Minimum Insertion Steps to Make a String Palindrome)
		
//		 public int minInsertions(String s) {
//		        int n = s.length();
//		        int[][] dp = new int[n+1][n+1];
//		        for (int i = 0; i < n; ++i)
//		            for (int j = 0; j < n; ++j)
//		                dp[i + 1][j + 1] = s.charAt(i) == s.charAt(n - 1 - j) ? dp[i][j] + 1 : Math.max(dp[i][j + 1], dp[i + 1][j]);
//		        return n - dp[n][n];
//		    }
		
		

	}

}
