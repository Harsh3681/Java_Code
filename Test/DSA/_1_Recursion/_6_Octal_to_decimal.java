package _1_Recursion;

public class _6_Octal_to_decimal {

	public static int Oct_to_deci(int octal)
    {
        int decimalNumber = 0, i = 0;

        while(octal != 0)
        {
            decimalNumber += (octal % 10) * Math.pow(8, i);
            ++i;
            octal/=10;
        }

        return decimalNumber;
    }
	
	public static void main(String[] args) {
		
		System.out.println(Oct_to_deci(113));
		
		
	}

}
