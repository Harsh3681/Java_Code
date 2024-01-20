package LinkedList;

import java.util.Scanner;

public class tp2 {
	
	class node{
		int data ; node next;
		node(){
			this.data=data;
			this.next = next;
		}
		node(int data){
			this.data=data;
			this.next = next;
		}
	}
	node head=null, next = null;
	
	public node addLast(int val) {
		
		node temp = head;
		node newNode = new node(val);
		if(head==null) {
			head = newNode; return head;
		}else {
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newNode;
			temp = newNode;
		}
		return head;
	}
	
	public void create() {
		int val,i=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("How many ");
		int no = sc.nextInt();
		while(i++<no) {
			val = sc.nextInt();
			addLast(val);
		}
	}
	
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
	
	node newhead;
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

	


	public void show() {
		node temp = head;
		if(head==null) {
			System.out.println("EMpty");
		}else {
			while(temp!=null) {
				System.out.print(temp.data+" -> ");
				temp=temp.next; 
			}
			System.out.println("null");
		}
	}
	
	public static void main(String[] args) {
		tp2 ll = new tp2();
		ll.create();
		ll.show();
//		ll.bubbleSort();
//		ll.show();
//		ll.SelectionSort();
//		ll.show();
		ll.InsertionSort();
		ll.show();
		
	}

}
