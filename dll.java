public class dll {

    Node head = null; // head of list
    Node tail = null;

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;
        Node prv;

        // Constructor
        Node(int d)
        {
            this.data = d;
            this.next = null;
            this.prv = null;
        }
    }

    public void insert(int d){
        Node  n = new Node(d);


        if(this.head == null){
            this.head = n;
            this.tail = n;

        }else{
            this.tail.next = n;
            n.prv = tail;
            this.tail =n;
            System.out.println(this.tail);
        }
    }

    public void insertFirst(int d){
        Node  n = new Node(d);
        this.head.prv = n;
        n.next = head;
        this.head = n;
    }

    public void deleteById(int index){
        Node current = this.head;
        for(int i = 0; i < index; i++){
            current  = current.next;
        }
//        Node tmp = current.next;
        current.prv.next = current.next;
        current.next.prv = current.prv;
    }

    public void display(){
        Node current = this.head;
        for(int i = 0; current.next!=null;i++){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print(current.data + " ");
    }

    public void reverse(){
        Node current = this.tail;
        System.out.println();
        for(int i = 0; current.prv!=null;i++){
            System.out.print(current.data + " ");
            current = current.prv;
        }
        System.out.print(current.data + " ");
    }


    public static void main(String[] args)
    {

        dll obj = new dll();
        obj.insert(5);
        obj.insert(10);
        obj.insert(15);
        obj.insertFirst(1);
        obj.insertFirst(2);
        obj.deleteById(2);
        obj.display();
        obj.reverse();
    }
}