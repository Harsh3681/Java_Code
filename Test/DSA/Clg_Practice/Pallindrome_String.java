package Clg_Practice;

public class Pallindrome_String {
	public static boolean PallindromeOrNot(String str) {
		if(str.length()<0) {
			return false;
		}
		int start = 0, end = str.length()-1;
		while(start<end) {
			if(str.charAt(start)==str.charAt(end)) {
				return true;
			}
			start++;
			end--;
		}
		return false;
	}
	
	public static boolean CheckPalli(String str) {
		String low = str.toLowerCase();
		if(PallindromeOrNot(low)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(CheckPalli("aba"));
		
	}

}
