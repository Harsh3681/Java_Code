package LinkedList;

import java.util.Scanner;

import LinkedList.Doubly_linkedList.node;

public class Circular_LinkedList {

	class node{
		int data;
		node next;
		
		node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	node data = null;
	node head = null;		// head
	node tail = null;		// tail
	
	Circular_LinkedList(){
		this.head = null;
		this.tail = null;
	}
	
	
	private node Add(int num) {		// becz here AddFirst and Last both are same
		node newNode = new node(num);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		tail.next = newNode;
		newNode.next = head;
		tail = newNode;			// here head and tail both pointing to similar place
		
		return head;
	}
	
//	-----------------------------------------------------------------------

	public node DeleteGivenVal(int val) {
		node newNode = new node(val);
		if(head == null) {
			System.out.println("Empty");
		}
		
		if(head.data==val || tail.data==val) {	// edge case when there is 2 ele only
			head = tail = head.next;
		}
		
		if((head.data==val || tail.data==val) && (head.next==null || tail.next==null)){ // edge case when there is 1 ele only
			head=null;
			tail=null;
			return head;
		}
		else {
			node slow = head;
			node fast = head.next;
			while(fast.data!=val) {
				fast = fast.next;
				slow = slow.next;
			}
			slow.next = fast.next;
			fast = null;
		}
		
		return head;
	}
	
//	-----------------------------------------------------------------------

	public void Create() {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many ");
		int val = sc.nextInt();
		for(int i=0; i<val; i++) {
			int num = sc.nextInt();
			Add(num);
		}
	}
	
//	-----------------------------------------------------------------------


	void display() {
		if(head==null) {
			System.out.println("Empty!!");
		}
		node temp=head;
		if(head!=null) {
			
			do {		// here use do while loop
				System.out.print(temp.data+" -> ");
				temp = temp.next;
			}while(temp!=head);
			
		}
		System.out.println("null");
		
	}
	
	
	public static void main(String[] args) {
		
//	 		###### NOTE ###### 
//		Here no one pointing to null until list is not empty becz all ele are "circularly" connected each other
		
		Circular_LinkedList cll = new Circular_LinkedList();
		cll.Create();
		cll.display();
		cll.DeleteGivenVal(1);
		cll.display();
		
		
	}

}
