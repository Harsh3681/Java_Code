package Company;

import java.util.HashSet;

public class Detect_loop_and_cyclic_loop_in_liked_list {
	

    static Node head; // head of list
 
    /* Linked list Node*/
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    /* Inserts a new Node at front of the list. */
    static public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
 
        /* 3. Make next of new Node as head */
        new_node.next = head;
 
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
 
    // Returns true if there is a loop in linked
    // list else returns false.
    static boolean detectLoop(Node h)
    {
        HashSet<Node> s = new HashSet<Node>();
        while (h != null) {
            // If we have already has this node
            // in hashmap it means there is a cycle
            // (Because you we encountering the
            // node second time).
            if (s.contains(h))
                return true;
 
            // If we are seeing the node for
            // the first time, insert it in hash
            s.add(h);
 
            h = h.next;
        }
 
        return false;
    }
	
	

	public static void main(String[] args) {
		
//		link
//		https://www.geeksforgeeks.org/detect-loop-in-a-linked-list/
		
		
//		Follow the steps below to solve the problem:
//		Traverse the list individually and keep putting the
//		node addresses in a ---> "Hash Table". 
//		At any point, if NULL is reached then return false 
//		If the next of the current nodes points to any of the 
//		previously stored nodes in Hash then ---> return true

		

		Detect_loop_and_cyclic_loop_in_liked_list llist = new Detect_loop_and_cyclic_loop_in_liked_list();
 
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);
 
        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;
 
        if (detectLoop(head))
            System.out.println("Loop Found");
        else
            System.out.println("No Loop");
		
		
	}

}
