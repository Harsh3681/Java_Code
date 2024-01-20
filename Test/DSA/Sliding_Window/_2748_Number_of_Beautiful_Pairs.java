package Sliding_Window;


public class _2748_Number_of_Beautiful_Pairs {
	public static int gcd(int a, int b) {
		while(a!=b) {
			if(a>b) {
				a = a-b;
			}
			else {
				b = b-a;
			}
		}
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Input: nums = [2,5,1,4]
//		Output: 5
//		Explanation: There are 5 beautiful pairs in nums:
//		When i = 0 and j = 1: the first digit of nums[0] is 2, and the last digit of nums[1] is 5. We can confirm that 2 and 5 are coprime, since gcd(2,5) == 1.
//		When i = 0 and j = 2: the first digit of nums[0] is 2, and the last digit of nums[2] is 1. Indeed, gcd(2,1) == 1.
//		When i = 1 and j = 2: the first digit of nums[1] is 5, and the last digit of nums[2] is 1. Indeed, gcd(5,1) == 1.
//		When i = 1 and j = 3: the first digit of nums[1] is 5, and the last digit of nums[3] is 4. Indeed, gcd(5,4) == 1.
//		When i = 2 and j = 3: the first digit of nums[2] is 1, and the last digit of nums[3] is 4. Indeed, gcd(1,4) == 1.
//		Thus, we return 5.
		
		int nums[] = {11,21,12};
		int c=0, n=nums.length;

		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				int l = nums[j]%10;
				String s = Integer.toString(nums[i]);
			    int f = s.charAt(0) - '0';	 // <---  - '0' it help to get exact index value in string
				int val = gcd(f, l);
				System.out.println(f+" "+l +"= "+ val);
				if(val<=1) {
					c++;
				}
				
			}
		}
		
        System.out.println(c);
		
		
		

	}

}
