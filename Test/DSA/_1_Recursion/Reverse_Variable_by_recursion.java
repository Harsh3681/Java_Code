package _1_Recursion;

public class Reverse_Variable_by_recursion {

	static int ans = 0;  /// <-------- very very Impppppppppppppppp
	public static int reveseMe(int n) {
		if(n==0) {
			return n;
		}
		if(n>0) {
			ans = ans*10+(n%10);
			reveseMe(n/10);
		}
		return ans;
	}
	
//	--------------------------------------------------------------------
//	Without Recursion
	
	public static int rev(int n) {
		int s=0;
		while(n!=0) {
			s = s*10 + n%10;
			n = n/10;
		}
		return s;
	}
	
	
	
	public static void main(String[] args) {
		int n = 234;
		System.out.println(reveseMe(n));
		
//		Without Recursion
		System.out.println(rev(n));
	}

}
