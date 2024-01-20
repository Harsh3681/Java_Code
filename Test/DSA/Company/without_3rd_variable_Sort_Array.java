package Company;

import java.util.Arrays;

public class without_3rd_variable_Sort_Array {

	private static int[] sort_without_3rd(int[] ar) {
		for(int i=0; i<ar.length; i++) {
			for(int j=i; j<ar.length; j++) {
				if(ar[i]>ar[j]) {
					ar[i] = ar[i] + ar[j];
					ar[j] = ar[i] - ar[j];
					ar[i] = ar[i] - ar[j];
				}
			}
		}
		return ar;
	}
	public static void main(String[] args) {
		int ar[] = {3,6,1,3,9,0,44};
		ar = sort_without_3rd(ar);
		System.out.println(Arrays.toString(ar));
	}

	

}
