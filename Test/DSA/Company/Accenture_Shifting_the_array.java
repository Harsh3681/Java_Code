package Company;

import java.util.Arrays;

public class Accenture_Shifting_the_array {

	public static void main(String[] args) {
		
//		You need to shifting the array in such way that given below
//		I/p = [7, -1, -4, 3, -2, 11, -2]
//		O/p = [-1, -4, -2, -2, 7, 3, 11]

		
		int ar[] = {7,-1,-4,3,-2,11,-2};
		int j=0, ele;
		
		for(int i=1; i<ar.length;i++) {
			
			if(ar[i]<0) {
				ele = ar[i];
				
				for(int k=i; k>j; k--) {
					ar[k] = ar[k-1];
				}
				ar[j] = ele;
				j++;
			}
		}

		System.out.println(Arrays.toString(ar));
	}

}
