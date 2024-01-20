package _1_Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import Data_Structure_Java.SubSequenceString;

public class tp {
	public static long find(int s) {
		if(s<0) {
			return -1;
		}
		int i=0, r=0;
		long ans=0;
		while(s!=0) {
			r=s%10;
			s = s/10;
			ans +=  r* (Math.pow(2, i));
			++i;
		}
		return ans;
	}
	
	
	
	public static void main(String[] args) {
		
		String originalString = "Harsh";
        char insertionCharacter = '*';
        int position = 2;

        StringBuilder stringBuilder = new StringBuilder(originalString);

        // Insert the character at the specified position
        stringBuilder.insert(position, insertionCharacter);

        // Convert StringBuilder back to String if necessary
        String modifiedString = stringBuilder.toString();

        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    
		
	
	}

}
