package _1_Recursion;

public class _6_decimal_to_Octal {

	public static int Deci_to_Octa(int decimal)
    {
        int octalNumber = 0, i = 1;

        while (decimal != 0)
        {
            octalNumber += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }

        return octalNumber;
    }
	
	public static void main(String[] args) {
		System.out.println(Deci_to_Octa(75));
	}

}
