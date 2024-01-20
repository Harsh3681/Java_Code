import java.util.*;

class Employe{
	
	int id;
	String name;
	int salary;
	
	void set() {
		
		Scanner kk = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Id - ");
		id = kk.nextInt();
		
		System.out.print("Name - ");
		name = in.nextLine();
		
		System.out.print("Salary - ");
		salary = kk.nextInt();
		
	}
	
	void show() {
		System.out.printf("\nId - %d \nName - %s \nSalary - %d "  ,id,name,salary);		// " , "	amm
		System.out.println();

	}
	
}



public class _13_Oops_Arrays {
	
	public static void main(String[] args) {
		
		Scanner kk = new Scanner(System.in);
		
//		Employe e1 = new Employe();
//		e1.set();
//		e1.show();
		
		System.out.print("Enter how many Employees Info u want to put - ");
		int n = kk.nextInt();
		
		Employe e[] = new Employe[n];			// Method to take Array as an input in Oops
		
		for(int i=0; i<e.length; i++) {
			System.out.print("Employye - " + (i+1));
			
			e[i] = new Employe();			// Create New Employe object
			e[i].set();
			System.out.println();
		}
		
		for(int i=0; i<e.length; i++) {		
			System.out.print("Employye - " + (i+1));
			
			e[i].show();
			System.out.println();
		}
		
		
		
	}

}
