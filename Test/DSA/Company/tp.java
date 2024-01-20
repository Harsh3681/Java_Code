package Company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class tp {
	
	static int ans = 0;
	public static void reverse(int n) {
		if(n==0) {
			return ;
		}
		int r= n%10;
		ans = ans*10+r;
		reverse(n/10);
	}
	
	public static void main(String[] args) {
		double a = 0.3232432;
		System.out.printf("%.5f" , a);
//		
		reverse(654);
		System.out.println(ans);
		System.out.println("jo");
		
	}
}
