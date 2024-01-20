package Sliding_Window;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

public class tp_Practice {

	private static final int ArrayDeque = 0;

	static int getIndexInRange(int index, int length) {
		  int trim = index % length;
		  int nonNegative = trim + length;
		  return nonNegative % length;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a = 2, b =3;
//		a = a+b;
//		b = a-b;
//		a = a-b;
//		System.out.println(a);
//		System.out.println(b);
		
//		---------------------------------------------------------------
		
//		Input: nums = [10,5,2,6], k = 100
//		Output: 8
//		Explanation: The 8 subarrays that have product less than 100 are:
//		[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
//		Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
		
		int[] arr = {10,5,2,6};
		int i=0,j=0,m=1,n=arr.length,k = 100,c=0;
		
		while(j<n) {
			m*=arr[j];
			while(i<=j && m>=k) {
				m/=arr[i];
				i++;
			}
			c+=(j-i+1);
			j++;
		}System.out.println(c);
		
		
	}

}
