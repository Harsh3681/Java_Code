package _2_Backtrack_Maze_Problem_Recursion_small;

import java.util.ArrayList;

public class Counting_Path_to_reach_destination_in_Maze_by_Recursion {

	public static int CountTotalPath(int r, int c) {
		if(r==1 || c==1) {
			return 1;
		}
		return CountTotalPath(r-1, c) + CountTotalPath(r, c-1);	
	}
	
	public static ArrayList<String> ShowActualPath(String out,int r, int c) {
		if(r==1 && c==1) {
			ArrayList<String> store = new ArrayList<>();
			store.add(out);
			return store;
		}
		ArrayList<String> ans = new ArrayList<>();
		
		if(r>1) {
			ans.addAll(ShowActualPath(out+'D',r-1,c));
		}
		if(c>1) {
			ans.addAll(ShowActualPath(out+'R',r,c-1));
		}
		return ans;
			
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(CountTotalPath(4, 3)); // 3X3 here a "Maze" size dabba
		
		ArrayList<String> ans = new ArrayList<>();
		ans = ShowActualPath("",4,3);
		System.out.println(ans);
		
	}

}
