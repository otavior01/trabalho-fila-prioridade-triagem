package lists;

public class Node {
    private int value;
    private Node next;
    private int priority;
    
    public Node() {
        this.next = null;
        this.priority = Priority.normal;
    }
    
    public Node(int newValue, int newPriority) {
        this.value = newValue;
        this.next = null;
        this.priority = newPriority;
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

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Node{" + "value=" + this.value + "}";
    }

}