package Data_Structure_Java;

public class Sorting_In_Java {

	public static void sortt(int arr[]) {
		int temp;
		
		// In Ascending Order
//		In descending order
		
		// bubble sort means to biggest elem asel tyala just last la takne Compare karun
		//		"arr.length-i-1"		<-- means know ignore that last place
		
		
//		"BestCase" TC  O(n)		<--- when array is already sorted	
//		Worst Case TC  O(n^2)   <--  when array is not already sorted		best case --->  O(Log n)
		
//		Here "N" is no.of comparison
		
//		bubble sort also non as "Inplace Sorting Algo"
		
		
		//	###########  bubble Sort	############
		
//		for(int i=0; i<=arr.length-1; i++) {
//			for(int j=0; j<arr.length-i-1; j++) {
//				if(arr[j]>arr[j+1]) {					//  "<"	sign	descending
//													//  ">"	sign	Ascending			
//					temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
		
		
		// 	###########  selection Sort	  ############
		
//		Time Complexity  O(n^2)   <-- worst case time complexity
		
		// here sorting Done for one-one by elements at a time only one element get SOrt 
		
//		for(int i=0; i<=arr.length-1; i++) {
//			for(int j=i; j<arr.length-1; j++) {
//				int small = i;
//				
//				if(arr[small]>arr[j]) {
//					small = j;
//				}
//				
//				temp = arr[small];
//				arr[small] = arr[i];
//				arr[i] = temp;

//				
//			}
//		}
		
		
		// ###########   Insertion sort   ###########
		
		// here we done sorting As Placing UnSorted elem in sorted array in Same Array
		
		for(int i=0; i<=arr.length-1; i++) {
			int current  = arr[i];
			int j= i-1;
			
			while(j>=0 && current<=arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = current;
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {7,8,25,3,1,2};
		sortt(array);
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
