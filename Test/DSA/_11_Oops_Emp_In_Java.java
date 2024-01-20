
import java.util.*;

//   A Real World Object Inside the Class Called As an "Function"

class Employee{
	
	int id;
	String name;
	double salary;
	
	
	public void Set(int i, String n, double s) {
		
		id = i;
		name = n;
		salary = s;

	}
	
	public void show() {
		System.out.println("Employee id -"+ id);
		System.out.println("Employee Name -"+ name);
		System.out.println("Employee Salary -"+ salary);
	}
}


public class _11_Oops_Emp_In_Java {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.Set(1, "Dipak",57000);
		e2.Set(2, "Nikhil",70000);
		e1.show();
		e2.show();
		
	}

}
