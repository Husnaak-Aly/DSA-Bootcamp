//interface Queue {
//    void add(Object obj);
//    Object first();
//    Object remove();
//    int size();
//}
//
//public class LinkedQueue implements ArrayQueue {
//    private static class Node {
//        Object object;
//        Node prev = this, next = this;
//
//        Node(Object object) {
//            this.object = object;
//        }
//
//        Node(Object object, Node prev, Node next) {
//            this.object = object;
//            this.prev = prev;
//            this.next = next;
//        }
//    }
//
//    private int size;
//    private Node head = new Node(null);
//
//    public Object first() {
//        if (size == 0) throw new IllegalStateException("Queue is empty");
//        return head.next.object;
//    }
//
//    @Override
//    public Object remove() {
//        if (size == 0) throw new IllegalStateException("Queue is empty");
//        Object temp = head.next.object;
//        head.next = head.next.next;
//        head.next.prev = head;
//        --size;
//        return temp;
//    }
//
//    @Override
//    public void add(Object obj) {
//        Node newNode = new Node(obj, head.prev, head);
//        head.prev.next = newNode;
//        head.prev = newNode;
//        ++size;
//    }
//
//    @Override
//    public int size() {
//        return size;
//    }
//
//    public int sum() {
//        int total = 0;
//        Node current = head.next;
//        while (current != head) {
//            total += (Integer) current.object;
//            current = current.next;
//        }
//        return total;
//    }
//
//    public static void main(String[] args) {
//        LinkedQueue pocketMoney = new LinkedQueue();
//
//
//        for (int i = 1; i <= 30; i++) {
//            pocketMoney.add(i * 500);
//        }
//
//
//        System.out.println("Total pocket money spent in 30 days: " + pocketMoney.sum());
//
//
////        pocketMoney.remove();
////        System.out.println("Total pocket money spent after removing the first entry: " + pocketMoney.sum());
//    }
//}
