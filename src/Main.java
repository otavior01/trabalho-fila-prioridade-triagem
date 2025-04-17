import lists.Node;
import lists.PriorityQueue;

public class Main {

    public static void main(String[] args) {
    PriorityQueue queue = new PriorityQueue();
    
    Node node = new Node(10);
    queue.queue(node);
    queue.show();
    node = new Node(20);
    queue.queue(node);
    queue.show();
    node = new Node(30);
    queue.queue(node);
    queue.show();
    
    node = new Node(5);
    queue.queue(node);
    node = new Node(4);
    queue.queue(node);
    node = new Node(3);
    queue.queue(node);
    queue.show();
    }
}
