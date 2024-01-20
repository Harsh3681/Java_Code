package _1_Recursion;

public class Sequence_Reverse {

	public static void naturalOrder(int n) {
		if(n==0) {
			return ;
		}else {
			System.out.print(n+" ");
			// we can do --n here but not n--
			naturalOrder(n-1);		// valid
//			naturalOrder(--n);		// valid
//			naturalOrder(n--);		// Invalid
		}
	}
	
	public static void reverseOrder(int n) {
		if(n==0) {
			return ;
		}else {
			reverseOrder(n-1);
			System.out.print(n+" ");
		}
	}
	
	public static void main(String[] args) {
		naturalOrder(6);
		System.out.println();
		reverseOrder(5);
	}

}
