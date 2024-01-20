package Tree_DS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;






class node{
	
	int data;
	node left;
	node right;
	
	public node(int data) {
		this.data = data;
	}
}


public class tree {					// that;'s starting from our original class all the function related the tree inside in it.
	
	static int ind = -1;		//  indexing for taking input from Array
	
	static node createT(int arr[]) {			
		
		node root = null;
		ind++;

		if(ind<arr.length) {
			if(arr[ind]==-1) {
				return null;
			}
			root = new node(arr[ind]);
		
			root.left = createT(arr);
			root.right = createT(arr);
		}
		
		return root;
	}
	
//	##########################################################################
	
	public static void Inorder(node r) {
		if(r!=null) {
			
			Inorder(r.left);
			System.out.print(r.data + " " );
			Inorder(r.right);
		}
	}
	
	public static void preorder(node r) {
		if(r!=null) {
			
			System.out.print(r.data + " ");
			preorder(r.left);
			preorder(r.right);
		}
	}

	
	public static void postorder(node r) {
		if(r!=null) {
			
			postorder(r.left);
			postorder(r.right);
			System.out.print(r.data+ " ");
			
		}
	}
	
//	##########################################################################
	
	public static int height(node r) {  
		if(r == null) {
			return 0;
		}
		else {
			return Math.max(height(r.left), height(r.right)) +1; 
		}
	}
	
//	##########################################################################
	
	public static int sizeOfTree(node r) {
		if(r == null) {
			return 0;
		}
		else {
			return sizeOfTree(r.left) + sizeOfTree(r.right) +1;
		}
	}
	
//	##########################################################################
	
	public static int MaxOfTree(node r) {
		if(r == null) {
			return Integer.MIN_VALUE;		// here "MIN_VALUE" means -ve infinity Value   u can also used "0"
		}
		else {
			return Math.max(r.data,Math.max(MaxOfTree(r.left), MaxOfTree(r.right)));
		}
	}
	
//	##########################################################################
	
//	####################  This below level Order travelsal gives an ans in O(n^2) timeComplexcity ################
//	used another approach  By using ------> "Queue Data Structure"  <--------
	
//	public static void LevelOrderTravelsal(node r, int level) {
//		
//		if(r == null) {
//			return ;
//		}
//		if(level==1) {
//			System.out.print(r.data + " ");
//		}
//		else if(level>1) {
//			
//			LevelOrderTravelsal(r.left, level-1);
////			
//			LevelOrderTravelsal(r.right, level-1);
//
//		}
//	}
	
	
	public static void LevelOrderTravelsal(node r) {
		
		if(r== null) {
			return ;
		}
		
		Queue<node> q = new LinkedList<>();
		q.add(r);
		q.add(null);
		
		while(!q.isEmpty()) {
			node currentNode = q.remove();
			if(currentNode == null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				}else {
					q.add(null);
				}
			}else {
				System.out.print(currentNode.data + " ");
				if(currentNode.left!=null) {
					q.add(currentNode.left);
				}
				if(currentNode.right!=null) {
					q.add(currentNode.right);
				}
			}
		}
	}

//	##########################################################################
	
	public static int sumOfTree(node r) {
		if(r == null) {
			return 0 ;			//  0 required most important
		}
		else {
			return sumOfTree(r.left) + sumOfTree(r.right) + r.data;
		}
	}
	
//	##########################################################################

	
//	Diameter Of The Tree 
//	Diameter for tree is an = "Numbere of nodes in the
//							   Longest Path Between 2 Nodes"
	  
	
//	There ARe 3 main cases For this "diameter" 
//	i.e   By "Diameter" with in "Left" subT
//		  By "Diameter" with in "Right" subT
//	      By "Diameter" with the "Root" node --->  by "height" of left subTree + "height" of right subTree
	
// and then Find out Max Out off this Above 3 We get "Diameter"	


	public static int Diameter(node r) {
		if(r==null) {
			return 0;
		}
		else {
			int lst = Diameter(r.left);	     //  dia with in "Left" subT
			int rst = Diameter(r.right);	 // dia with in "Right" subT
			int totlT = height(r.left) + height(r.right ) +1;  // with considering the "Root" node , "+1" for root

			return Math.max(totlT, Math.max(lst, rst));		  // Max Among This 3 is Our Diameter
		}
	}
	
//	##########################################################################
	
//	"Subtree" of "Another Tree"
//	Means -->  "Tree containing The given "Subtree"
	
//	%%%%%%%%%%%%   This Below Code For one larger Tree Is Containing an One Smaller tree Or Not %%%%%%%%%%%%%%%

	public static boolean isSameSame(node r1, node s1){
		if(r1 == null && s1 == null) {   // means if both the "tree's" are end it at there "Leaf's" at same time then "true"
			return true;
		}
		
		if(r1 == null || s1 == null) {
			return false;
		}
		
		if(r1.data == s1.data) {
			return isSameSame(r1.left, s1.left) && isSameSame(r1.right, s1.right);
		}
		
		else {
			return false;
		}
	}
	
	
	
	public static boolean SameTOrNot(node r, node subroot) {
		if(subroot == null) {
			return true;
		}
		if(r == null) {
			return false;
		}
		if(r.data == subroot.data) {
			if(isSameSame(r, subroot)) {
				return true;
			}
		}
		return isSameSame(r.left, subroot) || isSameSame(r.right, subroot);
	}
	
