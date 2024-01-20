package _1_Recursion;

import java.util.ArrayList;

class _7_Find_Linear_Search_on_array {
	public static boolean check_present(int ar[],int size, int key) {
		if(size<=0) {
			return false;
		}if(ar[size-1]==key) {
			return true;
		}
		return check_present(ar,size-1,key);
	}
	
//	Here we can return index values from "first"
	
	public static int Get_index_of_key_from_start(int ar[],int size, int key) {
		if(size<=0) {
			return -1;
		}if(ar[size-1]==key) {
			return size;
		}
		return Get_index_of_key_from_start(ar,size-1,key);
	}
	
//	Here we can return index values from "last"
	
	public static int Get_index_of_key_from_end(int ar[],int size, int key) {
		if(size==-1) {
			return -1;
		}if(ar[size-1]==key) {
			return (ar.length-size)+1;
		}
		return Get_index_of_key_from_end(ar,size-1,key);
	}
	
//	-----------------------------------------------------------------------------------
	
//	Return by "ArrayList"
	
	public static ArrayList<Integer> Get_index_of_key_return_ArrayList(int ar[],int startIndex, int key) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		if(startIndex==ar.length) {
			return ans;
		}
//		this below will contains answer for function call only
		
		if(ar[startIndex]==key) {
			ans.add(startIndex);
		}
		ArrayList<Integer> ansFromBelowCall = Get_index_of_key_return_ArrayList(ar,startIndex+1,key); /// here it will create each time an "new" "Obj" of "ArrayList"
//		it say to to it;s previous recursive call if ur goes up please bring me with u 
		
		ans.addAll(ansFromBelowCall);	// and here it will add new ArrayList obj to orginal arrayList 
		System.out.println(ans);
		return ans;
	}
	
//	-----------------------------------------------------------------------------------
	
	public static void main(String[] args) {
		
		int ar[] = {2,1,5,7,11,5};
		
		System.out.println(check_present(ar, 6, 59));
		
//		Here we can can get index values from "start"
		
		System.out.println("Index of "+7+" is "+ Get_index_of_key_from_end(ar,ar.length,7)+" from last");	// start from back with index 1 not 0

		
//		Here we can can get index values from "end"
		
		System.out.println("Index of "+11+" is "+ Get_index_of_key_from_start(ar,ar.length,11)+" from first"); // start from "front" with index 1 not 0

//		-----------------------------------------------------------------------------------
		
		System.out.println("Final Ans "+Get_index_of_key_return_ArrayList(ar,0,5)); // start with 0(zero) index
		
		
		
	}

}
