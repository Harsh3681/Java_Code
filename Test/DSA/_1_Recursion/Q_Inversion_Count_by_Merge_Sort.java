package _1_Recursion;

public class Q_Inversion_Count_by_Merge_Sort {

//	Inversion Count for an array indicates – how far (or close) the array is from being sorted. 
//	If the array is already sorted, then the inversion count is 0, but if the array is sorted 
//	in reverse order, the inversion count is the maximum. 

//	Given an array arr[]. The task is to find the inversion count of arr[]. 
//	Where two elements arr[i] and arr[j] form an inversion if a[i] > a[j] and i < j.
	
	
//LeetCode	(775)
//	https://leetcode.com/problems/global-and-local-inversions/solutions/1370931/java-o-n-solution
	
	public static int Inversion_Count(int ar[], int size) {
//		base case
		if(size==0 || size==1) {
			return 0;
		}
		int temp,co=0;
		for(int i=0; i<size-1; i++) {
			for (int j = i + 1; j < size; j++)
				if(ar[i]>ar[j]) {
					
					co++;
				}
		}
//		Inversion_Count(ar,size-1);  // here is ####### recursion #######
		
		return co;
	}
	
	
	public static void main(String[] args) {
		
		int ar[] = {5,7,1,2,3}; 
//		ot = 6
//		int ar[] = {5,7,9,11,3,2,4,5}; 
//		ou = 16
		
//		means How we get this out put answer see in book (wahi)
		System.out.println(Inversion_Count(ar, ar.length));
		
	}

}
