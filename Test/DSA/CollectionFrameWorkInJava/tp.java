package CollectionFrameWorkInJava;
import java.util.*;

public class tp {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(4);ar.add(24);ar.add(14);ar.add(44);ar.add(84);ar.add(40);
		System.out.println(ar);
		List<Integer> ans = ar.subList(0, 5);
		ans.forEach(i-> {
			System.out.println(i); 
		});
		
	}

}
