package CollectionFrameWorkInJava;

import java.util.*;

class book{
	int id;
	String bName, author, publisher;
	int quantity;
	
	public book(int id, String bName, String author, String publisher, int quantity) {
		this.id=id;
		this.bName = bName;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
}


public class _1_2Problem_On_LinkList {
	
	// ----------------------------------------------------------------
	// not usefull permutation code
	
	public void permu(String str , String ans) {
		if(str.isEmpty()) {
			return;
		}
		
		for(int i=0 ; i<str.length(); i++) {
			char first = str.charAt(i);
			
			String left_sub = str.substring(0, i);
			String right_sub = str.substring(i+1);
			
			String full = left_sub + right_sub;
			
			permu(full , ans + first);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Used LinkedList with object
		
		// Initialized link list
//		List<book> bk = new LinkedList<book>();
////		
//		// create obj of book class		
//		book b1 = new book(1,"java","Raja", "Rama",5);
//		book b2 = new book(2,"c","Avi", "Pichai",4);
//		book b3 = new book(3,"c++","jhon", "Molli",7);
//		book b4 = new book(4,"Data Str","Gosli", "Devid",3);
//		
//		bk.add(b1);
//		bk.add(b2);
//		bk.add(b3);
//		bk.add(b4);
//		
//		for(book i : bk) {
//			System.out.println(i.id+" "+ i.bName+" "+i.author+" "+i.publisher+" "+i.quantity);
//		}
		
		
		//--------------------------------------------------------------------------
		
//		Find Middle Of Linked List
		
		
		Integer arr[] = {44,1,55,6,7,0,84};
//		
		LinkedList<Integer> mid = new LinkedList<>();
		mid.addAll(Arrays.asList(arr));
		Integer akk[] = mid.toArray(new Integer[0]);		// convert LinkedList to array 
		System.out.println(Arrays.toString(akk));
//		System.out.println(mid);
//		int s = mid.size();
//		for(int i=0; i<s; i++) {
//			if(((i)*2)==s) {
//				System.out.println(mid.get(i-1));
//			}
//			else if(((i+1)*2)==s-1) {
//				System.out.println(mid.get(i+1));
//			}
//		}
		

		//--------------------------------------------------------------------------
		
		
		
		

	}

}
