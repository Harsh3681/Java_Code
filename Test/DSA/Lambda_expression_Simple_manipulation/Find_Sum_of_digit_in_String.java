package Lambda_expression_Simple_manipulation;

import java.util.Arrays;
import java.util.stream.Stream;

public class Find_Sum_of_digit_in_String {

	public static void main(String[] args) {
		
		String s = "Item1 10 Item2 25 Item3 30 Item4 45";
		Integer sum = Arrays.stream(s.split(" "))
			    .filter((sk) -> sk.matches("\\d+"))
			    .mapToInt(Integer::valueOf)
			    .sum();
		System.out.println(sum);
		
		
	
		
	}

}
