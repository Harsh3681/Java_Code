package String_Problems;

public class String_Reverse_by_recursion {

	static void reverse(String str) {
		if ((str==null)||(str.length() <= 1)) 
	        System.out.println(str); 
	    else {
	    	System.out.print(str.charAt(str.length()-1)); 
            //Call the function recursively to reverse the string
            reverse(str.substring(0,str.length()-1)); 
	    }
	}
		
//	---------------------------------------------------------------------
	
	public static String reverseString(String str)
    {
        
        if (str.isEmpty())
            return str;
        
        return reverseString(str.substring(1)) + str.charAt(0);
    }


	
	public static void main(String[] args) {
		
		String str = "Harshal";
		reverse(str); 
		
		System.out.println(reverseString(str));
		
		System.out.println(str.substring(1));
		
	}

}
