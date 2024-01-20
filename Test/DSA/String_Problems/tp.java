package String_Problems;

public class tp {
	
	public static boolean isPal(String s, int l, int r) {
		if(s.length()<0) {
			return false;
		}
		while(l<r) {
			if(s.charAt(l)!=s.charAt(r)) {
				return false;
			}else {
				l++;
				r--;
			}
		}
		return true;
	}
	
	public static boolean TwoPointer(String s) {
		int l=0, r=s.length()-1;
		while(l<r) {
			if(s.charAt(l)==s.charAt(r)) {
				System.out.println(s);
				l++;
				r--;
			}
			else return isPal(s,l+1,r) || isPal(s,l,r-1);
		}
		
		return true;
	}

	public static void main(String[] args) {
		
//		System.out.println(TwoPointer("aab"));
		String s = "aab";
		int i=0,j=0, n=s.length();
		while(j<n) {
			j++;
			
		}
		
		System.out.println(1/2);
		
		
		
	}

}
