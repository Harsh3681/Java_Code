import java.util.*;


class library{
	
	String book[] ;			// array of books
	
	int numBook;			// total num of books initialized with 0
	
	library(){
		
//		int a = new int[]		<--- like that below
		
		book = new String[100];
		
		numBook = 0;
		
	}
	

	void addBook(String b) {
		
		book[numBook] = b;		// Means 0th position war he 1st add keleli book thewa
		numBook++;
		
		System.out.println(book[numBook]);
		
	}
	
	
	
}


public class Exercises_On_library_Management_using_Oops {

	public static void main(String[] args) {
		
		library lib = new library();
		
		lib.addBook("Math");
	}

}
