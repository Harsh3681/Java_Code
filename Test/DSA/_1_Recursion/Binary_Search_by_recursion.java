package _1_Recursion;

public class Binary_Search_by_recursion {

	public static boolean bs(int ar[],int s,int e, int k) {
		if(s>e) {
			return false;
		}
		int mid = s+ (e-s)/2;
		if(ar[mid]==k) {
			return true;
		}
		
		if(ar[mid]<k) {
			return bs(ar,mid+1,e,k);
		}else{
			return bs(ar,s,mid-1,k);
		}
	}
	
	public static void main(String[] args) {
		
//		Binary Search by Recursion
		
		int ar[] = {2,4,5,7,9,11,12,45,67 };
		System.out.println(bs(ar,0,ar.length-1,111));
	}

}
