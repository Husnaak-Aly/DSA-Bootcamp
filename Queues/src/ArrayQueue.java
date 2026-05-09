class ArrayQueue {
    int front, rear, capacity;
    int[] queue;

    ArrayQueue(int c) {
        front = 0;
        rear = -1;
        capacity = c;
        queue = new int[capacity];
    }

    public void push(int data) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full");
            return;
        }

        queue[++rear] = data;
    }

    public void pop() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = 0; i < rear; i++) {
            queue[i] = queue[i + 1];
        }

        rear--;
    }

    void print() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " <-- ");
        }
        System.out.println();
    }

    void front() {
        if (rear == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Front Element is: " + queue[front]);
    }

    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue(4);

        q.print();

        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);

        q.print();

        q.push(60);

        q.print();

        q.pop();
        q.pop();

        System.out.println("After two element deletions");

        q.print();

        System.out.println("After one insertion");
        q.push(60);

        q.print();

        q.front();
    }
}
