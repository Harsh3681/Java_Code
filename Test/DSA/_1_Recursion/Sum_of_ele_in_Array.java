package _1_Recursion;

public class Sum_of_ele_in_Array {

	public static int ArrSum(int arr[],int size) {
//		int s=arr.length;
		if(size<=0) {
			return 0;
		}
		
		return ArrSum(arr,size-1) + arr[size-1];
	}
	
//	-------------------------------------------------------------------
	
//	Multiplication of array using recursion
//	but here one base case we are not able to resolve if aaray is "empty" then we need answer 0; it gives 1
	
	public static int MultiRecursion(int ar[], int s) {
		int a=1;
		if(s==0) {
			return a;
		}
		return ar[s-1] * MultiRecursion(ar, s-1);
		
	}
//	-------------------------------------------------------------------

	public static void main(String[] args) {
		
		int ar[] = {2,4,2,5};
		System.out.println(ArrSum(ar,ar.length));
		
		System.out.println(MultiRecursion(ar,ar.length));
	}

}
