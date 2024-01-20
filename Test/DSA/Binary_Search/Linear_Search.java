package Binary_Search;

import java.util.Collections;
import java.util.*;

public class Linear_Search {

	public static boolean find_by_Recursion(int ar[],int size, int key) {
		if(size == 0) {
			return false;
		}
		if(ar[size-1]==key) {
			return true;
		}else {
			return find_by_Recursion(ar, size-1, key);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 here we can an array thought until get the require target
		
		int[] arr = {23,56,12,86,48,867,4,232};
		int target=4;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println("target "+ target +" At index "+i);
				break;
			}
		}
		
//		------------------------------------------------------------------
//		Now by recursion
		
		System.out.println(find_by_Recursion(arr, arr.length, target));

		
	}

}
