package _1_Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Que_Codestudio {
	
//	https://www.codingninjas.com/studio/problems/count-ways-to-reach-nth-stairs_798650
	
//	above Que link
//	Question) Count Ways To Reach The N-th Stairs
	
	
	//Some test cases are not pass for this que becz que is of "DP" and we try it by "Recursion".
//	But our concept is clear
	
//	https://www.youtube.com/watch?v=zg8Y1oE4qYQ&list=PLDzeHZWIZsTryvtXdMr6rPh4IDexB5NIA&index=35
	
//	Above youtube
	
//	 Already write the explaination in book (wahi)
	
	public static int cout(long n) {
		if(n<0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
		
		int ans =  cout(n-1)+cout(n-2);
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(cout(4));
	}

}
