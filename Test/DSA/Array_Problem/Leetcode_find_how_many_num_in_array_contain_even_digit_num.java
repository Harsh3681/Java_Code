package Array_Problem;

public class Leetcode_find_how_many_num_in_array_contain_even_digit_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Q) Here we need to find 
//		Given array nums of integer return how many of them contain 
//		"Even number of digit"
		
//		Ex {12,234,345,2234}
//		so here 12 and 2234 has even no of digit i.e "12" size 2 hence it is even and "2234" size 4 also be "even"
		
		int arr[] = { 12,234,345,2234 };
		int c=0;
		for(int i : arr) {
			String s = String.valueOf(i);
			if(s.length()%2==0) {
				c++;
			}
		}
		System.out.println(c);
	
		
		
	}

}
