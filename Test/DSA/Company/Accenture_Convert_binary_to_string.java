package Company;

public class Accenture_Convert_binary_to_string {

	public static void main(String[] args) {
		String letters = "01001000 01100001 01110000 01110000 01111001 00100000 01000101 01100001 01110011 01110100 01100101 01110010 00100001";
		 String s = " ";
		 for(int index = 0; index < letters.length(); index+=9) {
		     String temp = letters.substring(index, index+8);
		     int num = Integer.parseInt(temp,2);
		     char letter = (char) num;
		     s = s+letter;
		 }
		 System.out.print(s); //  Happy Easter!
	}

}
