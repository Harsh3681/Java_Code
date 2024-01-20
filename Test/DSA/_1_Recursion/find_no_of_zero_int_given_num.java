package _1_Recursion;

public class find_no_of_zero_int_given_num {

	public static int find_zero(int n, int c) {
		if(n==0) {
			return c;
		}
		int r = n%10;
		if(r==0) {
			return find_zero(n/10, c+1);
		}
		return find_zero(n/10, c);
	}
	
	
	public static void main(String[] args) {
		int n = 102034010;
		System.out.println(find_zero(n, 0));
	}

}
