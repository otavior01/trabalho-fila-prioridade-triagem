package lists;

public class Node {
    private int value;
    private Node next;
    
    public Node() {
        this.value = 0;
        this.next = null;
    }
    
    public Node(int newValue) {
        this.value = newValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" + "value=" + this.value + "}";
    }
}