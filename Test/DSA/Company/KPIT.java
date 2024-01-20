package Company;

import java.util.HashMap;
import java.util.Map;

public class KPIT {
	
//	Program to replace all 0's with 1 in a given integer:

	public static int replaceZeroWithOne(int num) {
        if (num == 0) {
            return 1;
        }
        int result = 0;
        int decimalPlace = 1;
        
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) {
                digit = 1;
            }
            
            result += digit * decimalPlace;
            System.out.println("me "+result);
            decimalPlace *= 10;
            num /= 10;
        }
        
        return result;
    }
//	----------------------------------------------------------------
	
//  Find the number of times digit 3 occurs in each and every number from 0 to n:
	 
	 public static int countDigitThree(int n) {
	        int count = 0;
	        
	        for (int i = 0; i <= n; i++) {
	            int num = i;
	            while (num > 0) {
	                int digit = num % 10;
	                if (digit == 3) {
	                    count++;
	                }
	                num /= 10;
	            }
	        }
	        
	        return count;
	    }
	 
//	----------------------------------------------------------------
		
//  The sum of digits in the given number:
	
	 public static int sumOfDigits(int num) {
	        int sum = 0;
	        
	        while (num > 0) {
	            int digit = num % 10;
	            sum += digit;
	            num /= 10;
	        }
	        
	        return sum;
	    }
	 
//	----------------------------------------------------------------
		
//  Linear search:
	 
	public static int linearSearch(int[] arr, int key) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == key) {
	                return i;
	            }
	        }
	        
	        return -1; // Element not found
	 }

//	----------------------------------------------------------------
	
//  Display the count for vowels in a given character array (taken using a character pointer):
	
	public static int countVowels(char[] arr) {
        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        
        for (char c : arr) {
            for (char vowel : vowels) {
                if (Character.toLowerCase(c) == vowel) {
                    count++;
                    break;
                }
            }
        }
        
        return count;
    }

//	----------------------------------------------------------------
	
// 	String Reversal:
	
	public static String reverseString(String str) {
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        return new String(arr);
    }
	
//	----------------------------------------------------------------

// Count the frequency of each element in an array:
	
	public static void countFrequency(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
        }
    }

//	-----------------------------------------------------------------------------------------------------------------
	
	public static void main(String[] args) {
		
//		Program to replace all 0's with 1 in a given integer:
		
		int num = 10204;
        int replacedNum = replaceZeroWithOne(num);
        System.out.println("Original Number: " + num);
        System.out.println("Number with 0's replaced with 1: " + replacedNum);
		System.out.println();
//    	----------------------------------------------------------------

//      Find the number of times digit 3 occurs in each and every number from 0 to n:
        
        int n = 23;	// output - 3 becz 3,13,23 here 3 came 3 times
        int count = countDigitThree(n);
        System.out.println("Number of times digit 3 occurs from 0 to " + n + ": " + count);
        System.out.println();
//    	----------------------------------------------------------------

//      The sum of digits in the given number:
        
        int val = 12345;
        int sum = sumOfDigits(val);
        System.out.println("Sum of digits in the number " + num + ": " + sum);
        System.out.println();

//    	----------------------------------------------------------------

//      Linear search:
        
        int[] arr = {5, 3, 8, 4, 2};
        int key = 8;
        int index = linearSearch(arr, key);
        
        if (index != -1) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
        System.out.println();
       
//    	----------------------------------------------------------------

//      Display the count for vowels in a given character array (taken using a character pointer):
        
        char[] justarr = {'H', 'e', 'l', 'l', 'o'};
        int co = countVowels(justarr);
        System.out.println("Number of vowels in the array: " + co);
        System.out.println();
        
//    	----------------------------------------------------------------

//      String Reversal:
        
        String str = "Hello, World!";
        String reversedStr = reverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
        
//    	----------------------------------------------------------------

//     Count the frequency of each element in an array:
 
        int[] nowarr = {1, 2, 3, 2, 1, 3, 4, 5, 4};
        countFrequency(nowarr);
        System.out.println();
        
     
	}

}
