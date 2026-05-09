class ArrayStack1 {
    private int top;
    private int[] a;
    private int capacity;

    ArrayStack1() {
        capacity = 2;
        a = new int[capacity];
        top = -1;
    }

    boolean isEmpty() {
        return (top < 0);
    }

    private void resize() {
        int[] newArray = new int[capacity * 2];
        System.arraycopy(a, 0, newArray, 0, capacity);
        capacity *= 2;
        a = newArray;
    }

    void push(int x) {
        if (top >= (capacity - 1)) {
            resize();
        }
        a[++top] = x;
        System.out.println(x + " pushed into stack");
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return a[top--];
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return a[top];
        }
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }

    int size() {
        return top + 1;
    }

    int getCapacity() {
        return capacity;
    }
}

class Main {
    public static void main(String[] args) {
        ArrayStack1 s = new ArrayStack1();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);  // This will trigger a resize
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is: " + s.peek());
        System.out.print("Elements present in stack:");
        s.print();
        System.out.println("Current size of stack: " + s.size());
        System.out.println("Current capacity of stack: " + s.getCapacity());
    }
}
