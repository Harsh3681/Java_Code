
//  1) 	super()	method used to access the special constructor in "parent class"

//	2)	"super" keyword used to access ----> "hidden method" of parent class in child class


//===================================================================================================

//		super()	method			for accessing 	"constructors"

class Base{
	
	Base(){
		System.out.println("Im Base Class");
	}
//	
	Base(int a){
		System.out.println("Am base value = "+ a);
	}
}
//

class derived extends Base{
	
	derived(){
		System.out.println("Am derived class");
	}
	
	derived(int a, int b){
		super(a);								// Used of super
		System.out.println("derived with value = "+ b);
	}
}
//	

class smallDerived extends derived{

	smallDerived(){
		System.out.println("Am Small Derived");
	}
	
	smallDerived(int a, int b, int c){
		super(a,b);
		System.out.println("smallDerived with value = "+ c);
	}
}

//===================================================================================================

//			"super"  keyword to accessing hidden member of parent class

//class Fruit{
//	
//	int i;
//	int j;
//}

//class Apple extends Fruit{
//	
//	int i;
//	
//	Apple(int a, int b){
//		
//		super.i = a;			// Fruit wala i		<---- here we used "super" keyword
//		i = b;				    // Apple wala i
//		
//	}
//	
//	void display() {
//		
//		System.out.println("Fruit Wala i = "+ super.i);
//		System.out.println("Apple wala i = "+ i);
//	}
//}




public class _17_Super_Method_And_Super_Keyword_With_Inheritance {

	public static void main(String[] args) {
		
//		super()	method			for accessing 	"constructors"		
		
		
//		Base b =new Base();
		Base bb =new Base(5);
		System.out.println();		// for new line
		
//		derived d = new derived();
		derived dd = new derived(47,88);
		System.out.println();
		
//		smallDerived s = new smallDerived();
		smallDerived ss = new smallDerived(48,66,99);
		System.out.println();
		
		
		
		
		
//		"super"  keyword to accessing hidden member of parent class
		
//		Apple a =new Apple(44,88);
//		a.display();	
		
	}

}
