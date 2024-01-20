package CollectionFrameWorkInJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class _1_11Arraylist {

	public static void main(String[] args) {
		
		
//		$$$$$$$$ How to "Add" Values in ArrayList RunTime $$$$$$$$
		
ArrayList<Integer> ar1 = new ArrayList<Integer>(Arrays.asList(1,4,1));	// by "Arrays.asList" we can do it
System.out.println(ar1);
		
//		$$$$$$$$ in "2D ArrayList" "Add" Values RunTime $$$$$$$$

List<List<Integer>> ar2 = new ArrayList<>();
ar2.add(Arrays.asList(2,4,6));
	System.out.println(ar2);
			
		
		
		// new method to converting an array to arraylist
		
//		int arr[] = {5,7,7,8,8,10};
//		ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		//------------------------------------------------------------------------------------------------------------
		
		
		// TODO Auto-generated method stub
		
		String[] studentsName = new String[5];
		studentsName[4] = "jay";
		studentsName[2] = "abhay";
		studentsName[3] = "jaykumar";		// Array Index OutOfBound	not an optimal Solution
		
		// used ArrayList
	//------------------------------------------------------------------------------------------------------------
		
		ArrayList<String> stu = new ArrayList<>();			// creating ArrayList of String data Type
		stu.add("Rammu");
		stu.add("RAj");
		stu.add("Dipak");
		stu.add("akash");
		
		
//		
		
//		// To managed the Array ArrayList Size it will maintain that size by
//		// if it's initial size is = "n"   then	it increased it by
//		
//		//						   = n = n/2 + 1
		
		//-----------------------------------------------------------------------------------------------------------
			
//		ArrayList<String> nm = new ArrayList<>();
		
//		nm = (ArrayList)stu.clone();		// .clone() generally used copy the one ArrayList to Another One
//		System.out.println("Arr "+nm);
		
//		------------------------------------------------------------------------------------------------------------------
		
//		System.out.println(stu);
//		stu.add("kiya");			// simple "add funct"
//		System.out.println(stu);
//-----------------------------------------------------------------------------------------------------------
//		stu.add(1, "Shani");		// Adding Element At Specific index
		
//-----------------------------------------------------------------------------------------------------------		
		ArrayList<String> keu = new ArrayList<>();		// creating new ArrayList namely as "keu"
		keu.add("ak");
		keu.add("ji");
		keu.add("fu");
//		
//		stu.addAll(keu);			// Appending other ArrayList In current ArrayList
//		System.out.println(stu);
//		
		stu.addAll(3, keu);			// Appending other ArrayList In current ArrayList From Specific index
//		System.out.println(stu);
//		System.out.println(keu);
		

// ----------------------------------------------------------------------------------------------------------------
		
		
		ArrayList<Integer> num = new ArrayList<>();			// Creating Index Of Integer Data Type
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		
		
		
		
//		System.out.println(num);
//		System.out.println(num.get(2));		// return element of given index
		
//----------------------------------------------------------------------------------------------------------
//		num.remove(2);		// this Remove remove element by mentioning "Index"
//		
//		System.out.println(num); 		// 55 will remove
//-----------------------------------------------------------------------------------------------------------		

//		num.remove(Integer.valueOf(33));	// remove by mentioning "Value actually"
//		
//		System.out.println(num);		// 33 will remove from ArrayList
//-----------------------------------------------------------------------------------------------------------	
//		num.clear();	// To clear the whole ArrayList
//		System.out.println(num);
		
		/* Here time complexity happening for "removing" and "Adding" the Element is for both is 
		   "O(n)"		because while "remove" the element from ArrayList it shift all the elements on "left"
		   one by one  also while "Adds" element it shift all the elements on "Right" one by one
		   so it carrying for loop therefore O(n).
		   
		   if 2 for loop are used in case then time complexity is O(n^2)
		   
		   */

//-----------------------------------------------------------------------------------------------------------
//		System.out.println(num.size());		// give the size of given ArrayList
//		num.add(4, 12);
		
		num.set(3, 44);			// Set value within available Index
		System.out.println(num);		// set the element on given index and if that index is already taken then replace it
		
	// "set" also O(n) operation because it will set the element at that position directly
		
		
//-----------------------------------------------------------------------------------------------------------
		System.out.println(num.contains(44));	// if element is present then return "true" else "false"

//---------------------------------------------------------------------------------------------------------------------------		
		
		// sort method used with "Comparator" used to sort Array In Ascending Or descending Order
		
		System.out.println("hhi");
		num.sort(Comparator.naturalOrder());
		System.out.println(num);
		num.sort(Comparator.reverseOrder());
		System.out.println(num);
	
//-----------------------------------------------------------------------------------------------------------
		
	//  &&&&&&&&&&&&&&&&& ArrayList to Array &&&&&&&&&&&&&&&&&&&&&&&&&&&&&
//		condition is that data type req ---->  "Integer" instated of "int"
		
		// we can convert "ArrayList" to an --->   "Array" by using "toArray()"  method		
		// know we convert num ArrayList to Array one
		
		Integer arr[] = new Integer[num.size()];		// <---------------------------
		num.toArray(arr);
		
		for(Integer a:arr) {
			System.out.println(a);
		}
		
		
		// *************** IMP ***************
		
		// Simple Array la lagte "length" upto jayla
		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		// And ArrayList la lagte "size()" upto jayla
		
//		for(int i=0; i<stu.size(); i++) {
//			System.out.printf("%d %s\n",i+1,stu.get(i));
//		}

//-----------------------------------------------------------------------------------------------------------
		
		// ************* IMP **************
		
		// $$$$$$$$$$$$ Array to Arraylist  $$$$$$$$$$$$$$$$$$$
		
		// we can convert "String Array StudentsName" to an ArrayList by using "Arrays.asArrayList()"	  
		// know we convert "StudentsName" Array to ArrayList one
		
		ArrayList<String> navin = new ArrayList<>(Arrays.asList(studentsName));		// <-----------------------
		System.out.println("by");
		System.out.println(navin);


//-----------------------------------------------------------------------------------------------------------

		
		
		for(Integer i: num) {
			System.out.printf("%d\n",i);
		}
		
		for(String j: stu) {
			System.out.printf("%s\n",j);
		}
		
		//---------------------------------------------------------
		
//		Iterator<Integer> it = num.iterator();
		Iterator<String> it = stu.iterator();
		while(it.hasNext()) {
			System.out.println("Itereator "+ it.next());
		}
		
		//---------------------------------------------------------
		
		
		ArrayList<Integer> jj= new ArrayList<>();
		ArrayList<String> kk = new ArrayList<>();
		ArrayList<Double> k = new ArrayList<>();
		ArrayList<Float> f = new ArrayList<>();
		String h ="9";
		System.out.println();
	

		
	}

}
