package Company;

public class duplicate_Char_in_String {

	public static void main(String[] args) {
		
		String s = "InterviewBit"; int c;
		char[] ar = s.toCharArray();
		for(int i=0; i<ar.length; i++) {
			 c=1;
			for(int j=i+1; j<ar.length; j++) {
				if(s.charAt(i)==s.charAt(j) && ar[i]!=' ') {
					c++;
					ar[j] = '0';
				}
			}
			if(c>1 && ar[i]!='0') {
				System.out.println(ar[i]);
			}
		}
		
//		-----------------------------------------------------------------------------
		
//		 Below program to change the second position of occurance of given char
//		Here "InterviewBit" "e" occurance to @
		
		StringBuilder sb = new StringBuilder(s);
		c=0;
		for(int i=0; i<sb.length(); i++) {
			if(s.charAt(i)=='e') {
				c++;
			}if(c==2) {
				sb.setCharAt(i, '@');
				break;
			}
		}
		System.out.println(sb);
		
		
	}

}
