package _1_Recursion;

public class _5_binary_to_Integer {

	public static int getDecimal(int num){  
		int decimalNumber = 0, i = 0;
	    long remainder;
	    
	    while (num != 0) {
	      remainder = num % 10;
	      num /= 10;
	      decimalNumber += remainder * Math.pow(2, i);
	      ++i;
	    }
	    
	    return decimalNumber;
	}  
	
	public static void main(String[] args) {
		
		int n = 101101;
		
//	    --------------------------------------------------------------------------
		
		System.out.println(getDecimal(n));
		
		 // decimal number 
	    int decimal = 45;
	    
	    // convert decimal to binary
	    String binary = Integer.toBinaryString(decimal);
	    System.out.println(decimal + " in decimal = " + binary + " in binary.");
	    
//	    --------------------------------------------------------------------------
	    
	    // binary number
	    String bi = "101101";
	    
	    // convert to decimal
	    int deci = Integer.parseInt(bi, 2);
	    System.out.println(bi + " in binary = " + deci + " in decimal.");
	  
		
		
		
		
		
	}

}
