package LinkedList;

import java.util.Scanner;


public class Doubly_linkedList {
	
	class node{
		int data;
		node next;
		node pre;
		
		public node(int d) {
			this.data = d;
			this.next = null;
			this.pre = null;
		}
	}
	
	public node data = null;
	public node head = null;
		
//	-----------------------------------------------------------------------

	public node addLast(int num) {
		
		node newNode = new node(num);
		if(head==null) {
		   newNode.next = null;  
           newNode.pre = null;  
           head = newNode;  
		}
		node temp = head;  
        while(temp.next!=null)  	// here we will reach upto "tail" atleast
        {  
            temp = temp.next;  
        }  
        temp.next = newNode;  
        newNode.pre=temp;  
        newNode.next = null;  
		return head;	
	}
	
//	-----------------------------------------------------------------------
	
	public node addFirst(int num) {
		node newNode = new node(num);
		newNode.next = head;	// first this 2 lins after that remaining thing
		newNode.pre = null;
		
		if(head==null) {
			head = newNode;
		}
		
		head.pre = newNode;
		head = newNode;
		
		return head;
	}
	
//	-----------------------------------------------------------------------
	
	public node InsertAfter(int val, int afterkey) {
		
		node newNode = new node(val);
		if(head==null) {
		   newNode.next = null;  
           newNode.pre = null;  
           head = newNode;  
		}
		node temp = head;  
        while(temp.data!=afterkey)  	// here we will reach upto "tail" atleast
        {  
            temp = temp.next;  
        } 
        newNode.next = temp.next;
        temp.next = newNode;
        newNode.pre = temp;
        temp.next.pre = newNode;
		
		return head;
	}
	
//	-----------------------------------------------------------------------
	
	public void create() {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many ");
		int val = sc.nextInt();
		for(int i=0; i<val; i++) {
			int num = sc.nextInt();
			addLast(num);
		}
	}
	
//	-----------------------------------------------------------------------

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
//	-----------------------------------------------------------------------

	void JustPrintInRevrese() {
		if(head==null) {
			System.out.println("Empty!!");
		}
		
// to print the D linked list in reverse order we need to 
//	go upto last ele "i.e" "tail" of the linked list
//	once we reach upto "tail" from that position we need to
//	again traverse the list upto start i.e upto "last"
//	and we know the start.pre = is always null so once our 
//	last pointer reach to "null" we break the "loop"
		
		
//				#### But this will not work ####
		
		node temp=head;
		node last = null;
		while(temp!=null) {
			last = temp;		// here "last" will reach upto end with temp
			temp = temp.next;
		}
		
		System.out.println("Reverse Print");
		while(last!=null) {			// here again we start it from "end" toward "start"
			System.out.print(last.data+" -> ");
			last = last.pre;
		}
		System.out.println("first");
		
	}
	
//	-----------------------------------------------------------------------

	public static void main(String[] args) {
		Doubly_linkedList dll = new Doubly_linkedList();
		
//		Create
//		AddFirst
//		AddLast
//		AddAfter
		
		
//		Put 5 , 2, 9
		
		dll.create();
		dll.display();
		dll.InsertAfter(3, 2);		// here we insert 3 after 2
		dll.display();
		
		
		
	}

}
