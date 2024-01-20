import java.util.*;

class emp{
	

	private int id;
	private String name;
	
	public emp() {		// Default Constructor
		
		id= 1;
		name = "jay";
	}
	
//	
	public emp(int i, String n) {		// Parameterized Constructor
		
		id= i;
		name = n;
	}
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}


	
//	public int getId() {
//		return id;
//	}
//	
//	
//	public String getName() {
//		return name;
//	}
	
}


public class _06_Constructor {

	public static void main(String[] args) {
		
		emp e1 = new emp();		// we don't have to Create an object The Constructor Automatically Invoked 
		emp e2 = new emp(21, "jayu");
		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		
		System.out.println(e2.getId());
		System.out.println(e2.getName());
		

	}

}
