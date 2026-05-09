public class InsertMohsin {
    static class Node{
        int data;
        Node next;
         Node(int data){
            this.data= data;
             System.out.println(data);
        }
        Node(int data, Node next){
             this.data= data;
             this.next=next;
        }
        public Node insert(int x, Node start){
             if(start==null || start.data>x){
                 start= new Node(x, start);

             }

             Node p = start;
             while(p.next!=null){
                 if(p.next.data>x)
                     break;
                 p=p.next;
             }
             return start;
        }
    }

    public static void main(String[] args) {
        //Node myNode=new Node(5);
      //  Node myNode= myNode.insert(5, null);




    }
}
