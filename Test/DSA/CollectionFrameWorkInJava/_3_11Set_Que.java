package CollectionFrameWorkInJava;
import java.util.*;
import java.util.Collections;

/* here we are generally try to create an utilization of set for the custom data types
	
	means creating a class in which we have student "id" and "name"
	arranging the data in pair format of "id" and "name" 
	such that if "id" is same doesn't insert that data "pair"
	
	here we are using the predefine "toString" method in Source
	and "hashCode()" and "equals"
	
	 
	 here we done it for "id" only we can do it for 
	 "id" and "name" also

*/

class stu{		// to add this "toString()" ans "hashCode()" we have to 1st click on stu then go to source
	
	int id;
	String name;
	
//	stu(String name, int id){
//		this.name = name;
//		this.id = id;
//	}
	
	stu(){
		Scanner sc = new Scanner(System.in);
		System.out.print("id - ");
		id = sc.nextInt();
		System.out.print("Name - ");
		name = sc.next();
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		stu other = (stu) obj;
		return id == other.id;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	
	@Override
	public String toString() {
		return "stu [id=" + id + ", name=" + name + "]";
	}


}




public class _3_11Set_Que {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
//		Set<stu> s = new LinkedHashSet<>();		// valid
		
		Set<stu> s = new HashSet<>();	
		
//		1st method
		
//		s.add(new stu("Jay",11));
//		s.add(new stu("Nayan",1));
//		s.add(new stu("Jitesh",21));
//		s.add(new stu("Jinag",11));
		
			
//		2nd method
		
		System.out.print("How many student u want to add  ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=0; i<n; i++) {
			s.add(new stu());
		}
//		System.out.println(s);	
		
		

	}


}
