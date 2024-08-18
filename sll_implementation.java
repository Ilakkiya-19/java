public class sll_implementation {

    Node head = null; // head of list
    Node tail = null;

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            this.data = d;
            this.next = null;
        }
    }

    public void insert(int d){
        Node  n = new Node(d);


        if(this.head == null){
            this.head = n;
            this.tail = n;

        }else{
            this.tail.next = n;
            this.tail =n;
            System.out.println(this.tail);
        }
    }

    public void insertFirst(int d){
        Node  n = new Node(d);
        Node tmp = this.head;
        this.head = n;
        this.head.next = tmp;


    }

    public void deleteById(int index){
         Node current = this.head;
         for(int i = 0; i < index -1; i++){
             current  = current.next;
         }
         Node tmp = current.next;
         current.next = tmp.next;
    }

    public void display(){
       Node current = this.head;
       for(int i = 0; current.next!=null;i++){
           System.out.print(current.data + " ");
           current = current.next;
       }
        System.out.print(current.data + " ");
    }


    public static void main(String[] args)
    {

        sll_implementation obj = new sll_implementation();
        obj.insert(5);
        obj.insert(10);
        obj.insert(15);
        obj.insertFirst(1);
        obj.insertFirst(2);
        obj.deleteById(2);
        obj.display();
    }
}