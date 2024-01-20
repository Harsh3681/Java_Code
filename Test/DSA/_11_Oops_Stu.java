
import java.util.*;

// WAP to declared Class Student And Store The DAta of Students

class Student{
	
	int rollNo;
	String Name;
	double paid;
	
	public void SetData(int r, String n, double p) {
		rollNo = r;
		Name = n;
		paid = p;
	}
	
	void show() {
		System.out.println("Student Name - "+ Name);
		System.out.println("Student Roll No - "+ rollNo);
		System.out.println("Student fees Paid - "+ paid);
	}
}


public class _11_Oops_Stu {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.SetData(25, "Raj", 41000);
		s2.SetData(12, "Ganesh", 35000);
		s1.show();
		s2.show();
		
	}
}
