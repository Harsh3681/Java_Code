package Company;

public class Accenture_How_to_get_decimal_point_division_mul_etc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		
		String d = String.format("%.4g%n",(double)2.5/6.1);
		System.out.print(d);
		System.out.printf("%.4f",(double)2.5/6.1);		//same as above
		
		System.out.println();System.out.println();
		String dd  = String.format("%.6g%n",(double)5/2);
		System.out.print(dd);
		System.out.printf("%.5f",(double)5/2);			//same as above
		
	}

}
