public class stackArray {
    int top;
    int arr[] = new int[100];

    stackArray() {
       this.top = -1;
    }

    void push(int d) {

        arr[this.top +1] = d;
        this.top = this.top + 1;
    }

    void pop(){
        this.top = this.top - 1;
    }

    void display(){
        for (int i = 0; i <= this.top;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {

        stackArray obj = new stackArray();
        obj.push(5);
        obj.push(10);
        obj.push(15);
        obj.display();
        obj.pop();
        obj.display();

    }
}



