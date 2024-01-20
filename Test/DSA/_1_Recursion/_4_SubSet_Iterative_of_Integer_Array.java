package _1_Recursion;
import java.util.*;
public class _4_SubSet_Iterative_of_Integer_Array {

	static ArrayList<List<Integer>>subSetIterative(int ar[]){
		Arrays.sort(ar);
		ArrayList<List<Integer>> outer = new ArrayList<>();
		
		outer.add(new ArrayList<>());
		
		for(int num : ar) {
			int n = outer.size();
			for(int i=0; i<n ;i++) {
				List<Integer> inner = new ArrayList<>(outer.get(i));
				inner.add(num);
				if(!outer.contains(inner)) {		// here we "prevent" "outer" ArrayList<> from getting add ele repeatedly
					outer.add(inner);
				}else { // otherwise eliminated remaining thing
					continue; // just continue
				}
			}
		}
		return outer;
	}
	
	public static void main(String[] args) {
		
		ArrayList<List<Integer>> ans  = new ArrayList<>();
		int ar[] = {1,2,3,2};
		ans = subSetIterative(ar);
		System.out.println(ans.size());
		System.out.println(ans);

	}

}
