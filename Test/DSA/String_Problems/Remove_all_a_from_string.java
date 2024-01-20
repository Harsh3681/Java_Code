package String_Problems;

public class Remove_all_a_from_string {

//	With void "No return type"
	
	public static void remove_a(String inp, String out) {
		if(inp.isEmpty()) {
			System.out.println(out);
			return;
		}
		char ch = inp.charAt(0);
		if(ch=='a') {
			remove_a(inp.substring(1), out);
		}else {
			remove_a(inp.substring(1), out+ch);
		}
	}
	
//	----------------------------------------------------	
//	Without void with String return type
	
	public static String remove_a_just_return(String inp) {
		if(inp.isEmpty()) {
			return "" ;
		}
		char ch = inp.charAt(0);
		if(ch=='a') {
			return remove_a_just_return(inp.substring(1));
		}else {
			return ch + remove_a_just_return(inp.substring(1)); // recursive call goes up-up and it will add non "a" char in "ch" watch video if not understand
		}
	}
	
	
//	----------------------------------------------------	
//	Without void with String return type
	
	public static String remove_entire_string(String inp, String key) {
		if(inp.isEmpty()) {
			return "" ;
		}
		
		if(inp.startsWith(key)) {
			return remove_entire_string(inp.substring(key.length()), key);
		}else {
			return inp.charAt(0) + remove_entire_string(inp.substring(1), key); // recursive call goes up-up and it will add non "a" char in "ch" watch video if not understand
		}
	}
	
//	----------------------------------------------------	
//	Remove just particular String
	
	public static String remove_particular_string(String inp, String key, String whichItNotBe) {  // here we give 2 extra i/p that the string hi kona sarki hawi (key) aani kona sarkhi nko (whichItNotBe) to remove
		if(inp.isEmpty()) {
			return "" ;
		}
		
		if(inp.startsWith(key) && !inp.startsWith(whichItNotBe)) {
			return remove_particular_string(inp.substring(key.length()), key,whichItNotBe);
		}else {
			return inp.charAt(0) + remove_particular_string(inp.substring(1), key, whichItNotBe); // recursive call goes up-up and it will add non "a" char in "ch" watch video if not understand
		}
	}
	
//	----------------------------------------------------	
	
	public static void main(String[] args) {
		
//		https://www.youtube.com/watch?v=gdifkIwCJyg&t=861s
		
//		"Iterative" Method
		
		String a = "baccad",ans="";
		
//		for(char c:a.toCharArray()) {
//			if(c!='a') {
//				ans+=c;
//			}
//		}System.out.println(ans);
		
//		----------------------------------------------------
		
//		"Recursive" Method
		
		remove_a(a,"");
		
//		----------------------------------------------------
//		Without void with String return type

		System.out.println(remove_a_just_return(a));
		
//		----------------------------------------------------
//		Or we can used this trick for "skip or remove an entire string
//		let's we try to remove string "apple" from given string then
		
		System.out.println(remove_entire_string("My apple is healthy fruit", "apple").trim());

//		----------------------------------------------------
//		Or we can used this trick for "skip or remove "particular String"
//		i.e we try to remove "app" when it's "not" join with "apple"

//				i.e  my appwas better than apple
//				o/t  my was better than apple

		System.out.println(remove_particular_string("my appwas better than apple", "app", "apple").trim()); 
		// here we give 2 extra i/p that the string hi kona sarki hawi (key) aani kona sarkhi nko (whichItNotBe) to remove

		
		
	}

}
