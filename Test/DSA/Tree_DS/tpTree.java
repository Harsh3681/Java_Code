package Tree_DS;

import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;


class nod{
	
	int data;
	nod left;
	nod right;
	
	public nod(int data) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
public class tpTree {
	static Scanner sc =null;
	static nod create(int arr[], int i) {
		
		nod root = null;
		
//		System.out.println("Enter Root ");
//		int val = sc.nextInt();
		
//		if(val==-1) {
//			return null;
//		}
		if(i<arr.length) {
			if(arr[i] == -1) {
				return null;
			}
			root = new nod(arr[i]);
			root.left = create(arr, 2*i +1);
			root.right = create(arr, 2*i +2);
		}
		
		
//		root = new nod(val);
		
//		System.out.println("enter left of "+val);
//		root.left = create();
		
//		System.out.println("enter right of "+val);
//		root.right = create();
		
		return root;
	}
	
	public static void inorder(nod root) {
		
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
		
	}
	
	public static void preorder(nod root) {
		
		if(root!=null) {
			System.out.print(root.data + " ");
			preorder(root.left);
			preorder(root.right);
		}
		
	}

	public static void postorder(nod root) {
		
		if(root!=null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + " ");
		}
		
	}
	

//	####################################################################################
	
	
	
	
//	####################################################################################
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sc = new Scanner(System.in);
//		int arr[] = {1,4,-1,9,5,-1,-1,1,-1,-1,7,3,-1,-1,-1};
		int arr[] = {1,4,4,3,7,7,3};
		nod root = create(arr,0);
		System.out.println();
		
	
		inorder(root);
	
		
		
	}

}
