public class stack {

    Node top = null; // head of list


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

    public void push(int d ){
        Node n = new Node(d);
        if(this.top == null){
            this.top = n;
        }else{
            n.next = this.top;
            this.top = n;
        }
    }

    void pop(){
        if(this.top!=null){
            this.top = this.top.next;
        }
    }

    void display(){
        Node current = this.top;
        System.out.println();
        for(int i = 0; current.next!=null;i++){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print(current.data + " ");
    }


    public static void main(String[] args)
    {

        stack obj = new stack();
        obj.push(5);
        obj.push(10);
        obj.push(15);
        obj.display();
        obj.pop();
        obj.display();

    }
}