package Data_Structure_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.Stack;
import java.util.stream.Stream;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Set_Matrix_to_zero_DP {

	public static void main(String args[]) {
	    
		
		// Q)   Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
		
//		Input: 		arr = [[1,1,1],[1,0,1],[1,1,1]]
//		Output: 	 [[1,0,1],[0,0,0],[1,0,1]]
		
//		[[0,1,2,0],[3,4,5,2],[1,3,1,5]]
		
		int arr[][] = {};
		int r,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("e");
		r = sc.nextInt();
		c = sc.nextInt();
		arr = new int[r][c];
		System.out.println("r "+arr[0].length);
		System.out.println("c "+arr.length);

//		for(int p=0; p<r; p++){
//			System.out.println("En - "+p+1);
//	        for(int j=0;j<c; j++){
//	        	int hh = sc.nextInt();
//	        	arr[p][j] = hh;
//	        }
//		}
//		
//		int flag = 1;
//		for(int i=0; i<r; i++){
//			if(arr[i][0]==0) flag=0;
//	        for(int j=1;j<c; j++){
//	        	if(arr[i][j]==0) {
//	        		arr[i][0] = arr[0][j] = 0;
//	        	}
//	        }
//		}
//		
//		for(int i= r-1; i>=0; i--) {
//			for(int j= c-1; j>=1; j--) {
//				if(arr[i][0]==0 || arr[0][j]==0) {
//					arr[i][j] = 0;
//				}
//			}
//			if(flag==0) {
//				arr[i][0] = 0;
//			}
//		}
//		
//		System.out.println("Mat\n");
//		for(int i=0; i<r; i++){
//	        for(int j=0;j<c; j++){
//	        	System.out.print(arr[i][j]+" ");
//	        }System.out.println("\n");
//		}
		
		
	}

}
