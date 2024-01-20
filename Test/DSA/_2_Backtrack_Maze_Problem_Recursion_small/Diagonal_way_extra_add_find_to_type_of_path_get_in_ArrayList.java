package _2_Backtrack_Maze_Problem_Recursion_small;

import java.util.ArrayList;

public class Diagonal_way_extra_add_find_to_type_of_path_get_in_ArrayList {

	public static ArrayList<String> ShowActualPath(String out,int row, int col){
		if(row==1 && col==1) { // row==colo==1 becz our destination is at last corner of the maze i.e 1,1 - row,col becz we start index of maze from 3 upto 1 (both "row" and "col" is at 3,3 Position initially) goes upto 1 hence when "row" and "col" heat 1,1 then got answer "base Case"
			ArrayList<String> store = new ArrayList<String>();
			store.add(out);
			return store;
		}
		ArrayList<String> ans = new ArrayList<String>();
		if(row>1 && col>1) {
			ans.addAll(ShowActualPath(out+'D', row-1, col-1));
		}
		if(row>1) {
			ans.addAll(ShowActualPath(out+'V', row-1, col));
		}
		if(col>1) {
			ans.addAll(ShowActualPath(out+'H', row, col-1));
		}
		return ans;
	}
	
	public static void main(String[] args) {
		ArrayList<String> ans = new ArrayList<>();
		ans = ShowActualPath("",3,3);
		System.out.println(ans);
		
	}

}
