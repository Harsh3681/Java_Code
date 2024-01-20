package LinkedList;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class tp {
	
//	 ########  Middle Value ############### of Linked List
//	 ########  Sorting ############### of Linked List

	
	class node{
		
		int data;
		node next;
		
		public node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	
	public node head = null;
	public node data = null;
	
	public void addfirst(int d) {
		
		node newNode = new node(d);
		
		if(head==null) {
			head = newNode;
		}
		
		else {
			head = newNode;
			newNode.next = head;
		}
	}
	
	public void addBetween(int d, int key) {
		
		node newNode = new node(d);
		newNode.next = null;
		node temp = head;
		
		while(temp.data!=key) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		
	}
	
	
	public void addNodeLast(int d) {
		node newNode = new node(d);
		
		if(head==null) {
			head = newNode;
			head.next = null;
		}
		else {
			node te = head;
			while(te.next!=null) {
				te = te.next;
			}
			te.next = newNode;
		}

	}
	
	
	public void display() {
		node temp = head;
		
		if(head==null) {
			System.out.println("Empty");
			return;
		}
		
		System.out.println("Singly");
		System.out.print("[ ");
		while(temp!=null) {
			System.out.print(temp.data+ " ");
			temp = temp.next;
			
		}
		
		System.out.println("]");
		System.out.println();
		
	}
	
	public void create() {
		int c, i,n;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("How Many element - ");
		c = sc.nextInt();
		for(i=0; i<c; i++) {
			System.out.print("Enter - ");
			n = sc.nextInt();
			addNodeLast(n);
		}
		return ;
	}
	
	public void search(int key) {
		boolean flag = false;
		if(head==null) {
			System.out.println("Empty!!!");
			return;
		}
		node temp = head;
		while(temp!=null) {
			if(temp.data==key) {
				System.out.println("Present");
				flag = true;
			}
			temp = temp.next;
		}

		if(flag==false) {
			System.out.println("Not found");
		}
	}
	
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
	
	public node reverseLL() {
		if(head.next==null || head==null) {
			return null;
		}
		node cur =head;
		node prev = null;
		node next;
		while(cur!=null) {
			next = cur.next;
			cur.next = prev ;
			prev = cur;
			cur = next;
		}
		
		return prev;
	}
	

	public static void main(String[] args) {
		
		tp ll = new tp();
		
		// below element without inserting manually
		
		ll.create();	
		ll.display();
		ll.head = ll.reverseLL();
		ll.display();
		ll.deleteNthPos(4);
		ll.display();
		
		
		
		

	
		

		
	}

}
