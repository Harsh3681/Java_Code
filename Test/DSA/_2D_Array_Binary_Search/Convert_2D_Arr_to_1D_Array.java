package _2D_Array_Binary_Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Convert_2D_Arr_to_1D_Array {
//	----------------------------------------------------------------------------------------------------
//	find Max Ele
	
	public static int FindMaxOf2DArray(int[][] arr) {
		
		int max = Integer.MIN_VALUE;
		
		for(int tempArr[]:arr) {
			for(int item: tempArr) {
				if(item>max) {
					max = item;
				}
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		int arr[][] = {
				{11,14,15,18},
				{20,23,24,27},
				{30,32,35,40},
				{41,44,45,51},
				{52,55,56,57}	// and this below sol not use for (m*n) diff size matrix "here roe and col" must want same size
		};
		
//		Convert 2D Array ti 1D Array
//		1st approch
		
//		ArrayList<Integer> ans1 = new ArrayList<>();
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				ans1.add(arr[i][j]);
//			}
//		}
//		System.out.println(ans1);
	
//		----------------------------------------------------------
//		2nd Approch
		
		int[] ans2 = Stream.of(arr).
			     flatMapToInt(IntStream::of).toArray();
		 
		System.out.println(Arrays.toString(ans2));
		
//		----------------------------------------------------------

		
//		Now we find Max ele from the 2d Array
		
		int maxi = FindMaxOf2DArray(arr);
		System.out.println("Max ele in 2d Array "+maxi);
	}

}
