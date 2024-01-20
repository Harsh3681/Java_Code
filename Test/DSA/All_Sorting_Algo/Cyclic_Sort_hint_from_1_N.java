package All_Sorting_Algo;

import java.util.Arrays;

public class Cyclic_Sort_hint_from_1_N {

	public static void cyclic(int arr[]) {
		int i=0;
		while(i<arr.length) {
			int correct = arr[i]-1;		// why we take "arr[i]-1" becz each ele is in range "1 - N" 
										// so lets ele 3 always at index "2" becz array counting always start from "0"
										// hence there correct position is "2" same for all ele
			if(arr[i]!=arr[correct]) {
				int temp = arr[i];
				arr[i] = arr[correct];
				arr[correct] = temp;
			}else {
				i++;
			}
		}
	}
	
	public static void main(String[] args) {
		
// ###########   Cyclic sort   ###########
		
//		Worst Time Complexity  O(n)   <-- worst case time complexity
		
//		BestCase Complexity  O(1)	<--- Becz we just need to put array ele on there position

//		 %%%%%%%%%% NOTE %%%%%%%%%%%
		
//		int array[] = {7,8,-25,-3,1,2};		<--- it will "Not" applicable for this kind of array
		
		
// 		applicable for only array contains ele between 1 to N  
//		see here below  It is from 1 to 5 ele and also array length is "5" <-- all ele between this range

		int array[] = {3,5,2,4,1};  			
		// int array[] = {3,5,2,1,4,6,10,8,9,7}; // <--- work well with this also
		
		
		cyclic(array);
		System.out.println(Arrays.toString(array));
		
		
		
		
	}

}
