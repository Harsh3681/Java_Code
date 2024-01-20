package Company;

public class Accenture_Valid_Password_Que {

	public static void main(String[] args) {
		
//		You are given a function, int CheckPassword(char str[], int n);
//		 The function accepts string str of size n as an argument. Implement the function which
//		 returns 1 if given string str is valid password else 0.str is a valid password if it satisfies the
//		 below conditions.
//		    At least 4 characters
//		    At least one numeric digit
//		    At Least one Capital Letter
//		    Must not have space or slash (/)
//		    Starting character must not be a number

//		String s = "a987 aBc012";		<-- here return "false"
		String s = "aA1_67";	
		int n=s.length();
		if(s.length()<4) {
			System.out.println(0);
		}
		if(s.charAt(0)>='0' && s.charAt(0) <='9') {
			System.out.println(0);
		}
		int num=0, cap=0;
		for(int i=0; i<n; i++) {
			if(s.charAt(i)== ' ' || s.charAt(i)== '/') {
				System.out.println(0);
			}
			if(s.charAt(i)>= 'A' && s.charAt(i)<= 'Z') {
				cap++;
			}
			if(s.charAt(i)>= '0' && s.charAt(i)<= '9') {
				num++;
			}
		}
		if(cap>0 && num>0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
