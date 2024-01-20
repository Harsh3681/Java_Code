package Company;

public class Pascal_triangle_by_nCr {

	public static int facto(int n) {
		if(n==0) {
			return 1;
		}
		return n * facto(n-1);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n=5;
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<=n-i ; j++) {
//				System.out.print(" ");
//			}
//			for(int r=0; r<=i; r++) {
//				System.out.print(" "+ facto(i)/(facto(n-r)*facto(r)));
//			}
//			System.out.println();
//		}
		
		

	}

}
