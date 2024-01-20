import java.util.*;

// 	This Below Is An Default Field Initialized Automatically		if We don't Provide an value

class Sample{
	
	int x;
	float y;
	String z;
	char p;
	boolean q;
	
	void show() {
		
		System.out.printf("Int %d \nfloat %f \nString %s ",x,y,z);
		System.out.println(p);		// Tgere is Not any field initialized to "char"
		System.out.println(q);
	}
}

//	This Below Is An "Explicit" Field Initialized Automatically		if We don't Provide an value

class Sample2{

		int x =9 ;
		float y= 7.3f;
		String z = "Hey";
		char p = 'e';
		boolean q = true;
		
		void show() {
			
			System.out.printf("Int %d \nfloat %f \nString %s ",x,y,z);
			System.out.println(p);
			System.out.println(q);
		}
}




public class _14_Field_Initializtion {
	
	public static void main(String [] args) {
		
		Sample s = new Sample();
		s.show();
		
		System.out.println();
		
		Sample2 k = new Sample2();
		k.show();
		
		
		
		
	}

}
