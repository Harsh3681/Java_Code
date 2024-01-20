package String_Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Imp_For_Question_String {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		below for split the "interger" from "sign"
		
		String s = "x+5-2+x = 10-x-5";
		String[] t = s.split("(?=[-+])"); // <---- this sequence matters a lot
		for(String j:t) {
			System.out.println(j);
		}
		
//		Imp below to remove unwanted "icons" "symbols" from the String
		
		String str= "This#string%contains^special*characters&.";   
		str = str.replaceAll("[^ a-zA-Z0-9 ]", " ");  
		System.out.println(str);
		
	}

}
