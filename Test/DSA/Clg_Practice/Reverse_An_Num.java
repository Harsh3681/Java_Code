package Clg_Practice;

public class Reverse_An_Num {

	public static int rev(int n) {
		int r,s =0;
		while(n!=0) {
			r = n%10;
			s = (s*10) + (r);
			n = n/10;
		}
		return s;
	}

	public static void main(String[] args) {
	
		System.out.println(rev(98));
		
	}

}
