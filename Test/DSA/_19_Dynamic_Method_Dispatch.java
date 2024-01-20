
import java.util.*;

//		************** NOTE - Dynamic Method Dispatch ( DDM ) Cannot Allow With Data type in In JAva

//		$$$$$$$$$$$$$$$$$$$$$	Other name of "Polymorphism" is "Dynamic Method dispatch"  $$$$$$$$$$$$$$$$$$$$$$$$$$$$

class phone{
	
	int a = 8;				// This
	
	void showTime() {
		System.out.println("Time 8am");
	}
	
	void On() {
		System.out.println("Phone Is On");
	}
}

class smartPhone extends phone{
	
	int a = 99;
	
	void music() {
		System.out.println("Play Music In SmartPhone");
	}
	
	void On() {				// Method Overriding
		System.out.println("Smartphone Is On Konw");
	}
}


public class _19_Dynamic_Method_Dispatch {

	public static void main(String[] args) {
		
//		phone p = new phone();
//		p.showTime();
//		p.On();
		
		System.out.println();
		
		// here we create "object" of---> "SubClass" And take "reference" of---> "SuperClass"
		
//		reference		object
		phone pp = new smartPhone();	// <----- Dynamic Method Dispatch ( DDM )
		
		pp.On();		// <------ ithe ha smartPhone cha run hoil  <---	becz we crete an "object" of SmartPhone
		
		System.out.println(pp.a);	 // Therefore here ans--> is  8  not  99 of SubClass.
									// ********* and DMD can not allows with data type **************

		//		pp.music();		// hence here we cannot able to access elements of SubClass 
								// becz we create an reference of SuperClass
		
		// We can Access the elements of super class show below
		
		pp.showTime();			// he run hoil becz we create obj of "SuperClass"
		
		
		
		
	}

}
