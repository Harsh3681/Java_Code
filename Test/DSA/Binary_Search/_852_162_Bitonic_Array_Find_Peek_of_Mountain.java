package Binary_Search;
import java.awt.geom.Area;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.IntStream;

public class _852_162_Bitonic_Array_Find_Peek_of_Mountain {

	public static int findPeek(int arr[], int first, int last) {
		
		while(first<last) {
			int mid = first + (last-first)/2;
			
			if(arr[mid]>arr[mid+1] ) {
				last= mid;	  // you are in dec part of array
							  // this may be the ans, but look at left
							  // this is why last ! = mid-1

			}
			else {
//				return findPeek(arr,mid+1,last);	// because we know that mid+1 element > mid element
				first = mid+1;
			}
			
		}
//		in the end, start - end and pointing to the
//		largest number because of the 2 checks above
//		// start and end are always trying to find max
//		element in the above 2 checks
//		// hence, when they are pointing to just one
//		element, that is the max one because that is what the
//		checks say
//		// more elaboration: at every point of time for
//		start and end, they have the best possible answer till that
//		time
//		// and if не are saying that only one item is
//		remaining, hence cuz of above line that is the best
//		possible ans

		return first;	// and change here return array[first]
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,-3,6,7,5,4,2,1};
		
		System.out.println(findPeek(arr, 0, arr.length-1));
//		here we will get output as an "index" of "ele on Peek" 
//		here i.e 7 index is 3
		
		
	
			
		
				
		  
		
	}
		
}


