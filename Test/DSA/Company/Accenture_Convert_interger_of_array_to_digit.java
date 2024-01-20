package Company;

public class Accenture_Convert_interger_of_array_to_digit {

	public static void main(String[] args) {
		
	  int intArrs[] = {2, 0, 1, 9};
	  
	  System.out.print("int arrays: [");
	  for (int i=0; i< intArrs.length; i++) {
	   System.out.print(intArrs[i]);
	   if(i < intArrs.length-1) {
	    System.out.print(",");
	   }
	  }
	  System.out.print("]");
	  
	  int numberConverted = 0;
	  for (int number : intArrs) {
	   numberConverted = 10*numberConverted + number;
	  }
	  
	  System.out.print(" -> converted: ");
	  System.out.println(numberConverted);
	  
	  
			 
	}

}
