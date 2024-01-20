package Company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class First_and_Last_Position_In_Sorted_Array {

//	Que		First and Last Position of an Element In Sorted Array
	
	
	
	
	
	public static void main(String[] args) {
		
		int arr[] =  {0,1,1,5,3,2,5,6,7,2,1,3,4} , k = 1;
		ArrayList<Integer> que = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());
		Stack<Integer> st = new Stack<>();
		st.addAll(que);
		System.out.println(st.indexOf(1));
		System.out.println(st.lastIndexOf(1));
		System.out.println(1/2);
	
		
		
	}

}
