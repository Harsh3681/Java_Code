import java.util.*;

//	Below Are Some Example Of "final keyword"


//________________________________________________________________________________________________________________________________________


// 		To Prevent the Method Overriding
//		To Disallow The method declered in SuperClass To be Override in Subclass "Final" Keyword

class simple{
	
	final void display() {
		System.out.println("Its Final Method");
	}
}

class simple2 extends simple{
	
//	void display() {		// Create an Error
//		
//	}
}

//________________________________________________________________________________________________________________________________________

//	To Prevents Class From "Begin Inherited"

 final class same{
	void show(){
		
		System.out.println("U Can't Inherites Me ");
	}
}

class dame extends same{		// The type dame cannot subclass the "final class same"
	void name() {
		System.out.println("Hey ");
	}
}
 

//________________________________________________________________________________________________________________________________________



class _15_1_Final_Keyword_in_java {

	public static void main(String[] args) {
	
//		To Create Constant Field
		
		final double  PI =3.14;
		System.out.println();

	}

}
