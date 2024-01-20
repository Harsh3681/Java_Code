package _2D_Array_Binary_Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Search_Ele_in_row_col_wise_sorted_array {

	public static int[] search(int[][] ar, int tar) {
		int r=0;
		int c= ar.length-1;		// why start "col" from last 
//		becz you can last ele in each col is greater then remaining all ele in that row
		
		while(r<ar.length && c>=0) {
			if(ar[r][c]==tar) {
				return new int[] {r,c};
			}
			if(ar[r][c]<tar) { 
				r++;
			}
			else {
				c--;
			}
		}
		return new int[] {-1,-1};
	}
	
	
	public static void main(String[] args) {
		int arr[][] = {
				{11,14,15,18},
				{20,23,24,27},
				{30,32,35,40},
				{41,44,45,51},
//				{52,55,56,57}	// and this below sol not use for (m*n) diff size matrix "here roe and col" must want same size
		};
//		here each ele see rowwise and colwise also be greater in ascending order
		int tar = 45;
			
		System.out.println(Arrays.toString(search(arr,tar)));
		
		
		
//		######### Time Complexity #######
		
//				n * n time we search in array
//				so    "2n"  	Time Complexity
//				but as we remove the constant 
//			Time Complexity --> "O(N)"
		
		
		
//		----------------------------------------------------------
		
	
	}

}
