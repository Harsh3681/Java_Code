package _1_Recursion;

public class Pallindrome_Number {
	static int ans = 0;
	public static int reverse(int n) {
		if(n==0) {
			return n;
		}if(n>0) {
		ans = ans*10 + (n%10);
		reverse(n/10);
		}
		return ans;
	}
	
	
	
	public static boolean Pali_Num(int n) {
		boolean flag = true;
		return flag = (n==reverse(n)) ? true : false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=-121;
		System.out.println(Pali_Num(n));
	}

}
