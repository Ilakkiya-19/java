public class queue {

    Node rear = null; // head of list
    Node front = null;


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

    public void enqueue(int d ){
        Node n = new Node(d);
        if(this.rear == null){
            this.rear = n;
            this.front = n;
        }else{
            this.rear.next  = n;
            this.rear = n;
        }
    }

    void dequeue(){
        if(this.front!=null){
            this.front = this.front.next;
        }
    }

    void display(){
        Node current = this.front;
        System.out.println();
        for(int i = 0; current.next!=null;i++){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print(current.data + " ");
    }


    public static void main(String[] args)
    {

        queue obj = new queue();
        obj.enqueue(5);
        obj.enqueue(10);
        obj.enqueue(15);
        obj.display();
        obj.dequeue();
        obj.display();

    }
}