

//		************** NOTE - Dynamic Method Dispatch ( DDM ) Cannot Allow With Data type in In JAva

// 			Method Overloading Generally Used for The Polymorphism

//		it is nothing but "Dynamic Method dispatch"		no changes

//		$$$$$$$$$$$$$$$$$$$$$	Other name of "Polymorphism" is "Dynamic Method dispatch"  $$$$$$$$$$$$$$$$$$$$$$$$$$$$

//		For More example we can refer the "Dynamic Method dispatch" file
		
//		"NOTE"	"Upcasting"	--->	It is the Process of creating an "object" of "SubClass" By taking "References" of "SuperClass"

// Know take Practice Example


class Animalu{
	void eat() {
		System.out.println("Eat Anything");
	}
}

class doga extends Animalu{
	void eat() {
		System.out.println("Dog Eat Buiscuits");
	}
}

class puppy extends doga{
	
}




public class _23_Polymorphism_Or_Dynamic_Method_Dispatch {
	public static void main(String args[]) {
		
		Animalu a = new puppy();	// Upcasting
		
		a.eat();
		
		
	}

}
