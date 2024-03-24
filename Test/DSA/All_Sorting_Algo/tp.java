package All_Sorting_Algo;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class tp {

//	public static int sortu(int arr[],int n) {
//		 
//	}
		
	

	public static void main(String[] args) {
		int nums[] = {1,3,4,1,2,3,1};
		
		ArrayList<Integer> a = (ArrayList<Integer>) Arrays.stream(nums).boxed().collect(Collectors.toList());
		 
		Iterator<Integer> i = a.iterator();
		System.out.println(i.next());
		while(i.hasNext()) {
			System.out.println(i.next());
		}
//        
    
	}
}
