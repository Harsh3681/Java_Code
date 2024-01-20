package _1_Recursion;

import java.util.ArrayList;

public class Amazon_dice_Problem {

	public static void dice(int arr[], String inp, int target) {
		if(target==0) {
			System.out.println(inp);
			return;
		}
		int upto = arr.length;
		for(int i=1; i<=upto && i<=target; i++) {
			dice(arr, inp+i, target-i);
//			ithe ek bajune wadhawat jatoy ek bajune kami karat jatoy
//			take i.e (inp+i) see how much remaining i.e (target-i) .Continue same process until "target" not "Empty" 
		} 
	}	
//	--------------------------------------------------------------------------
	
//	With "ArrayList" now
	
	public static ArrayList<String> dice_Return_in_ArrayList(int arr[], String inp, int target) {
		if(target==0) {
			ArrayList<String> list = new ArrayList<>();
			list.add(inp);
			return list;
		}
		int upto = arr.length;
		ArrayList<String> ans = new ArrayList<>();
		for(int i=1; i<=upto && i<=target; i++) {
			ans.addAll(dice_Return_in_ArrayList(arr, inp+i, target-i));
//			ithe ek bajune wadhawat jatoy ek bajune kami karat jatoy
		} 
		return ans;
	}
	
//	--------------------------------------------------------------------------
	
//	Count Total such "Combination" Possible.
	
	public static int Count_dice_Comination_Possible(int arr[], String inp, int target) {
		if(target==0) {
			return 1;
		}
		
		int count = 0;
		int upto = arr.length;
		for(int i=1; i<=upto && i<=target; i++) {
			count = count + Count_dice_Comination_Possible(arr, inp+i, target-i);
//			ithe ek bajune wadhawat jatoy ek bajune kami karat jatoy
		} 
		return count;
	}
	
	public static void main(String[] args) {

//		https://www.youtube.com/watch?v=9ByWqPzfXDU&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=34
		
//		So Que is there was an continues non empty integer Array
//		array me be [1,2,3,4,5,6]
//		and the target num "anything" let's assume  -> 4
//		now we need to form combination of "num" given in Array
//		so that there sum = target.
		
//		Ex - arr[] = {1,2,3,4,5,6}, target = 4;
//		Output    = [1111,112,121,13,211,22,31,4]
		
//		--------------------------------------------------------------------------

		int arr[] = {1,2,3,4,5,6}, target=4;
		dice(arr,"",target);
//		--------------------------------------------------------------------------
		System.out.println(dice_Return_in_ArrayList(arr,"",target));
		
//		--------------------------------------------------------------------------
		System.out.println("Total Combination Posssible "+Count_dice_Comination_Possible(arr,"",target));
		
//		--------------------------------------------------------------------------
		System.out.println("3"+1);

	}

}
