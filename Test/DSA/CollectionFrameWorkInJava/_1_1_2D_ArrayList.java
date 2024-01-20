package CollectionFrameWorkInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1_1_2D_ArrayList {

	public static void main(String[] args) {
		
		
//		$$$$$$$$ in "2D ArrayList" "Add" Values RunTime $$$$$$$$

List<List<Integer>> ar2 = new ArrayList<>();
ar2.add(Arrays.asList(2,4,6));
	System.out.println(ar2);
	
//	-----------------------------------------------------------------------------
		
//		Way to declared "Multi Dimensional" ArrayList
		
		
// By ArraysList<>
		
//		ArrayList<ArrayList<Integer>> ar = new ArrayList<ArrayList<Integer>>();
//		ArrayList<ArrayList<String>> st = new ArrayList<ArrayList<String>>();

		
//		or -------------------------------------------------------------

// By List<>
		
//		List<List<String>> listOfLists = new ArrayList<List<String>>(size); 

//Then you will have to instantiate all columns of your 2d array

//	    for(int i = 0; i < size; i++)  {
//	        listOfLists.add(new ArrayList<String>());
//	    }
		
//		or -------------------------------------------------------------
		
		
		 List<ArrayList<Integer>> a = new ArrayList<>();

	        ArrayList<Integer> a1 = new ArrayList<Integer>();
	        ArrayList<Integer> a2 = new ArrayList<Integer>();
	        ArrayList<Integer> a3 = new ArrayList<Integer>();


	        a1.add(1);
	        a1.add(2);
	        a1.add(3);

	        a2.add(4);
	        a2.add(5);
	        a2.add(6);

	        a3.add(7);
	        a3.add(8);
	        a3.add(9);

	        a.add(a1);
	        a.add(a2);
	        a.add(a3);


	        for(ArrayList obj:a){

	            ArrayList<Integer> temp = obj;

	            for(Integer job : temp){
	                System.out.print(job+" ");
	            }
	            System.out.println();
	        }
		
	
		
	}

}
