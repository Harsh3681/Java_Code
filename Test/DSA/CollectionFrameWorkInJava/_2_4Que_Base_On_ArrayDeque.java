package CollectionFrameWorkInJava;

import java.util.ArrayDeque;
import java.util.Deque;

public class _2_4Que_Base_On_ArrayDeque {

		//	In this Problem we are try to create the "subset" of character and integer
		//	ex.		'a', 'b', 'c'
		//	o/t		a,b,c,ab,ac,bc,abc
	
	

	public static void subset(char arr[], Deque<Character> ch, int n) {
		if (n == 0) {
			for (Character i : ch) {
				System.out.print(i);
			}
			System.out.println();
			return;
		}

		//	System.out.println("1 "+n);					// this all comments for tracing the element
		//	System.out.println();
		
				ch.addLast(arr[n - 1]);
		
		//	System.out.println();
		
				subset(arr, ch, n - 1);
		
		//	System.out.println("2 "+n);
		
				ch.removeLast();
		
		//	System.out.println("3 "+n);
		//	System.out.println();
		
				subset(arr, ch, n - 1);
				
}

public static void main(String[] args) {
		// TODO Auto-generated method stub

		char k[] = { 'a', 'b', 'c' };
		System.out.println(k.length);
		ArrayDeque<Character> arr = new ArrayDeque<>();
		subset(k, arr, 3);

	}

}
