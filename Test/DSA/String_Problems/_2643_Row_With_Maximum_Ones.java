package String_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _2643_Row_With_Maximum_Ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mat[][] = {{0,1},
					   {1,0}};
//		[0,1]
//			System.out.println(mat[0].length);
		Integer c=0;
		Integer ak[] = {2,3};
		ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(ak));
		System.out.println("me "+ar);
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length; j++) {
				if(mat[i][j]==1) {
					c++;
				}
			}
			ar.add(c);
			c=0;
		}
		int ans = Collections.max(ar);
//		System.out.println(ar.indexOf(ans)+ " = "+ans);
		int anss[] = new int[2];
		anss[0] = ar.indexOf(ans); anss[1] = ans;
		
			
	}

}
