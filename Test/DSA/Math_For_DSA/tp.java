package Math_For_DSA;

public class tp {

	public static void find(int n) {
		if(n==0) {
			return ;
		}else {
			find(n-1);
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		find(5);
		
		
		
	}

}
