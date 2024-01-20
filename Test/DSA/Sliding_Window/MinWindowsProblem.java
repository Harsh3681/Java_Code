package Sliding_Window;

import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class MinWindowsProblem {

	public static String findMinWindow(String S1, String S2) {

		// In the beginning, the window is empty
		String win = "";
		int ptr2 = 0;
		int minimum = S1.length() + 1;

		for (int ptr1 = 0; ptr1 < S1.length(); ptr1++) {

			// If the characters of both the strings are the same, then increment the ptr2
			// pointer
			// ptr1 will get incremented itself, as ptr1 is the loop variable.
			if (S1.charAt(ptr1) == S2.charAt(ptr2)) {
				ptr2 = ptr2 + 1;

				// the string S2 has been traversed completely. Therefore,
				// the time has come to shrink the window.
				if (ptr2 == S2.length()) {
					int e = ptr1 + 1;
					ptr2 = ptr2 - 1;

					// Reducing the window size
					while (ptr2 >= 0) {
						if (S1.charAt(ptr1) == S2.charAt(ptr2)) {
							ptr2 = ptr2 - 1;
						}
						ptr1 = ptr1 - 1;
					}

					ptr2 = ptr2 + 1;
					ptr1 = ptr1 + 1;

					// we have found the window of lesser length
					// hence, we have to update the window
					if (e - ptr1 < minimum) {

						// Updating the var minimum
						minimum = e - ptr1;

						// Updating the window
						win = S1.substring(ptr1, e);
					}
				}
			}
		}

		// returning our final answer, which is stored in the window
		return win;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MinWindowsProblem obj = new MinWindowsProblem();
		// input 1
		String s1 = "A";
		String s2 = "A";
		System.out.println("For the strings \"" + s1 + "\" and \"" + s2 + "\"");

		String str = obj.findMinWindow(s1, s2);
		System.out.println("The minimum window is : " + str);
		System.out.println();

		System.out.println(" \"H\" ");
	}

}
