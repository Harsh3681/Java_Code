package Array_Problem;

import java.util.ArrayList;
import java.util.Arrays;

public class Simple_Array_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {1,2,1};
		Integer[] ak = new Integer[arr.length];
		
		Integer ai[] = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(ai));
		
		int ans[] = a.stream().mapToInt(i->i).toArray();
		System.out.println(ans);
	}

}
