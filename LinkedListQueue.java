public class LinkedListQueue {
    public class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    private Node front;
    private Node rear;

    public LinkedListQueue(){
        front = null;
        rear = null;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public int front(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return front.data;
    }

    public void enqueue(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        int data = front.data;
        front = front.next;
        if (front == null){
            rear = null;
        }
        return data;
    }

    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(23);
        queue.enqueue(61);
        queue.enqueue(83);
        queue.enqueue(87);
        queue.enqueue(56);
        System.out.println(queue.front());
        System.out.println(queue.dequeue());
        System.out.println(queue.front());
    }
}
