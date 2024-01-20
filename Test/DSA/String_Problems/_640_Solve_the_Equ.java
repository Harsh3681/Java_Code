package String_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _640_Solve_the_Equ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer ca[] = {2,3,5,1,3}; int ex = 3;
		System.out.println(ca.length);
		boolean ar[] = new boolean[ca.length];
		
		List<Boolean> ls = new ArrayList<>();
		
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(ca));
		ArrayList<Integer> cl = new ArrayList<>();
		System.out.println(a);
		for(int i=0; i<ca.length; i++) {
			int x = a.get(i);
//			System.out.println(x);
			
			a.remove(i);
			a.add(i, x+ex);
//			System.out.println(a);
			cl.addAll(a);
//			System.out.println("me "+cl);
			cl.sort(Comparator.reverseOrder());
			System.out.println("so "+cl);
			if(cl.get(i)>=cl.get(0)) {
				ls.add(i, true);
			}
			else {
				ls.add(i, false);
			}
			
			cl.clear();
		}
		System.out.println(ls);
	}

}
