package _2_Backtrack_Maze_Problem_Recursion_small;

public class N_Queens_Problem {

	public static int queens(boolean[][] board, int row) {
		if(row==board.length) {
			display(board);
			System.out.println();
			return 1;
		}
		int count=0;
		
//		placing queen and checking for every "row" and "col"
		for(int col=0; col<board.length; col++) {
//			place queen if it is safe
			if(isSafe(board, row, col)) {
				board[row][col] = true;
				count+=queens(board, row+1);
				board[row][col] = false;
			}
		}
		return count;
	}
	
	public static boolean isSafe(boolean[][] board, int row, int col) {
//		check vertical row
		for(int i=0; i<row; i++) {
			if(board[i][col]) {
				return false;
			}
		}
		
//		this is for "left diagonal"
		int maxLeft = Math.min(row, col);
		for(int j=1;j<=maxLeft; j++) {
			if(board[row-j][col-j]) {
				return false;
			}
		}
		
//		this is for "Right diagonal"
		int maxRight = Math.min(row, board.length-col-1);
		for(int j=1;j<=maxRight; j++) {
			if(board[row-j][col+j]) {
				return false;
			}
		}
		return true;
	}

	public static void display(boolean[][] board){
		for(boolean[] row: board) {
			for(boolean element : row) {
				if(element) {
					System.out.print("Q ");
				}else {
					System.out.print("X ");
				}
			}
			System.out.println();
		}
	}

	
	public static void main(String[] args) {
		int n=5;
		boolean board[][] = new boolean[n][n];
		System.out.println("Total num of way possible for "+n+"X"+n+" = "+queens(board,0));
		
	}

}
