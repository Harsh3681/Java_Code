package Clg_Practice;
import java.util.*;

public class Convert_Int_to_Binary {

	 static void decimalToBinary(int num)
	    {
	        // Creating Stack Object Vector
	        Stack<Integer> st = new Stack<>();
	 
	        // Number Should be positive
	        while (num > 0) {
	           
	            // Pushing numbers inside stack that
	            // are divisible by 2
	            st.push(num % 2);
	            // Dividing number by 2
	            num = num / 2;
	        }
	 
	        // Checking condition whether stack is empty
	        while (!(st.isEmpty())) {
	           
	            // Printing binary number
	            System.out.print(st.pop());
	        }
	    }
	 
	public static void main(String[] args) {
		int num = 45;
        decimalToBinary(num);		// Here it returns an "int"
        System.out.println();
        
//        ---------------------------------------------------------
//        Method 2nd
        System.out.println(Integer.toBinaryString(num));		//by build in function but it returns an "String"
        
        
	}

}
