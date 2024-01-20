package Data_Structure_Java;

public class Lexicographic_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		In Lexicographic Order. 

//		all the "uppercase letters" Come First then all the "lowercase letters".

//		This order is what the "compareTo()" method of class String uses.
		
//		NOTE
		
//		Two strings are lexicographically equal if they are the
//		same length and contain the same characters
		
//		stringA.compareTo( stringB ) returns 0.
		
//		1)		stringA.compareTo( stringB ) returns a "negative value"  "-ve" "if StringA comes first"
//		2)		positive value if StringB comes first
		

//	 			Relation	 			stringA.compareTo( stringB )
//	stringA		Less Than	   stringB			Negative Integer
//	stringA		Equal		   stringB			Zero
//	stringA		Greater Than   stringB		    Positive Integer
		
//		---------------------------------------------------------------
		
//		Que 744
		
//		You are given an array of characters letters that is sorted in non-decreasing order, 
//		and a character target. There are at least two different characters in letters.
//		Return the smallest character in letters that is lexicographically greater than target. 
//		If such a character does not exist, return the first character in letters.

//		Input: letters = ["c","f","j"], target = "a"
//		Output: "c"
//		Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
		
//		Answerng
		
//		for(int i =0; i<letters.length; i++)
//            if(letters[i]>target)
//                return letters[i];
//        return letters[0];
		
		System.out.println("baabc".compareTo("cbabc"));
	}

}