//	-----------------------------------------------------------------------------------------------------
	
//	@@@@@@@@@@@@@@@@@@@@  2 trees's Are same or not by " "Recursion Method"    @@@@@@@@@@@@@@@@@@@@@@
	
	
	public static boolean isSameTree(node p, node q) {
		if(p==null && q==null) {
			return true;
		}
		if(p!=null && q==null || p==null && q!=null) {
			return false;
		}
		if(p.data != q.data) {
			return false;
		}
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		
	}
	
	
//	##########################################################################
	
//	 Find Sum At "Kth" level of the tree . They Are given u an level AS an input we have to find sum of node at tht level.
	
	public static int SumOfNodeAtLevel(node r, int level) {
		int ll = 0;
		int sum = 0;
		if(r== null) {
			return -1;
		}
		
		Queue<node> q = new LinkedList<>();
		q.add(r);
		q.add(null);
		
		while(!q.isEmpty()) {
			node currentNode = q.remove();
			if(currentNode == null) {
				System.out.println();
				ll++;
				if(q.isEmpty()) {
					break;
				}else {
					q.add(null);
				}
			}else {
				if(level==ll) {
					sum+=currentNode.data;
				}
				if(currentNode.left!=null) {
					q.add(currentNode.left);
				}
				if(currentNode.right!=null) {
					q.add(currentNode.right);
				}
			}
		}
		return sum;
	}

//	##########################################################################

	
//	below one is there function And Another one is to print an output
	
//	This Program help to view the tree From "left" as well As From "Right";
	
	
	public static void actalleftRightView(node r, ArrayList arr, int level) {

		if(r==null) {
			return ;
		}
		
		if(arr.get(level) == null) {
			arr.set(level, r.data);
		}
		actalleftRightView(r.left, arr, level+1);
		actalleftRightView(r.right, arr, level+1);
	}
	
	
	public static void view(node r) {
		ArrayList<node> arr = new ArrayList<>();
		
		actalleftRightView(r, arr, 0);
		for(node cur : arr) {
			System.out.println(cur.data + " ");
			
		}
		
	}
	
	
//	##########################################################################
	
	public static boolean issymmetric(node r,node l) {
		if(r==null || l==null) {
			return r==l;
		}
		if(r.data!= l.data ) {
			return false;
		}
		return issymmetric(r.left, l.right) && issymmetric(r.right, l.left);
		
	}
	public static boolean symmetriCheck(node r) {
		if(r == null) {
			return true;
		}
		return issymmetric(r.left, r.right); 
		
	}
	
	
	
//	##########################################################################
	
	
	

	
	public static void main(String[] args) {

//		     	6			root 6
//		       / \
//		      7    2
//		     /	  / \ 
//		    1	 3	 4 
		
		
		
//		inorder --- > 8 7 6 3 2 4 
//		preorder --- > 6 7 8 2 3 4 
//		postorder --- > 8 7 3 4 2 6 
		
		
//		lets tak above tree 
//		where at that place therev is notv any node at the 
//		time of input put "-1" over there
//		
//		For The Input of this question Watch the video of Anuj Bhaiya 
//		video no 56 data structure with java
//		int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};   // tp
//		int arr[] = {6,7,1,-1,-1,-1,2,3,-1,-1,4,-1,-1};
		int arr[] = {1,4,4,3,7,7,3};
//		sc = new Scanner(System.in);
//		create();
		
//		int sub[] = {6,7,2};
		
		node root = createT(arr);
		//node root2 = createT(sub);   // for subTree Wala Que
		
		
		Inorder(root);
		System.out.println();
		preorder(root);
		System.out.println();
		postorder(root);
		System.out.println();
		
//		height is 3 according above dia
		int h = height(root);
		System.out.println("height "+ h);
		
		int s = sizeOfTree(root);
		System.out.println("Size "+ s);
		
		int m = MaxOfTree(root);
		System.out.println("Max "+ m);
		
//		LevelOrderTravelsal(root,2);	// for commented program "LevelOrderTravelsal"
		
		LevelOrderTravelsal(root);
		
		int sum = sumOfTree(root);
		System.out.println("Sum - " +sum);
		
		int dia = Diameter(root);
		System.out.println("diameter - " + dia);
		
//		boolean sb = SameTOrNot(root, root2);					// means one tree contains an another tree or not
//		if(sb == true) {System.out.println("Trueeeee");}
//		else {System.out.println("Falseeeeeee");}
//		
//		boolean sT = isSameTree(root, root2);					// here both tree are same or not
//		if(sT == true) {System.out.println("TruTru");}
//		else {System.out.println("Furufuru");}
		
		int sumLevel = SumOfNodeAtLevel(root,2);
		System.out.print("sumL "+sumLevel);
//		
//		view(root);
		
		System.out.println();
		boolean check = symmetriCheck(root);
		if(check==true) {System.out.println("Symmetric");}
		else {System.out.println("Not");}
	
		
	}

}


