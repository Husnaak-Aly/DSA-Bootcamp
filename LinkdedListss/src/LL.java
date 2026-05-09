public class LL {
    private Node1 head;
    private Node1 tail;
    private int size;

    public LL() {
        this.size = 0;
    }
    public void insertfirst(int data){
        Node1 node = new Node1(data);
        node.next=head;
        head=node;
        if (tail==null) {
        tail=head;
        }
        size+=1;
        }

    public static void main(String[] args) {

    }

    }


     class Node {
        private int data;
        public Node1 next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node1 next)

        {
            this.data = data;
            this.next = next;
        }
    }


