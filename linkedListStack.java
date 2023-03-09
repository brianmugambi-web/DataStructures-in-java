public class linkedListStack {
    public class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    private Node top;
    public  linkedListStack(){
        top = null;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            top = newNode;
        }
        else{
            newNode.next = top;
            top = newNode;
        }
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public int top(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    public static void main(String[] args) {
        linkedListStack stack = new linkedListStack();
        stack.push(34);
        stack.push(21);
        stack.push(32);
        stack.push(55);
        stack.push(86);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.top());
    }
}
