package CollectionFrameWorkInJava;
import java.util.*;

class demo{
	
	private String name;
	private Integer age;
	
	public demo(String n, int a) {
		name = n;
		age = a;
	}
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	
	
	// 		******************** IMP ****************** step below we are override the toString() method directly
	
	public String toString() {
		return "{" + 
				"name "+ name + '\'' + " age " + age + '}';
	}
}

public class _1_1Problem_Base_On_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Searching the element in ArrayList
		
		// contains()	,	indexOf() --> return 1st occurrence of an element	, lastIndexOf() --> return index of last occurrence
		
		ArrayList<Integer> ser = new ArrayList<>();
		ser.add(1);
		ser.add(2);
		ser.add(4);
		ser.add(6);
		ser.add(4);
//		
//		Boolean j = (ser.contains(4));
//		if(j==true) {
//			System.out.println(ser.lastIndexOf(4));
//		}
//		else {
//			System.out.println("Not Present");
//		}
		
		// ********** IMP ***********
		
		ser.ensureCapacity(20);	    // by default ArrayList can hold the 10 element now it can hold 20 element ensureCapacity() increse current capacity of Arraylist
		System.out.println(ser.size());
		ser.trimToSize();			// trimToSize() decrease current capacity of Arraylist
		System.out.println(ser.size());
		
//----------------------------------------------------------------------------------------------------------
		
			
	// Creating ArrayList Along with classes an Objects
		
		ArrayList<demo> cls = new ArrayList<>();
//		demo d = new demo();
		
		cls.add(new demo("Dipak", 22));
		cls.add(new demo("Atharva",20));
		cls.add(new demo("Abhishekh",26));
		cls.add(new demo("Ranjit",10));
		cls.add(new demo("B",10));
		
		
//----------------------------------------------------------------------------------------------------------
		// getting sublist from the whole list
		
		List<demo> ll = cls.subList(0, 2);
//		ArrayList<demo> ll = (ArrayList<demo>) cls.subList(0, 2);
		ll.forEach(i ->{
			System.out.println(i.getName());
		});
		
//----------------------------------------------------------------------------------------------------------
		
		// ********* IMP *********  for Each loop
		
//		cls.forEach(i ->{
//			System.out.println("Name "+ i.getName() + " Age "+ i.getAge());
//		});
				
//----------------------------------------------------------------------------------------------------------
//		for(demo l : cls) {
//			System.out.println(l);
//		}
		
//----------------------------------------------------------------------------------------------------------
		
		// Sort the List by String			only applicable on classes and object
		
//		cls.sort(Comparator.comparingInt(demo::getAge));
//		System.out.println(cls);
		
//----------------------------------------------------------------------------------------------------------
		
		// Sort the List by Integer(num)	only applicable on classes and object
		
		// below code return according ascending order of the letter
		
		Collections.sort(cls, Comparator.comparing(demo::getName));
		System.out.println(cls);
		
//----------------------------------------------------------------------------------------------------------
	
		
		
		
		
	}

}
