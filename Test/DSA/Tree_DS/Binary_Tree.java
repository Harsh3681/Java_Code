package Tree_DS;

import java.util.*;

//Class containing left and right child
//of current node and key value


//###############################################################

public  class Binary_Tree {

class Node {
	
		 int root;
		 Node left;
		 Node right;
	
		public Node(int root) {
			this.root = root;
			this.left =null;
			this.right = null;
		}
}
		
	
		
//    ###############################################################
		
		static class myclass{
			public static Node insert(Node r,int mynode) {
	//		public int insert(int val) {
			
				Node val  = new Node(mynode);
				val.left = val.right = null;
				
				if(r == null) {
					r = val;
					return r;
				}
				
				Node temp = r;
				while(temp!=null) {
					
					if (mynode<=temp.root) {
						if(temp.left == null) {
							temp.left = val;
							break;
						}
						else {
							temp = temp.left;
						}
					}
					else {
						if(temp.right == null) {
							temp.right = val;
							break;
						}
						else {
							temp = temp.right;
						}
						
						}	
				
					}
					return r;
			}
		}
		
		
//		###############################################################
		
		
		public static boolean search(int val) {
			if(root==val) {
				return true;
			}
			else if(val<=root) {
				if(left!=null) {
					return left.search(val);
				}
				else {
					return false;
				}
			}
			else {
				if(right!=null) {
					return right.search(val);
				}
				else {
					return false;
				}
			}
		}
		
		
		
//		###############################################################
		
		public static void printInorder(Node r) {
			if(r!=null){
				printInorder(r.left);
			    System.out.println(r.root);
			    printInorder(r.right);
			  }
		}
		
		
		public static void printPreOrder(Node r) {
			if(r!=null){
				System.out.println(r.root);
				printInorder(r.left);
			    printInorder(r.right);
			  }
			
		}
		
		public static void printPostOrder(Node r) {
			if(r!=null){
				printInorder(r.left);
			    printInorder(r.right);
			    System.out.println(r.root);
			  }
		}
		
		
//		##############################################################
		
		public static Node create(Node r) {
			int n, num;
			System.out.println("Enter How MAny ");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			for(int i=0;i<n;i++){
				System.out.printf("Enter %d element : ",i+1);
			    num = sc.nextInt();
			    r = insert(r,num);
			  }
			return r;
		}
		
		
		
//		################################################################
		
		public static Node find (Node r) {
			Node temp = r;
			
			if(temp.right!=null) {
				while(temp.left!=null) {
					temp = temp.left;
				}
			}
			else {
				while(temp.right!=null) {
					temp = temp.right;
				}
			}
			
			return temp;
			
		}
		
		
		
		
//		#####################################################
		
		
		public static Node del(Node r, int key) {
			if(r== null) {
				return r;
			}
			if(r.left == null && r.right==null) {
				r = null;
				return null;
			}
			
			if(key < r.root) {
				r.left = del(r.left, key);
			}
			else if(key> r.root){
				r.right = del(r.right, key);
			}
			
			else {
				
				if (r.left == null) {
		            Node temp = r.right;
		            r.root = -1;
		            return temp;
		        }
		        else if (r.right == null) {
		            Node temp = r.left;
		            r.root = -1;
		            return temp;
		        }
		        else{
		          Node temp = find(r.right);
		          r.root = temp.root;
		          r.right = del(r.right, temp.root);    //    ## Catch ##
		        }

			}
			return r;
			
		}

//}
	
//	static class bt{
//		static int ind = -1;
//		public Node insert(int arr[]) {			// here we tak "Node" becz we hava to return Our "Root" node
//			ind++;
//			
//			if(arr[ind]==-1) {
//				return null;
//			}
//			
//	//		Here We Try to build our Left Subtree
//			Node mynode  = new Node(arr[ind]);		// assigning our values to the nodes whow name is "mynode"
//			
//			mynode.left =  insert(arr);				// And here assigning remaining Values to it Recursively
//			mynode.right = insert(arr);				// And here assigning remaining Values to it Recursively
//			
//			return mynode;
//		}
//	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int k,c;
//			Node n1 = new Node(1);
			
			Scanner sc = new Scanner(System.in);
			
			Node r = null; 
			do {
				System.out.println("Choice\n0.Exit\n1.Insert\n2.show\n3.search\n4.delete\n");
				c= sc.nextInt();
				switch (c) {
				case 1:
					
					r  = create(r);
					break;

				case 2:
					
					
					System.out.println("in");
					printInorder(r);
					System.out.println("Po");
					printPostOrder(r);
					System.out.println("Pre");
					printPreOrder(r);
					System.out.println();
					
					break;
					
				case 3:
					System.out.println("Enter ");
					k = sc.nextInt();
					search(k);
					break;
				
				case 4:
					System.out.println("Num to Del ");
					k = sc.nextInt();
					r = del(r,k);
					break;

				}
			}while(c!=0);
//			n1.insert(2);
//			n1.insert(4);
//			n1.insert(-1);
//			n1.insert(-1);
//			n1.insert(5);
//			n1.insert(-1);
//			n1.insert(-1);
//			n1.insert(3);
//			n1.insert(-1);
//			n1.insert(6);
//			n1.insert(-1);
//			n1.insert(-1);
//			
//			System.out.println("Space");
//			
//			boolean ans = n1.find(2);
//			if(ans==true) {
//				System.out.println("Find");
//			}
//			else {
//				System.out.println("Not Find");
//			}
			
		
	
		}

}
