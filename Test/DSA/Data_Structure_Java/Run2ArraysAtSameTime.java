package Data_Structure_Java;

import java.util.ArrayList;

public class Run2ArraysAtSameTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int ak[] = a.stream().mapToInt(p -> p).toArray();
		
		int arr[] = {1,3,2,4};
		ArrayList<Integer> a = new ArrayList<>();
		for(int i=0,j=2; i<arr.length && j<arr.length; i++,j++){
			a.add(arr[i]);
			a.add(arr[j]);
		}
		System.out.println(a);

	}

}
