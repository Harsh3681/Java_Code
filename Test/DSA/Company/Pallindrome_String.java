package Company;

public class Pallindrome_String {
	
	public static boolean helper(int l, int r, String s){
        if(l>=r){
            return true;
        }
        if(s.charAt(l)!=s.charAt(r)){
            return false;
        }else{
            return helper(l+1, r-1, s);
        }
    }
	
	public static void main(String[] args) {
		 String s = "NayaN";
		 boolean ans =  helper(0, s.length()-1,s);
		 System.out.println(ans?"Yes":"No");
	}

}
