package Binary_Search;

public class _1095_Find_The_Mountain_in_Array {
	
	public static int GetPeekIndexValue(int arr[]) {
		int start=0,end=arr.length-1;
		while(start<end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid]>arr[mid+1]) {		// then ur on descending side of array
				end = mid;
			}
			else {
				start = mid+1;
			}
		}
		return end;	// here "start" and "end" both are same
		
	}
	
	public static int Search(int arr[],int tar) {
		int peek = GetPeekIndexValue(arr);
		int firstTry = SimpleBinarySearch(arr,tar,0,peek);
		
		if(firstTry!=-1) {
			return firstTry;
		}
		return SimpleBinarySearch(arr,tar,peek,arr.length-1);
	}

	public static int SimpleBinarySearch(int[] arr, int tar, int first, int last ) {
		
		while(first<=last) {
			int mid = first + (last-first)/2; 				
			if(arr[mid]==tar) {
				return mid;
			}
			if(arr[mid]<tar) {

				first = mid+1;
			}
			else if(arr[mid]>tar){
				last = mid-1;
			}
			else {
				return mid;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		
//		Que 1095 . Find The Mountain in Array
		
		
		int arr[] = {1,2,3,4,5,3,1}; int tar=3;
		
//		Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
		
//		here we can see upto 3 it is an ascending list after that it is an descending list and that peek ele "3" is our target i.e "Peek" of mountain
		
		System.out.println(Search(arr, tar));

		
		
		
	}

}
