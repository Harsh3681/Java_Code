import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;			// <-- For math Class

public class Practice_3_Array {

	public static void main(String[] args) {

		Scanner kk =new Scanner(System.in);
		
//	Q)	Binary Searching Of Array
//		It is Different way Of Searching Of An Array
		
		
		System.out.println("ENter 5 Elemnts");
		int arr[] = new int[5];
		for(int i=0; i<5; i++) {
			System.out.print(i+1 +" Enter ");
			arr[i] = kk.nextInt();
		}
	
//		System.out.print("Search - ");
//		int sea = kk.nextInt();
		
//		boolean He = false;
//		for(int x : arr) {
//			if(x==sea) {
//				He = true;
//				break;
//			}
//		}
//		
//		
//		if(He) {
//			System.out.println("Present");
//		}
//		else {
//			System.out.println("Not present");
//		}
		
		
//-------------------------------------------------------------------------------------

// Q) WAP to read 5 String as input for Array And Print the each String Length
		
		
//		String arr[] = new String[5];
//		System.out.println("Enter 5 String");
//		for(int i =0 ; i<5; i++) {
//			System.out.print("Enter ");
//			arr[i] = kk.nextLine();
//		}
//		
//		for(String j : arr) {
//			int l = j.length();
//			System.out.println(j+"  length = "+l);
//		}
		
//  Q) Along With Program to Print an String start With Char 'a' or 'A'	
		// we has to used 		.charAt(index)	<--	instates of j[0]
		
//		for(String j : arr) {
//			if(j.charAt(0)=='a' || j.charAt(0)=='A')	// j.charAt(0)	to find at specific index
//				System.out.println(j);
//		}
//		
	
//--------------------------------------------------------------------------------------------

//	Q) Reverse An Array
//		Here We Used Concept of "swapping two numbers"	By using "temp" Variable
//		let's swap "x"  &  "y"
		
//		temp = x
//		x = y
//		y = temp
		
		
		
//		int l = arr.length;
//		int mid = Math.floorDiv(l, 2);
//		int temp;
//		for(int i=0; i<mid; i++) {
//			
//			temp = arr[i];
//			
//			arr[i] = arr[l-1-i];
//			
//			arr[l - 1 - i] = temp;
//			
//		}
		
//	Print reverse array
		
//		for(int x:arr) {
//			System.out.print(x+ " ");
//		}
		
//--------------------------------------------------------------------------------------------
	
// WAP To Find An "Max"	Element in array
		
//		int max = arr[0];
//		for(int x=0 ; x<arr.length; x++) {
//			if(arr[x] > max) {
//				max = arr[x];
//			}
//		}
//		
//		System.out.println("Max = "+ max);
		
//--------------------------------------------------------------------------------------------

//	******************  Bubble Sort Algorithm to Sorting an array
		
//		int temp;
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<(arr.length-i-1); j++) {
//				if(arr[j]> arr[j+1]) {
//					temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
//		
//		for(int x=0 ; x<arr.length; x++) {
//			System.out.print(arr[x]+ " ");
//		}
		
//--------------------------------------------------------------------------------------------
		
//	********************* Insertion Sort Algorithm to sort an Array
		
//							 pass 	
//						0	  1		2	  3	    4	
//	lets	arr[5] = {	5, |  9,    16,   14,   7 	}
//						j	 key
		
//		 							pass 	
//						0	  1		2	 	 3	    4	
//	lets	arr[5] = {	5, |  9,    16,   	14,     7 	}
//						  	  j	    key
		
//											pass 	
//						0	  1		2	 	 3	    4	
//	lets	arr[5] = {	5, |  9,    16,   	14,     7 	}
//			  						j	    key
		
//												   pass 	
//						0	  1		2	 	 3	    4	
//	lets	arr[5] = {	5, |  9,    16,   	14,     7 	}
//											j	    key
		
//		int key;
//		int j;
//		for(int pass=1; pass<(arr.length-1); pass++) {
//			key = arr[pass];
//			j = pass-1;
//			
//			while(j>=0 && arr[j]>=key) {
//				arr[j+1] = arr[j];
//				j--;
//			}
//			arr[j+1] = key;
//		}
//		
////		Print An Array
//		
//		for(int x: arr) {
//			System.out.print(x+ " ");
//		}
		
//--------------------------------------------------------------------------------------------

//		********************* Merge Sort Algorithm to sort an Array				
		
//  We just Creating An 2 Methods (function) namely mergeSort()	and  merge()
		
//		Outside The --->	public static void main function 

//		Inside the ---->	public class Practice_3_Array	{  }
		
		
		
		mergeSort(arr, 0, 4);
		
		for(int x: arr) {
			System.out.print(x +" ");
		}
		
//--------------------------------------------------------------------------------------------
		
	}
	
static void merge(int a[], int mid, int low, int high)	{
	
	int ak[] = new int[100];
	int i,j,k;
	i =low;
	j =mid + 1;
	k =low;
	
	
	while(i<=mid && j<=high) {
		if(a[i]<=a[j]) {
			ak[k] = a[i];
			i++;
			k++;
		}
		else {
			ak[k] = a[j];
			j++;
			k++;
		}
	}
	
	while(i<=mid) {
		ak[k] = a[i];
		k++;
		i++;
	}
	
	while(j<=a.length) {
		ak[k] = a[i];
		k++;
		j++;
	}
	
	for (int x=low; x<=high; x++ ) {
		a[x] = ak[x];
	}
}
	
 static void mergeSort(int a[], int low, int high) {
	int mid;
	if(low<high) {
		mid = (low+high)/2; 
		mergeSort(a, low, mid);
		mergeSort(a, mid+1, high);
		merge(a, mid, low, high); 
	}
}
}