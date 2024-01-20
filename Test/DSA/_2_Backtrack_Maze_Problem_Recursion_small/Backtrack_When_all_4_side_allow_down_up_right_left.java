package _2_Backtrack_Maze_Problem_Recursion_small;

public class Backtrack_When_all_4_side_allow_down_up_right_left {
	
	public static void FourSideOpenToReachToDestination(String out, boolean[][] maze, int row, int col) {
		if(row==maze.length-1 && col==maze.length-1) {
			System.out.println(out);
			return;
		}
		if(!maze[row][col]) {
			return;
		}
		
		maze[row][col] = false; // here we just make our maze "False" for current.
		
//		this is for "Down"
		if(row<maze.length-1) {
			FourSideOpenToReachToDestination(out+'D', maze, row+1, col);
		}
//		this is for "Right"
		if(col<maze[0].length-1) {
			FourSideOpenToReachToDestination(out+'R', maze, row, col+1);
		}
//		this is for "Up" "up" only possible when row (size) greater > 0
		if(row>0) {
			FourSideOpenToReachToDestination(out+'U', maze, row-1, col);
		}
//		this is for "Down"
		if(col>0) {
			FourSideOpenToReachToDestination(out+'L', maze, row, col-1);
		}
		
		maze[row][col] = true;		// here we just make our maze as it already befor start the function i.e "true"
	}
	
	
	public static void main(String[] args) {
		boolean maze[][] = {
				{true,true,true},
				{true,true,true},
				{true,true,true},
		};
		
		FourSideOpenToReachToDestination("",maze,0,0);
	}

}
