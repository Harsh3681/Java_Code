package LinkedList;

import java.util.Scanner;

import LinkedList.tp.node;

/*			## Operation ##
 * 		1)	Create node ( dabba )
 * 		2)	addLast()
 * 		3)	addFirst()
 *		4)	AddMiddle()
 *		6) 	Reverse	(Iterative Approach)
 *		7)  ReveseByRecursion	( Recursion )
 *		8)	CenterMiddle	( find Middle Of LinkedList)
 *		9)	RemoveDuplicate
 *		10)	getNthFromLast	( from last find ele at given index )
 *		11) display()
 *
 *	 # Sorting LL
 *
 *		12) bubbleSort();
 *		13) SelectionSort()
 *		14) InsertionSort()
 *
 *		15) deleteFromBegin() 
 *		16) deleteFrom_N_th() 
 *		14) deleteFromEnd()
 *		15) deleteAlternative() 
 * 
 * */

public class Singly_LinkedList {

	public class node{
		int data;
		node next;
		
		node(int data){
			this.data = data;
			this.next = null;
		}
		
		node(int data, node next){
			this.data = data;
			this.next = next;
		}
	}
	
	node head = null;
	node data = null;
	
	public node addLast(int data) {
		node newNode = new node(data);
		if(head==null) {
			head=newNode;		
		}
		node temp = head;
		while(temp.next!=null) {
			temp= temp.next;
		}
		temp.next = newNode;
		newNode.next = null;
		
		return head;
	}
//	--------------------------------------------------------------------

	public node addFirst(int data) {
		node newNode = new node(data);
		if(head==null) {
			head=newNode;		
		}
		
		newNode.next = head;
		head = newNode;

		return head;
	}
//	--------------------------------------------------------------------

