package Clg_Practice;

import java.util.Scanner;

class Array{
	
	static void Print_Ele(int[] arr2) {
		
//		Print Elements Of An Array By using 2 Classes
		
//		for(int i=0; i<arr2.length; i++) {
//			System.out.print(arr2[i]+ " ");
//			
//		}
		
//-----------------------------------------------------------------------------------------------------------------------	
		
//		Print Elements OF Array in Reverse Order
		
		for(int i=arr2.length; i>0; i--) {
			System.out.print(arr2[i-1]+ " ");
			
		}
	}
}



public class Print_Element_An_Array {

	public static void main(String[] args) {

//		Print Elements Of An Array By Using Two Classes
		
		System.out.println("Elemnts Of An Array");
		
		int arr[] = {5,6,9,55,1};
		
		Array.Print_Ele(arr);

	}
}
