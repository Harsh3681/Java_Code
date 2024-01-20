import java.util.*;

// ************ here "extend" keyword is Generally used to inherit the one class from another 


final class Animal{				// Due to "final" Keyword we Cannot inherit Parent Class
		
		public void humbal() {
			System.out.println("Animals Are Humbal");
		}
}
	
class dog extends Animal{			// Here it will generated Error		due "final"
		
		public void bark() {
			System.out.println("Dog Barking . . .");
		}
}
	
public class _16_Inheritance_Final_keyword_with_Inheritance {
	
	public static void main(String[] args) {
		
//		Animal a = new Animal();
//		a.humbal();
		
		dog d =new dog();
		d.bark();

	}

}
