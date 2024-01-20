
/*
 * 		"Method Overriding"  is Process of Methods, Created in "SubClass" has
 * 		 "Same name" , 
 * 		"Same return type"
 * 		"Same Parameter"	as SuperClass Then it Said To Be Over ride From SuperClass
 * 		lets see 
 * 
 * 
 * 		"Method Overloading"  Taken Place Inside the Single class
 * 		"Method Overriding"  Taken Place Between Two classes		see below
 */

class A{
	
	void display() {
		System.out.println("From A");
	}
}

class B extends A{	// without extending we can't say it as an method overriding
	
	void display() {				// Method Overriding
		System.out.println("From B");
	}
	
	void show() {
		System.out.println("Am B");
	}
}

public class _18_Method_Overridding {

	public static void main(String[] args) {
	
		B bb = new B();
		bb.display();
		bb.show();

	}

}
