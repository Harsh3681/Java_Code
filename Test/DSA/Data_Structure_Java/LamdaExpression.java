package Data_Structure_Java;

import java.util.Arrays;

public class LamdaExpression {
	
	
	public static void sopa(int[] s)			// for 1d Array
	{
		Integer ar[] = Arrays.stream(s).boxed().toArray(Integer[]::new);
		
		
				
//		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(ar));
		
		Arrays.sort(ar,(a,b) ->{
			
		  return a-b; // ascending order sorting			// for 1d array
//		  return b-a; // descending order sorting
			
		});	
		
		for(int i=0; i<s.length; i++) {					// for int 1d array
			System.out.print(s[i] + " ");
		}

	}
	
//	-----------------------------------------------------------------------------	
	
	public static void sorte(int[][] s, int k)			// for 2d Array
	{

		Arrays.sort(s,(a,b) ->{
			
			return b[k] - a[k];						// for 2d Array			
		});
		
		for(int i=0; i<s.length; i++) {						// for 2d array
			for(int j=0; j<s[0].length; j++) {
//					
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	
//	-----------------------------------------------------------------------------	
	
	public static void sopa(String[] s)			// for 1d Array
	{
		
		Arrays.sort(s,(a,b) ->{
			return b.length() - a.length();
			
		});
		
		for(int i=0; i<s.length; i++) {					// for int 1d array
			System.out.print(s[i] + " ");
		}
	
	}
	
//	-----------------------------------------------------------------------------
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {3,45,2,-2,4,-4};
//		sopa(a);
		
		int s[][] = {{10,6,9,1},{7,5,11,2},{4,8,3,15}};
//		sorte(s, 2);
		
		String ab[] = {"jan", "feb", "March", "April", "May", "June"};
		sopa(ab);
		
		
	}

}
