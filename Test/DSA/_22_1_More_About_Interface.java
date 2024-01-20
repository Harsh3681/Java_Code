
//		*********** 2nd Example Below ***********

/*
 	We can Access The elements Of "InterFace" but can not Modified it
* 
* 	like x = 3		easily accessible in "SubClass"
* 
* 	because that "elements" Are "Final" in interface "Already"		 we cannot modified it
* 
*/

interface firstInterface{
	
	int x = 3;					// interface can not work on the elements of the interface (variable war work hot nahi) we can easily accesss it
	
	public void method1();
	
}

interface secondInterface{
	
	int y = 6;
	
	public void method2();
	
}

class demoClass implements firstInterface, secondInterface{		// Same As like Multiple Inheritance	<---but java not supported Multiple inheritance
																// So we used the "interface Class Instated"
	
	public void method1() {							// Tyanche method define kartoy tar public lawne compulsory ahe
		System.out.println("From 1st Interface");
	}
	
	public void method2() {							// Tyanche method define kartoy tar public lawne compulsory ahe
		System.out.println("From 2st Interface");
	}

	void show() {
		System.out.println("Asech");
	}
}

public class _22_1_More_About_Interface {

	public static void main(String[] args) {
		
//		*********** Ex Implementation of 2nd Interface Below ***********		
		
		demoClass d = new demoClass();
		d.method1();
		d.method2();
		d.show();
//		
//		d.x = 77;			// <--- Error The final field can not Modified
//		
		System.out.println(d.y);
		System.out.println(d.x);
		
	}

}
