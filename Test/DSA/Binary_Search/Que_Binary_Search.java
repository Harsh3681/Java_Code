package Binary_Search;

public class Que_Binary_Search {
	
	// code for ceil
	public static int FindCeil(int arr[], int first, int last, int target) {
		
		int mid = first + (last-first)/2;
		System.out.println("mid "+mid+" "+arr[mid]);
		
		while(first<last) {
			if(arr[mid]==target) {
				return arr[mid];		// jsut we are making changes that return Array value
			}
			else if(arr[mid]<target) {
//				first = mid+1;
//				Or
				return FindCeil(arr,mid+1,last,target);
			}
			else {
//				last = mid-1;
//				Or
				return FindCeil(arr,first,mid-1,target);
			}
		}
		
		return arr[first];	// and change here return array[first]
	}
	
//  code for floor
	public static int FindFloor(int arr[], int first, int last, int target) {
		
		int mid = first + (last-first)/2;
		
		while(first<=last) {
			if(arr[mid]==target) {
				return arr[mid];		// jsut we are making changes that return Array value
			}
			else if(arr[mid]<target) {
				return FindFloor(arr,mid+1,last,target);							
			}
			else {
				return FindFloor(arr,first,mid-1,target);
			}
		}
		
		return arr[last];	// and change here return array[first]
	}

//	---------------------------------------------------------------
	
	public static void main(String[] args) {
		
		
//		How to find the Que is base on the Binary Search Technique
//		Simple "Array" given is in "Ascending Order"
		
		
//	Q)	Find "Ceiling" and "floor" for the "Target" from array
		
		int arr[] = {2,3,5,9,14,16,20};
		int target =18;
		
//		Ans
		
		int first = 0;
		int last = arr.length-1;
		
//		here "Ceiling"	is an "Smallest ele in array that greater then equal to "target" ele
		int ceil = FindCeil(arr, first, last,target);
		System.out.println("ceil "+ceil);
		
//		here "Floor"  is an ""Largest" ele in array that "smaller" then equal to "target" ele
		int floor = FindFloor(arr, first, last,target);
		System.out.println("floor "+floor);
		
		System.out.println("div "+ (0.33333+1+0.66667));
		
		
	}

}
