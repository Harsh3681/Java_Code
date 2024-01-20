package Sliding_Window;
import java.util.*;

public class _239_find_max_ele_within_window_size {
	
	
	public static void GetMax(int ar[], int n, int k) {
			
//		start the loop iterate upto k;
//		12, 1, 78, 90, 57, 89, 56
		
		Deque<Integer> d = new LinkedList<>();
		int i;
		for(i=0; i<k; ++i) {
			
			while(!d.isEmpty() && ar[i]>=ar[d.peekLast()]) {
				d.removeLast();
			}
			d.addLast(i);
			System.out.println("me");
			System.out.println(d);
			
		}
		
//		this below for loop start from "where the above for loop end"
//		means start next loop from "k" upto "n"
		
		for(; i<n; ++i) {
			
			 System.out.print(ar[d.peek()] + " ");
			
			while((!d.isEmpty()) && d.peek() <= i-k ) {			
//	Meaning of 		"d.peekFirst() < i-k"  this line is we are removing	thos ele which is less than "0"
//				means which is not feet to window size
				d.pollFirst();
			}
			
			while(!d.isEmpty() && ar[i]>=ar[d.peekLast()]) {
				d.pollLast();
			}
			d.addLast(i);
		}
		System.out.print(ar[d.peek()]);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> aa = new ArrayList<>();
//		int arr[] = {2,7,-1,3,-5,5,3,1,-2};
		int arr[] = { 12, 1, 78, 90, 57, 89, 56 };
		int n =arr.length;
		int k=3;		// window size
		int s=0 ;
		int i=0,j=0;
		int mx;
		System.out.println("0 "+ (0<(-2)));
//		Its an "Naive" Case  Which is Not "Optimal"  just an "BrutForce"
//		Here T.C 		is  	O(n*k)
//		The outer loop runs N-K+1 times and the inner loop runs
//		K times for every iteration of the outer loop
		
		while(i<n-k+1) {
			mx = arr[i];
			for(;j<k;j++) {
				if(arr[i+j]>mx) {
					mx = arr[i+j];
				}
			}
			aa.add(mx);
			i++;
		}
		
		System.out.println(aa);
		
		
//		Here Below we Optimized this code by 
//		using ########## Dequeue #########
		
		
//		Deque<Integer> dq = new LinkedList<>();
        GetMax(arr,n,k);
		
	}

}
