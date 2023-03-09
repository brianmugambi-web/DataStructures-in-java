

public class LinkedList {
    private Node head;
    private int size;

    private class Node {
        int value;
        Node next;


        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void add(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        if(index == 0){
            head = head.next;
        }
        else{
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public int get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.add(34);
        link.add(65);
        link.add(12);
        link.add(39);
        link.add(89);
        link.remove(1);
        System.out.println(link.get(2));
        System.out.println(link.getSize());
    }
}
