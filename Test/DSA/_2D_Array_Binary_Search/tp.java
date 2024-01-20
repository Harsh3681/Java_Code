package _2D_Array_Binary_Search;

import java.util.Arrays;

public class tp {

	public static int FindMaxOf2DArray(int[][] arr) {
		
//		int max = Integer.MIN_VALUE;
//		for(int i=0; i<)
		return 0;
		
	}
	
	public static void main(String[] args) {
		
		int grid[][] = {{1,2,4},{3,3,1}};
		
//		System.out.println(FindMaxOf2DArray(ar));
//		System.out.println(ar.length);
		for(int i=0; i<grid.length; i++)    Arrays.sort(grid[i]);
        int res = 0;
        
        for(int i=0; i<grid[0].length; i++){
            int max = 0;
            for(int j=0; j<grid.length; j++) {  
                max = Math.max(max, grid[j][i]);
//            	System.out.println(grid[j][i]);
                }
            res += max;
        }
//        System.out.println(res);
	}

}
