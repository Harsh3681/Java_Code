package Sliding_Window;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class _438_Find_All_Anagrams_in_a_String {
	
	private static boolean isAnagram(Map<Character, Integer> word1CharCount, Map<Character, Integer> word2CharCount) {
        for(char c : word1CharCount.keySet()) {
            if(word1CharCount.get(c) != word2CharCount.get(c)) {
                return false;
            }
        }
        return true;
    }

    private static int countOccurrenceOfAnagram(String text, String word) {
        int tl = text.length();
        int wl = word.length();
        int count = 0;

        // Calculate the count of each character for the given word
        Map<Character, Integer> hmword = new HashMap<>();
        for(int i = 0; i < wl; i++) {
            char c = word.charAt(i);
            hmword.put(c, hmword.getOrDefault(c, 0)+1);
        }

        // Stores the characrer count for the current substring (current window)
        Map<Character, Integer> hmText = new HashMap<>();
        int i = 0;
        for(int j = 0; j < tl; j++) {
            char c = text.charAt(j);
            hmText.put(c, hmText.getOrDefault(c, 0) + 1); // Include the next char in the window

            if(j-i+1 == wl) { // We've hit the window size. Calculate result and Slide the window
                if(isAnagram(hmword, hmText)) {
                    count++;
                }

                // Reduce count for the char at i since we are sliding the window now
                hmText.put(text.charAt(i), hmText.get( text.charAt(i) ) - 1);
                i++; // Slide the window ahead
            }
        }
        return count;
    }
	
	
	public static void main(String[] args) {
		
//		"Anagram" means 
//		An Anagram is a word or phrase formed by rearranging 
//		the letters of a different word or phrase, 
//		typically using all the original letters exactly once
		
//		Ex -  a)  "anagram"  b) "nagaram"	both ara anagram of each other
		
//		so here we need to find "total number of anagram"
//		contains in given string
//		EX.	
			String text = "forxxorfxdofr";
			String word = "for";

//		so here above we need to find "Anagram" string of "f"
//		i.e		we can rearrange the "aaba" in any sense but 
//			it should have to contain all the char in that Ans String
//		so 
//			Output
//			aaba, abaa, aaba, abaa <------ from above string

//		becz we need string which contain " "a" exactly 3 times" and " "b" contain exactly 1 time"
		
//		#######  NOTE  #######
//			Q) here in  String s we need to find the "Anagram" of "f"
//			so we need to firsr find all anagram of "f"
//			for "aaba" anagram as below
			
//			aaba, abaa, baaa, aaab
			
//		so here we need to find	this kind of above pater how many time 
//		came in our give String "aabaabaa"
		
//		hence here out put is 4	
//		i.e ---> aaba, abaa, aaba, abaa
//		and all this above answer in "continues" sequence
		
//		hence we are using "Sliding Window" technique
			
//		hence here we kept the window size of "aaba" that is "4"
//		hence "k" = 4;
			
			
			
		System.out.printf("Count of occurrences of anagram = %d%n", countOccurrenceOfAnagram(text, word));
		    
//        ----------------------------------------------------------------------------------------------------
		
		
		
		

		
		
		
		
	}

}
