
/*	Interface Class Is Fully UnImplimented Class
 * 
 * 	"Interface che Methods ---> "Subclass" Madhe Define Karatana "public" <--- lawne Compulsory
 * 	
 * 	We can Access The elements Of "InterFace" but can not Modified it
 * 
 * 	like x = 3		easily accessible in "SubClass"
 * 
 * 	because that "elements" Are "Final" in interface "Already"		 we cannot modified it
 * 
 */

class colors{			// Super Class
	
	void clr() {
		System.out.println("White Or Black");
	}
}


interface Animals{			// Interface
	
	void sound();			// default access specifier of interface is 							"public" we don't have to mention public before void
	void eat();
	
}

interface dino{
	
	void humangasourus();
	
	void look();
}


class dogu implements Animals{			// class inherits from Interface	so "implements" keyword  
	
	public void sound() {
		System.out.println("Baw Baw colurs");
	}

	public void eat() {
		System.out.println("Biscuits");
	}
}


class cat extends colors implements Animals{		// Class inherit from 2 class i) "SuperClass" ii) "Interface"

	@Override
	public void sound() {
		System.out.println("Meaw Meaw");
		
	}

	@Override
	public void eat() {
		System.out.println("Mouse");
	}
	
	void behaviour() {
		System.out.println("Alaways Angry");
	}
	
	void clr() {
		System.out.println("Red");
	}
}


class accient implements Animals , dino{		// here we create an "multiple inheritance"  by using more then one "Interface" 
	
	void see() {
		System.out.println("We can dispay multiple interface wali class by more than one interface");
	}

	@Override
	public void humangasourus() {
		System.out.println("Big Shing");
		
	}

	@Override
	public void look() {
		System.out.println("huge");
		
	}

	@Override
	public void sound() {
		System.out.println("Wired");
		
	}

	@Override
	public void eat() {
		System.out.println("Each Other");
	}
}
	

abstract class why implements Animals{			// jar Interface cha Methods subClass Made Define Nastil Karaycha 

	void kk() {									// Tar mag tya  "Inherit" kelelya Class la "Abstract" decleared karawe lagel
		System.out.println("jj");
	}											// Still We are not Able To Create it's Object 		we can create it's "Reference"		
	abstract public void jb();
}




public class _21_Interface__VS__Abstarct_Class {

	public static void main(String[] args) {
	
//		*********** Ex Implementation of 1st Interface Below ***********
		
		
		System.out.println();
		dogu d =new dogu();
		
		d.eat();
		d.sound();
		
		System.out.println();
		cat c =new cat();
		
		c.clr();			//	from SuperClass (Parent Class)
		c.behaviour();		//	It's Own Method
		c.sound();			//	from Interface
		c.eat();			//	from Interface
		
		
		System.out.println();
		accient a = new accient();
		
		a.see();
		a.humangasourus();
		a.look();
		a.sound();
		a.eat();
		
//		why w = new why();
		
		
		
		
		
		

		
	}

}
