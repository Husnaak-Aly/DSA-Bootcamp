// Node class representing each element in the stack
class Nodee {
    String data;
    Nodee next;

    // Constructor
    public Nodee(String data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class implemented using linked list (Node-based)
class Stackk {
    private Nodee top;

    // Constructor
    public Stackk() {
        top = null;
    }

    // Push a new element onto the stack
    public void push(String data) {
        Nodee newNode = new Nodee(data);
        newNode.next = top; // Point new node to the previous top
        top = newNode;      // Set the new node as the top
    }

    // Pop the top element from the stack
    public String pop() {
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }
        String data = top.data;
        top = top.next; // Move the top to the next node
        return data;
    }

    // Peek at the top element without removing it
    public String peek() {
        if (top == null) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Return the size of the stack
    public int size() {
        int count = 0;
        Nodee temp = top;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class CompareStacks {
    // Function to check if the two given stacks are the same
    static boolean isSameStack(Stackk stack1, Stackk stack2) {
        // Create a flag variable
        boolean flag = true;

        // Check if size of both stacks is the same
        if (stack1.size() != stack2.size()) {
            flag = false;
            return flag;
        }

        // Compare the stacks element by element
        while (!stack1.isEmpty()) {
            // If the top elements of both stacks are the same
            if (stack1.peek().equals(stack2.peek())) {
                // Pop top of both stacks
                stack1.pop();
                stack2.pop();
            } else {
                // Otherwise, set flag to false
                flag = false;
                break;
            }
        }

        // Return the result
        return flag;
    }

    // Driver Code
    public static void main(String[] arr) {
        // Creating stacks
        Stackk stack1 = new Stackk();
        Stackk stack2 = new Stackk();

        // Inserting elements to stack1
        stack1.push("Geeks");
        stack1.push("4");
        stack1.push("Geeks");
        stack1.push("Welcomes");
        stack1.push("You");

        // Inserting elements to stack2
        stack2.push("Geeks");
        stack2.push("4");
        stack2.push("Geeks");
        stack2.push("Welcomes");
        stack2.push("You");

        // Comparing the stacks
        if (isSameStack(stack1, stack2)) {
            System.out.println("Stacks are Same");
        } else {
            System.out.println("Stacks are not Same");
        }
    }
}
