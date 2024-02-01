package String_Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class tp {
	
	public static int find(int ar[], int n, int ans) {
		if(ar.length==0) {
			return 0;
		}
		for(int i:ar) {
			ans+=i/12;
		}
		return ans;
	}

	public static void main(String[] args) {
		int ar[]= {3,42,60,6,14};
		System.out.println(find(ar,5,0));
		
	}
}
