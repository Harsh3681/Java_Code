package String_Problems;

import java.util.HashMap;
import java.util.Map;

public class _2744_Find_Maximum_Number_of_String_Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Input: words = ["cd","ac","dc","ca","zz"]
//		Output: 2
//		Explanation: In this example, we can form 2 pair of strings in the following way:
//		- We pair the 0th string with the 2nd string, as the reversed string of word[0] is "dc" and is equal to words[2].
//		- We pair the 1st string with the 3rd string, as the reversed string of word[1] is "ca" and is equal to words[3].
//		It can be proven that 2 is the maximum number of pairs that can be formed.
		
		String words[] = {"cd","ac","dc","ca","zz"};
		
		Map<String, Integer> mp = new HashMap<>();
		for(String i:words) {
			String rev = new StringBuilder(i).reverse().toString();
			if(mp.containsKey(rev)) {
				mp.put(rev, (mp.get(rev)+1));
			}else {
				mp.put(i, 0);
			}
		}
		int count = 0;
		for(String j:mp.keySet()) {
			count+=mp.get(j);
		}
		
		System.out.println(count);

	}

}
