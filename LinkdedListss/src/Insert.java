import java.util.Scanner;

// Java Program to insert the node at the beginning of
// Linked Lis
//
class Node1 {
    int data;
    Node1 next;

    Node1(int new_data)
    {
        data = new_data;
        next = null;
    }
}

public class Insert {
    // Function to insert a new node at the beginning of the
    // list
    public static Node1 insertAtFront(Node1 head,
                                      int new_data)
    {
        // Create a new node with the given data
        Node1 new_node = new Node1(new_data);

        // Make the next of the new node point to the
        // current head
        new_node.next = head;

        // Return the new node as the new head of the list
        return new_node;
    }

    public static void printList(Node1 head)
    {
        Node1 curr = head;
        while (curr != null) {
            System.out.print(" " + curr.data);
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        // Create the linked list 2->3->4->5
        Node1 head = new Node1(2);
        head.next = new Node1(3);
        head.next.next = new Node1(4);
        head.next.next.next = new Node1(5);

        // Print the original list
        System.out.println("Original Linked List:");
        printList(head);

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number you want to insert:");
        int data = sc.nextInt();
        // Insert a new node at the front of the list
        System.out.println(
                "After inserting Nodes at the front:");

        head = insertAtFront(head, data);

        // Print the updated list
        printList(head);
    }
}
