package Binary_Search;

public class Recursion_Search_in_Rotated_Sorted_Array {

//	here we are returning an "index"
	
	public static int Search_in_rotated_Array(int arr[],int tar, int start, int end) {
		
//		let's take here is our given array {4,5,6,7,0,1,2}
		
		if(start>end) {
			return -1;
		}
		int mid = start+(end-start)/2;
		if(arr[mid] == tar) {
			return mid;
		}
		if(arr[start]<arr[mid]) {		// here we checking first section of array i.e if our "tar" = "5" then below given condition satisfied when mid is 7 becz of ind 0+6/2 = 3 arr[3] = 7
			if(tar>=arr[start] && tar<=arr[mid]) {
				return Search_in_rotated_Array(arr, tar, start, mid-1);
			}
			return Search_in_rotated_Array(arr, tar, mid+1, end);
		}
//		if our target in next section i.e from "7 to 2" then below conditions
		
		if(tar>=arr[mid] && tar<=arr[end]) {
			return Search_in_rotated_Array(arr, tar, mid+1, end);
		}
		return Search_in_rotated_Array(arr, tar, start, mid-1);
	}
	
	public static void main(String[] args) {
		
//		https://www.youtube.com/watch?v=sTdiMLom00U&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=28
		
		
		int arr[] = {4,5,6,7,0,1,2}; // here ind start from 0 end at arr.length-1;
		System.out.println(Search_in_rotated_Array(arr,6,0,arr.length-1));
	}

}
