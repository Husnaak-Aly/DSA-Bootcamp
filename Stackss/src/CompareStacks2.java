//// Define the Node class
//class Node {
//    int data;
//    Node next;
//
//    // Constructor
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//// Define the Stack class using linked list (Node-based)
//class Stack {
//    Node top;
//
//    // Constructor
//    public Stack() {
//        top = null;
//    }
//
//    // Push a new element onto the stack
//    public void push(int data) {
//        Node newNode = new Node(data);
//        newNode.next = top;  // Point the new node to the current top
//        top = newNode;       // Set the new node as the top
//    }
//
//    // Pop an element from the stack
//    public int pop() {
//        if (top == null) {
//            throw new RuntimeException("Stack is empty");
//        }
//        int data = top.data;
//        top = top.next;  // Move the top pointer to the next node
//        return data;
//    }
//
//    // Check if the stack is empty
//    public boolean isEmpty() {
//        return top == null;
//    }
//
//    // Peek the top element without removing it
//    public int peek() {
//        if (top == null) {
//            throw new RuntimeException("Stack is empty");
//        }
//        return top.data;
//    }
//}
//
//// Method to compare two stacks
//public class CompareStacks2 {
//    public static boolean areEqual(ArrayStack stack1, ArrayStack stack2) {
//        Node temp1 = stack1.top;
//        Node temp2 = stack2.top;
//
//        // Traverse both stacks and compare nodes
//        while (temp1 != null && temp2 != null) {
//            if (temp1.data != temp2.data) {
//                return false;  // If any data doesn't match
//            }
//            temp1 = temp1.next;
//            temp2 = temp2.next;
//        }
//
//        // Check if both stacks are exhausted (same size)
//        return temp1 == null && temp2 == null;
//    }
//
//    public static void main(String[] args) {
//        ArrayStack1 stack1 = new ArrayStack1();
//        ArrayStack1 stack2 = new ArrayStack1();
//
//        // Add elements to stack1
//        stack1.push(10);
//        stack1.push(20);
//        stack1.push(30);
//
//        // Add the same elements to stack2
//        stack2.push(10);
//        stack2.push(20);
//        stack2.push(30);
//
//        // Compare the stacks
//        boolean result = areEqual(stack1, stack2);
//
//        System.out.println("Are the two stacks equal? " + result);  // Should print true
//
//        // Modify stack2 and compare again
//        stack2.push(40);
//        result = areEqual(stack1, stack2);
//
//        System.out.println("Are the two stacks equal after modification? " + result);  // Should print false
//    }
//}
