
/*	Q 1)	Create an class monkey with methods bite() and jump()
 * 		create class human which inherits from the "monkey" and implements the "interface" basicAnimals 
 * 		with eat() and walk() method
 * 
 * 	Q 3)	Inherit the human class from monkey and "show Polymorphism"
 * 
 * 	Q 2)  pan Same ahe 1 sarkha
 * 
 */



class monkey{
	
	public void bite() {
		System.out.println("Monkey Bites very hardly");
	}
	
	public void jump() {
		System.out.println("It's An basic behavior of monkey");
	}
}

interface basicAnimals{
	
	void eat();
	void walk();
}

class human extends monkey implements basicAnimals{
	
	public void bite() {
		System.out.println("Humans Never bits like Monkey");
	}
	
	public void jump() {
		System.out.println("Some time May be jump Like Monkey");
	}
	
	public void eat() {
		System.out.println("Humans eat Roasted and fully Cooked Food");
	}
	
	public void walk() {
		System.out.println("Human generally Walk not jump");
	}
}

//--------------------------------------------------------------------------------------------------------------------------------------------

//abstract class telephone{

//	abstract void ringing();
//	
//	abstract void receive();
//	
//	abstract void disconnect();
//	
//}
//
//class mobilePhone extends telephone{
//
//	@Override
//	void ringing() {
//		System.out.println("Ringing......");
//		
//	}
//
//	@Override
//	void receive() {
//		System.out.println("Receive .....");
//		
//	}
//
//	@Override
//	void disconnect() {
//		System.out.println("Cut the Call....");
//		
//	}
//	
//}

//--------------------------------------------------------------------------------------------------------------------------------------------


public class Practice_5_Interface_And_Abstract_Class {

	public static void main(String[] args) {
		
//		Ans of Q 3)
		
//		monkey m = new human();			// we are not able to used the method of human becz we create an reference of "monkey"
//		m.bite();						// and we lnow "jyache" reference create krto tyachech "methods" run hotat
//		m.jump();						//  Ani yalach ----> 	"Polymorphism" mhantat
		
//		Ans of Q 1)
		
//		human h = new human();
//		h.bite();
//		h.jump();
//		h.eat();
//		h.walk();
		
//		basicAnimals b = new human();			// <----- he NEW ahe and generally work hotay
//		b.eat();
//		b.walk();
		
		
//		Ans of Q 2)
		
//		telephone t = new mobilePhone();		// upcasting
//		
//		t.ringing();
//		t.receive();
//		t.disconnect();
		
	}

}
