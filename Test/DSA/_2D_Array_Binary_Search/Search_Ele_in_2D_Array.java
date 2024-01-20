package _2D_Array_Binary_Search;

import java.util.Arrays;

public class Search_Ele_in_2D_Array {

	public static void main(String[] args) {
		
		int arr[][] = { {18,9,21},
						{20,25,23},
						{11,34,22}
					  };
		int tar = 23;
		int r=0;
		for(int ak[]:arr) {
//			System.out.println(Arrays.toString(ak));
			for(int i=0; i<ak.length;i++) {
				if(ak[i]==tar) {
					System.out.println("row "+r+" col "+i);
					break;
				}
			}
			r++;
		}
		
		
//		######### Time Complexity #######
		
//					O(n2)

	}

}
