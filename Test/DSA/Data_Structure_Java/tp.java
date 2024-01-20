package Data_Structure_Java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class tp {
	
	static ArrayList<Integer> subarraySum(int[] arr, int n) 
    {
        int ss = 0;
        ArrayList<Integer> ak =  new ArrayList<>();
        // Your code here
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j; k++){
                   System.out.print(" "+arr[k]);
                	ss += arr[k];
                }
                System.out.println();
                System.out.println(ss);
                System.out.println("\nme");
                ss=0;
            }
        }
        
        return ak;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,0,0,0,0};
		int arr2[] = {0,0,0,0,0};
		int n=5 , m=5;
		
		tp obj = new tp();
//		ArrayList<Integer> me = tp.subarraySum(arr, n);
//		for(int i=0; i<me.size(); i++) {
//			System.out.println(me.get(i));
//		}
		
//		System.out.println((4*(4+1)/2));
		
//		String s = "ATTCGGGA";
//		String s= "abcd";
//		
//		int l = s.length();
//		for(int i=0; i<l; i++) {
//			for(int j=i; j<l; j++) {
//				for(int k=i; k<=j; k++) {
//					System.out.print(""+s.charAt(k));
//				}
//				System.out.println();
//			}
//		}
		
//		----------------------------------------------------------------------------------
		
		
		
//		 ArrayList<Integer> me =  new ArrayList<>();
//			
//		// Auxiliary dp[][] array
//        int[][] dp = new int[n + 1][m + 1];
//        for (int i = 0; i <= n; i++)
//            for (int j = 0; j <= m; j++)
//                dp[i][j] = 0;
//        		
// 
//        // Updating the dp[][] table
//        // in Bottom Up approach
//        for (int i = n - 1; i >= 0; i--)
//        {
//            for (int j = m - 1; j >= 0; j--)
//            {
//                // If A[i] is equal to B[i]
//                // then dp[j][i] = dp[j + 1][i + 1] + 1
//                if (arr[i] == arr2[j])
//                    dp[i][j] = dp[i + 1][j + 1] + 1;
//            }
//        }
//        int maxm = 0;
// 
//        // Find maximum of all the values
//        // in dp[][] array to get the
//        // maximum length
//        for (int i = 0; i < n; i++)
//        {
//            for (int j = 0; j < m; j++)
//            {
//                // Update the length
//                maxm = Math.max(maxm, dp[i][j]);
//            }
//        }
// 
//        // Return the maximum length
//        System.out.println(maxm);
        
//		--------------------------------------------------------------------------------------
//		Ex = "0010100"
//		O/t = 0000011
		
        
//		String ki = "0010100";
//		int c=0;
//		for(int i=0; i<ki.length(); i++) {
//			if(ki.charAt(i)=='1') {
//				c++;
//			}
//		}
//		String li;
//		Scanner sc = new Scanner(System.in);
//		StringBuilder string = new StringBuilder(ki);
//		for(int i=0; i<ki.length(); i++) {
//			if(ki.length()>2 && ki.charAt(i)=='0') {
//				string.setCharAt(i,'1');
//			}
//			if(ki.length()>2 && i<(ki.length()-c)) {
//				string.setCharAt(i,'0');
//			}
//		}
//		System.out.println(string);

//		--------------------------------------------------------------------------------------
		
		
//		Given an integer array nums, return true if there exists a triple of indices (i, j, k) 
//		such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
		
//		input: nums = [1,2,3,4,5]
//		Output: true
//		Explanation: Any triplet where i < j < k is valid.
		
//		Input: nums = [5,4,3,2,1]
//		Output: false
//		Explanation: No triplet exists.
		
		
//		int nums[] = {1,2,3,4,5};
//		int firstnum = Integer.MAX_VALUE;
//		int secnum = Integer.MAX_VALUE;
//		for(int num : nums) {
//			if(num<=firstnum) { firstnum = num;}
//			else if(num<=secnum) {secnum = num;}
//			else {System.out.println("t");}
//		}
//		System.out.println("f");
		
//		--------------------------------------------------------------------------------------

		
		

        
        

	}

}
