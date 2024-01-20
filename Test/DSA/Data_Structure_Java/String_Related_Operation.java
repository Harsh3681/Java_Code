package Data_Structure_Java;

public class String_Related_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		 When we want the integer value from String From Specific Position
		
//		String h = "1209";
//		int e = h.charAt(3) - '0' ;
//		System.out.println(e);
		
//		-------------------------------------------------------------------------------------------
		
		
//		Panagram String		// means all letters from "A" to "Z"
		
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
//		String sentence =  "leetcode";
		
		String s = sentence.toLowerCase();
		boolean flag = true;
		for(char i = 'a'; i<='z'; i++) {
			if(!s.contains(sentence.valueOf(i))) flag = false; break;
		}
		if(flag)System.out.println("true");
		else System.out.println("false");
		
//		-------------------------------------------------------------------------------------------
		
	
		

	}

}
