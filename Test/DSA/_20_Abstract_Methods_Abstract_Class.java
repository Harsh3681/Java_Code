import java.util.*;

/*		Abstract method 
 * 	We use abstract for class when we want to "Make" any method compulsory for all the 	child classes after extending .
 * 	
 * 	And if any "Child" class doesn't implement the abstracted class "define" method 	then that child class must be need to declared as an "Abstract class "
 * 
 * 	Try out on below code
 * 
 */


abstract class parent{
	
	void day() {
		System.out.println("Good Morning");
	}
	
	abstract public void greed();			// public lawne compulsory ahe
	
//	abstract private void greed();			// "private" with "abstract" not possible
}

class child1 extends parent{
	
	void suggest() {
		System.out.println("Do Yoga...");
	}
	
	public void greed() {					// public lawne compulsory ahe
		System.out.println("Job Time 9am");
	}
}

class child2 extends parent{
	
	public void evening() {
		System.out.println("Sleep Earlear");
	}
	
	public void greed() {
		System.out.println("Do Brush before Sleep");
	}
}

//class child3 extends parent{						// Error

abstract class child3 extends parent{			// tar "parent" class mhanto jar tumala tya dilelya methods implement nahi karaycha tar tumhi
												// direct "swatalach Abstract Class ase declered karun gha"
	void afternoon() {								// jar apan greed method la Implement nahi kel tar "Error"  yeil
		System.out.println("Dupar Zali");
	}
	
}

public class _20_Abstract_Methods_Abstract_Class {

	public static void main(String[] args) {
		
		child1 c1 = new child1();
		c1.day();					// day() method run zali becz we created refrence of "Abstract (SuperClass) class
		c1.suggest();
		c1.greed();
		
		System.out.println();
		
		parent c2 = new child2();
		c2.day();					// day() method run zali becz we created refrence of "Abstract (SuperClass) class
//		c2.evening();
		c2.greed();
		
//		parent p = new parent();		// Error
//		child3 c3 = new child3();		// Error		becz this both are "Abstract Classes"		we are Not Able To Create An Object Of It
		
	
	}

}
