package _2_Backtrack_Maze_Problem_Recursion_small;

import java.util.ArrayList;

public class Find_path_with_Obstacle_in_path {

//	Count total No Of Ways Possible
	
	public static int Find_and_Count_WayInObstacle(String out, boolean[][] maze, int row, int col){
		
		if(row==maze.length-1 && col==maze[0].length-1) {		// why "length-1" becz here we start our maze "index" from 0,0 row,col and goes upto "length-1" of size
			return 1;
		}
		if(!maze[row][col] ) {
			return 0;
		}
		int count=0;
		if(row<maze.length-1) {
			count = count+Find_and_Count_WayInObstacle(out+'D', maze, row+1, col);
		}
		if(col<maze[0].length-1) {
			count = count+Find_and_Count_WayInObstacle(out+'R', maze, row, col+1);
		}
		return count;
	}
	
	
//	---------------------------------------------------------------------------
//	With Print Ways
	
	public static void FindWayInObstacle(String out, boolean[][] maze, int row, int col){
		
		if(row==maze.length-1 && col==maze[0].length-1) {		// why "length-1" becz here we start our maze "index" from 0,0 row,col and goes upto "length-1" of size
			System.out.println(out);
			return ;
		}
		if(!maze[row][col]) {
			return ;
		}
		if(row<maze.length-1) {
			FindWayInObstacle(out+'D', maze, row+1, col);
		}
		if(col<maze[0].length-1) {
			FindWayInObstacle(out+'R', maze, row, col+1);
		}
	}
	
//	---------------------------------------------------------------------------
//	With ArrayList
	
	public static ArrayList<String> FindWayInObstacleArrayList(String out, boolean[][] maze, int row, int col){
		
		if(row==maze.length-1 && col==maze[0].length-1) {		// why "length-1" becz here we start our maze "index" from 0,0 row,col and goes upto "length-1" of size
			ArrayList<String> store  = new ArrayList<String>();
			store.add(out);
			return store;
		}
		if(!maze[row][col]) {
			return new ArrayList<>();
		}
		ArrayList<String> ans  = new ArrayList<String>();
		if(row<maze.length-1) {
			ans.addAll(FindWayInObstacleArrayList(out+'D', maze, row+1, col));
		}
		if(col<maze[0].length-1) {
			ans.addAll(FindWayInObstacleArrayList(out+'R', maze, row, col+1));
		}
		return ans;
	}
	
//	---------------------------------------------------------------------------
	
	public static void main(String[] args) {
		
//		if there is obstacles there in the path then we 
//		need to just return and terminate the process from that point only
//		and "here we are "not" doing any kind of backtracking here"
//		just stop and terminate the process at that point.
		
//		let's take that "obstacles" point at positin [2 row, 2 col] in 3X3 maze.
		

		boolean maze[][] = {
//				  0     1   2	 same for column 0,1,2
				{true,true,true},
				{true,false,true},
				{true,true,true},
				
//				{},{},{},	// this condition it will not able to handle empty 2D Array
		};
		
		System.out.println(Find_and_Count_WayInObstacle("", maze, 0, 0));
		
		FindWayInObstacle("", maze, 0, 0);
		
		ArrayList<String> ans  = new ArrayList<String>();
		ans = FindWayInObstacleArrayList("", maze, 0, 0);
		System.out.println(ans);
		
	}

}
