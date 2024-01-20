import java.util.*;

//   In This "Access Modifier"  we can store the Sensitive Data Privately  by "private" member

//	 Ex . final keyword


class samp{
	
	final double PI = 3.14529;
	private String name;
	
	public void setId(int i) {
		PI = i;			// we can not change "final" field once it assigned
		
	}
	
	public double getId() {
		return PI;
	}
	
	public void setName(String s) {
		name = s;
	}
	
	public String getName() {
		return name;
	}
}


public class _15_Access_Modifier {

	public static void main(String[] args) {
		
		samp s1 = new samp();
		
		s1.setId(1);
		s1.setName("Dipak");
		
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		
		

	}

}
