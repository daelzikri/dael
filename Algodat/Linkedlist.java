public class Linkedlist {
    Node head = null;
    Node tail = null;

    public void add(Node n){
        if(head == null){
            head = n;
            tail = n;
        }else{
            n.prev = tail;
            tail.next = n;
            tail = n;
        }
    }

    public void bacadaridepan(){
        Node n = head;
        if(n == null){
            System.out.println("Kosong");
        }else{
            for(; n != null; n = n.next){
                System.out.println(n.data);
            }
        }
    }

    public void bacadaribelakang(){
        Node n = tail;
        if(n == null){
            System.out.println("Kosong");
        }else{
            for(; n != null; n = n.prev){
                System.out.println(n.data);
            }
        }
    }
}