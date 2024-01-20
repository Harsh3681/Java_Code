package Company;

public class Remove_vowel_in_String {

	public static void main(String[] args) {
		String str = "GeeeksforGeeks akkki";
		StringBuilder sb =  new StringBuilder(str);
		String vo = "aeiouAEIOU";
		for(int i=0; i<sb.length(); i++) {
			if(sb.charAt(i)>='a' && sb.charAt(i)<='z' || sb.charAt(i)>='A' && sb.charAt(i)<'Z') {		// this condition means char is alphabet
				if(vo.indexOf(sb.charAt(i))!=-1) {	// if value not present in string it return -1
					sb.replace(i, i+1,"");
					i--;
				}
			}
		}
			
		System.out.println(sb.toString());
//		here only rather then aeiou will we get
	}

}
