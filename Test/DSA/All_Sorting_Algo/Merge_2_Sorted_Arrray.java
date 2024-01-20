package All_Sorting_Algo;

import java.util.Arrays;

public class Merge_2_Sorted_Arrray {

	public static int[] Merguu(int a[], int b[]) {
		int mix[] = new int[a.length+b.length];
		int i=0, j=0,k=0;
		if(a.length==0 && b.length==0) {
			return mix;
		}
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				mix[k] = a[i];
				i++;
			}else {
				mix[k] = b[j];
				j++;
			}
			k++;
		}
		while(i<a.length) {
			mix[k] = a[i];
			i++; k++;
		}
		while(j<b.length) {
			mix[k] = b[j];
			j++; k++;
		}
		return mix;
	}
	
	public static void main(String[] args) {
		
//		This approach we already used in Merge Sort
		int ar1[] = {3,5,7,9,11};
		int ar2[] = {2,3,8,9,13,14,25};
		int mix[] = Merguu(ar1, ar2);
		System.out.println(Arrays.toString(mix));
	}

}
