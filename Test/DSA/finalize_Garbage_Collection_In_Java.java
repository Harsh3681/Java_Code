
//		***********NOTE**************
//		we must have to create	"finalize()"	name walich method to see the garbage collection is happening or not
//		jar finalize()  ya nawane tayar nhi kele tar "garbage collection"  will not happen.

class Test{
	
	public void finalize() {				// 		finalize()  name walich method compulsory	other then that not allow--> "garbage collection"  will not happen.
		
		System.out.println("Garbage");
	}
	
	public void fun() {
		System.out.println("Funny Games !!! ");
	}
}

public class finalize_Garbage_Collection_In_Java {

	public static void main(String[] args) {
		
		Test t1 = new Test();
		Test t2 = new Test();
		
		t1.fun();
		
		t1=null;
		t2=null;
		
//		t1.fun();	// becz t1 set as "null" and move to garbage
				
		System.gc();	// to see is garbage has been collected or not 
		
		
	}

}