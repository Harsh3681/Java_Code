package Array_Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Convert_Array_to_ArrayList {

	public static void main(String[] args) {
		
//		-----------------------------------------------------------------
//					########### for String below ###########
		
		
//		String[] ak= new String[]{"ace","boom","crew","dog","eon"};
		String[] ak = {"ss","dj","Sk"};
		List<String> ans = Arrays.asList(ak);
		System.out.println(ans);
		
//		-----------------------------------------------------------------
//					########### for Integer below ###########
		
		int[] arr = { 1, 2, 3, 4, 5 };
		
		
//		1st Method
		
//		ArrayList<Integer> list = new ArrayList<>();
//        for (int i : arr) {
//            list.add(i);
//        }
//        System.out.println(list);
		
//		-----------------------------------------------------------------
		
//		2nd Method		// IMP
		
		ArrayList<Integer> list = (ArrayList<Integer>) (Arrays.stream(arr)).boxed().collect(Collectors.toList());
        System.out.println(list);
        
//		-----------------------------------------------------------------
        
//       3rd Method
        
//        ArrayList<Integer> list = (ArrayList<Integer>)  IntStream.of(arr).boxed().collect(Collectors.toList());
//        System.out.println(list);
        
//		-----------------------------------------------------------------
        
//      4th Method
 
//        Integer[] boxedArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
//
//        ArrayList<Integer> list = new ArrayList<>();
//        Collections.addAll(list, boxedArray);
//
//        System.out.println(list);
        
        
        
        
        
        
        
        
        
	}

}
