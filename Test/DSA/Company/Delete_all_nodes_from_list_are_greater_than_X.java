package Company;

class Node {
	int data;
	Node next;
}
public class Delete_all_nodes_from_list_are_greater_than_X {
	
	// Function to get a new node.
    public static Node getNode(int data)
    {
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = null;
        return new_node;
    }
 
    // Function to print linked list.
    public void printList(Node head)
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
 
    // Functions to delete nodes which have greater value
    // than x.
    public Node deleteGreaterNodes(Node head, int x)
    {
        Node temp = head;
       
        // while loop takes care if head node value greater
        // than x.
        while (temp != null && temp.data > x) {
            temp = temp.next;
            head = temp; // new head.
        }
        temp = head;
        Node prev = temp;
       
        // nodes other than head having value greater than x
        while (temp != null) {
            while (temp != null && temp.data <= x) {
                prev = temp;
                temp = temp.next;
            }
            if (temp == null) {
                return head;
            }
            // if there is a node in middle which has
            // greater value, we point the node to the next
            // node.
            prev.next = temp.next;
            // update temp for next iteration of loop.
            temp = prev.next;
        }
        return head;
    }
	
	public static void main(String[] args) {
//		Input : list: 7->3->4->8->5->1
//        x = 6
//        Output : 3->4->5->1
		
//		Time Complexity: O(n).
		
//		Approach: This is mainly a variation of the post which
//		deletes first occurrence of a given key. We need to first
//		check for all occurrences at head node which are greater 
//		than ‘x’, delete them and change the head node appropriately.
//		Then we need to check for all occurrences inside a loop 
//		and delete them one by one. 
		
		

		Delete_all_nodes_from_list_are_greater_than_X list = new Delete_all_nodes_from_list_are_greater_than_X();
 
        // Create list: 7->3->4->8->5->1.
        Node head = list.getNode(7);
        head.next = list.getNode(3);
        head.next.next = list.getNode(4);
        head.next.next.next = list.getNode(8);
        head.next.next.next.next = list.getNode(5);
        head.next.next.next.next.next = list.getNode(1);
 
        System.out.print("Original List: ");
        list.printList(head);
 
        int x = 6;
 
        head = list.deleteGreaterNodes(head, x);
        System.out.print("\nModified List: ");
        list.printList(head);
		
	}

}
