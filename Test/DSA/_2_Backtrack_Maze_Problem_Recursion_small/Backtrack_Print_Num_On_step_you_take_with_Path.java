package _2_Backtrack_Maze_Problem_Recursion_small;

import java.util.Arrays;

public class Backtrack_Print_Num_On_step_you_take_with_Path {

	public static void Num_On_Step_With_Path(String out, boolean[][] maze, int row, int col,int path[][] ,int step) {
		if(row==maze.length-1 && col==maze.length-1) {
			path[row][col] = step; // here we make change only
			for(int[] arr: path) {
				System.out.println(Arrays.toString(arr));
			}
			System.out.println(out);
			System.out.println();
			return;
		}
		if(!maze[row][col]) {
			return;
		}
		
		maze[row][col] = false; // here we just make our maze "False" for current.
		
		path[row][col] = step; // here we make change only
		
//		this is for "Down"
		if(row<maze.length-1) {
			Num_On_Step_With_Path(out+'D', maze, row+1, col, path,step+1);
		}
//		this is for "Right"
		if(col<maze[0].length-1) {
			Num_On_Step_With_Path(out+'R', maze, row, col+1, path,step+1);
		}
//		this is for "Up" "up" only possible when row (size) greater > 0
		if(row>0) {
			Num_On_Step_With_Path(out+'U', maze, row-1, col, path,step+1);
		}
//		this is for "Down"
		if(col>0) {
			Num_On_Step_With_Path(out+'L', maze, row, col-1, path,step+1);
		}
		
		maze[row][col] = true;		// here we just make our maze as it already befor start the function i.e "true"
		path[row][col] = 0;
	}
	
	
	public static void main(String[] args) {
		boolean maze[][] = {
				{true,true,true},
				{true,true,true},
				{true,true,true},
		};
		
		int path[][] = new int[maze.length][maze[0].length];
		Num_On_Step_With_Path("", maze, 0, 0, path, 1);
	}

}
