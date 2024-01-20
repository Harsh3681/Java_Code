package Lambda_expression_Simple_manipulation;

import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.*;

public class Filter_to_find_specific_string_in_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();
		list.add("One");
		list.add("OneAndOnly");
		list.add("Derek");
		list.add("Change");
		list.add("factory");
		list.add("justBefore");
		list.add("Italy");
		list.add("Italy");
		list.add("Thursday");
		list.add("");
		list.add("");
		
		Stream<String> stream = list.stream().filter(element -> element.contains("d"));
		System.out.println(stream.toArray());

		
		
	}

}