	public node AddMiddle(int key,int val) {
		node newNode = new node(val);
		if(head==null) {
			head=newNode;		
		}
		node temp = head;
		
		while(temp.data!=key) {
			temp= temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		
		return head;
	}
//	--------------------------------------------------------------------

//	con by "Iterative Method"
	
	public node Reverse() {
		if(head==null || head.next==null) {
			return null;
		}
		node cur = head;
		node prev = null;
		node next;
		while(cur!=null) {
			next = cur.next;
			cur.next = prev;
			
//			update now
			prev = cur;
			cur = next;
		}
		
//		here our head still pointed to the next node of the 
//		"LinkedList" while we are work with batch of 3 nodes
//		now we need to make that node as a "null" for sure
//		i.e
		
		head.next = null;
		head = prev; 	// and pointing our "head" node to "prev" of the list
		
		return head;
	}
	
//	--------------------------------------------------------------------

//	below "Reverse Array" By "Recursive Method"	// ### GFG QUE ###
	// using "Stack"
	
	public node ReveseByRecursion(node head) {
		
		if(head==null || head.next==null) {
			return head;
		}
		
		node newHead = ReveseByRecursion(head.next);
		head.next.next = head;
		head.next = null;
		
		return newHead;
	} 
	
//	--------------------------------------------------------------------
	
	
	
	
	

//	--------------------------------------------------------------------

	public int CenterMiddle() {
		
		node slow = head;
        node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
      }
	
//	--------------------------------------------------------------------

	public node RemoveDuplicate() { // only work if ele are already sorted
		
		if(head==null) {
			return head;
		}
		
		node temp=head;
		while(temp.next!=null) {
			if(temp.data==temp.next.data){
		          temp.next = temp.next.next;
	        }else{
	
	            temp = temp.next;
	        }
		}
		
//		node slow = head;
//		node fast = head.next;
//		
//		while(slow.data!=fast.data) {
//			slow = slow.next;
//			fast = fast.next;
//		}
//		slow.next = fast.next;
//		fast = slow.next;
		
		return head;
	}
	
//	--------------------------------------------------------------------

	int getNthFromLast(node head, int n)
    {
    	// Your code here
		if(head.next==null) {
			return 0;
		}
    	int size = 0;
    	node temp = head;
    	while(temp!=null){
    	    temp = temp.next;
    	    size++;
    	}
    	temp=head;
    	int finalPosition=size-n+1;
    	int c=1;
    	while(c!=finalPosition){
    	    c++;
    	    temp = temp.next;
    	}
    	return temp.data;
    	
    }
	
//	--------------------------------------------------------------------
	
	void Create() {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many ");
		int val = sc.nextInt();
		for(int i=0; i<val; i++) {
			int num = sc.nextInt();
			addLast(num);
		}
	}
//	--------------------------------------------------------------------

	public void searchByKey(int key) {
		boolean flag = false;
		if(head==null) {
			System.out.println("Empty!!!");
			return;
		}
		node temp = head;
		while(temp!=null) {
			if(temp.data==key) {
				System.out.println(temp.data+" Present");
				flag = true;
			}
			temp = temp.next;
		}
	
		if(flag==false) {
			System.out.println("Not found");
		}
	}

//	--------------------------------------------------------------------

	public void bubbleSort() {
		if(head==null) {
			return;
		}
		node current = head;
		node prev = null; int val;
		while(current!=null) {
			prev = current.next;
			while(prev!=null) {
				if(current.data>prev.data) {
					val = current.data;
					current.data = prev.data;
					prev.data = val;
				}
				prev = prev.next;
			}
			current = current.next;
		}
	}

//	--------------------------------------------------------------------------	

	public void SelectionSort() {
		if(head==null) {
			return;
		}

		node temp=head , prev =null; int val,dum;
		while(temp.next!=null) {
			prev = temp.next;
			while(prev!=null) {
				val = temp.data;
				if(val>prev.data) {
					val = prev.data;
				}
				dum = prev.data;
				prev.data = temp.data;
				temp.data = dum;
				
				prev = prev.next;
			}
			temp = temp.next;
		}
		
	}
	
//	--------------------------------------------------------------------------
//	Here we assume new head for "insertion sort"
//	here is link  https://www.prepbytes.com/blog/linked-list/insertion-sort-for-singly-linked-list/
	
	node newhead;				// <---------- dummy "Head"
	public void InsertionSort() {
		if(head==null) {
			return;
		}
		newhead = null;
		node temp = head;
		while(temp!=null) {
			node curr = temp.next;
			DoInsertionSort(temp);
			temp = curr;
		}
		head = newhead;			// real "head" now dummy head
	}
	
	void DoInsertionSort(node val) {
		if(val==null) {
			return;
		}
		if(newhead==null || newhead.data>=val.data) {
			val.next = newhead;
			newhead = val;
		}
		else {
			node temp = newhead;
			while(temp.next!=null && val.data > temp.next.data ) {
				temp = temp.next;
			}
			val.next = temp.next;
			temp.next = val;
		}
	}

//	--------------------------------------------------------------------------
	
	public void deleteBegi() {
		if(head==null) {
			return;
		}
		else {
			node temp = head;
			head = temp.next;
			temp = head;
		}
	}
//	--------------------------------------------------------------------------

    
	public void deleteEnd() {
		if(head==null) {
			return;
		}
		if(head.next==null) {
			head = head.next;
			return;
		}
		node temp = head;
		node pre = null;
		while(temp.next!=null) {
			pre = temp;
			temp = temp.next;
		}
		pre.next = null;
	}
	
//	--------------------------------------------------------------------------
	
	public int size(node head) {
		int c=0;
		node temp = head;
		while(temp!=null) {
			c++;
			temp=temp.next;
		}
		return c;
	}
	
	public void deleteNthPos(int n) {
		if(head==null) {
			return;
		}if(size(head)<n || n<1) {
			 System.out.println("OOB");
		}else {
			if(n==1) {
				head = head.next;
				return;
			}
			node temp =head;
			node prev = null;
			for(int i=1; i<size(head) && temp!=null; i++) {
				if(i==n) {
					prev.next = temp.next;
				}
				prev = temp;
				temp = temp.next;
			}
		}
	}
	
//	--------------------------------------------------------------------------

	void display() {
		if(head==null) {
			System.out.println("Empty!!");
		}
		node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	
	public static void main(String[] args) {
		
		
		
//		type 2 3 4 5 7 7 9 
		
		Singly_LinkedList ll = new Singly_LinkedList();
		ll.Create();
		ll.display();
		
		System.out.println("Middle "+ll.CenterMiddle());
		ll.display();
		
		ll.addFirst(0);
//		ll.AddMiddle(2,6);
		ll.display();
		
		ll.RemoveDuplicate();		// "RemoveDuplicate" work only for the sorted linked list 
									// contain repetitive ele ex 2 3 4 5 7 7 9 
		ll.display();
	
		System.out.println("Reverse by iteration");
		ll.head = ll.Reverse();		// becz here "Reverse" return head so store it
		ll.display();
		
		System.out.println("Reverse by Recursion");
		ll.head = ll.ReveseByRecursion(ll.head);
		ll.display();
		
		ll.searchByKey(5);	// any value we can put
		
//		System.out.println("Nth element "+ll.getNthFromLast(ll.head,6));
		
		System.out.println("bubbleSort");
		ll.bubbleSort();
		ll.display();
		
		System.out.println("SelectionSort");
		ll.SelectionSort();
		ll.display();
		
		System.out.println("InsertionSort");
		ll.InsertionSort();
		ll.display();
		
		System.out.println("Del beg");
		ll.deleteBegi();
		ll.display();
		
		System.out.println("Del End");
		ll.deleteEnd();
		ll.display();
		
		System.out.println("Del Nth");
		ll.deleteNthPos(3);
		ll.display();
		
	
		
		
				
	}

}
