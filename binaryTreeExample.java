import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
public class binaryTreeExample {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            this.data = d;
            left = null;
            right = null;
        }
    }
    Node root = null;

    Node newNode(int data)
    {
        Node newNode = new Node(data);
        return newNode;
    }

    void add(ArrayList<Integer> arr){
        Queue<Node> queue = new LinkedList<Node>();
        int index = 0;
        while(index < arr.size()-1) {
            if(this.root == null){
                this.root = newNode(arr.get(0));
                queue.add(this.root);


            }else{
                Node current = queue.poll();

                if(index + 1  < arr.size() ) {
                    current.left = newNode(arr.get(++index));
//                    System.out.print(current.left.data);
                    queue.add(current.left);

                }
                if(index + 1  < arr.size() ) {
                    current.right = newNode(arr.get(++index));
//                    System.out.print(current.right.data);
                    queue.add(current.right);

                }
            }
        }
    }
    void Inorder(Node current)
    {
        if(current==null)
            return;
        Inorder(current.left);
        System.out.print(current.data+" ");
        Inorder(current.right);
    }

    void Preorder(Node current)
    {
        if(current==null)
            return;

        System.out.print(current.data+" ");
        Preorder(current.left);
        Preorder(current.right);
    }

    void Postorder(Node current)
    {
        if(current==null)
            return;

        Postorder(current.left);
        Postorder(current.right);
        System.out.print(current.data+" ");

    }

    void BFS(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
           Node current = queue.poll();
           System.out.print(current.data +" ");
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }

    }


    public static void main(String arg[]){
        binaryTreeExample obj = new binaryTreeExample();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.addAll(Arrays.asList(1,2,3,4,5,6,7));
//        System.out.println(arr);
        obj.add(arr);
        System.out.println("BFS Traversal");
        obj.BFS(obj.root);
        System.out.println("Inorder Traversal");
        obj.Inorder(obj.root);
        System.out.println("Preorder Traversal");
        obj.Preorder(obj.root);
        System.out.println("Postorder Traversal");
        obj.Postorder(obj.root);

    }
}
