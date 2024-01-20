import java.util.*;

public class _08_Multi_Dimensional_Array {

	public static void main(String[] args) {
		
		Scanner kk = new Scanner(System.in);
		
		int r ,c;
		System.out.print("Enter Raw and Columns - ");
		r = kk.nextInt();
		c = kk.nextInt();
		
		int col[][] = new int[r][c];
		
		for(int i=0; i<r; i++) {
			System.out.println(i+1+"Raw");
			for(int j=0; j<c; j++) {
				System.out.println(j+1+"num");
				col[i][j] = kk.nextInt();
			}
		}
		
		System.out.println("Array\n");
		
		for(int i=0; i<r; i++) {
			System.out.print("{ ");
			for(int j=0; j<c; j++) {
				System.out.print(col[i][j]);
				System.out.print(" ");
			}
			System.out.println("}");
		}
		

	}

}
