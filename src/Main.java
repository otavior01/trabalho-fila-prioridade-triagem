import lists.Node;
import lists.Priority;
import lists.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        PriorityQueue queue;
        Node sheet;

        //1-N, 2-N, 1-U, 2-U, 3-N e 4-N
        queue = new PriorityQueue();

        sheet = new Node(1, Priority.normal);
        queue.enqueue(sheet);

        sheet = new Node(2, Priority.normal);
        queue.enqueue(sheet);

        sheet = new Node(1, Priority.urgent);
        queue.enqueue(sheet);

        sheet = new Node(2, Priority.urgent);
        queue.enqueue(sheet);

        sheet = new Node(3, Priority.normal);
        queue.enqueue(sheet);

        sheet = new Node(4, Priority.normal);
        queue.enqueue(sheet);

        queue.show();

        System.out.println();

        //1-U, 2-U, 3-U e 1-N, 2-N
        queue = new PriorityQueue();

        sheet = new Node(1, Priority.urgent);
        queue.enqueue(sheet);

        sheet = new Node(2, Priority.urgent);
        queue.enqueue(sheet);

        sheet = new Node(3, Priority.urgent);
        queue.enqueue(sheet);

        sheet = new Node(1, Priority.normal);
        queue.enqueue(sheet);

        sheet = new Node(2, Priority.normal);
        queue.enqueue(sheet);

        queue.show();

        System.out.println();

        //1-N, 2-N, 3-N, 4-N e 1-U
        queue = new PriorityQueue();

        sheet = new Node(1, Priority.normal);
        queue.enqueue(sheet);

        sheet = new Node(2, Priority.normal);
        queue.enqueue(sheet);

        sheet = new Node(3, Priority.normal);
        queue.enqueue(sheet);

        sheet = new Node(4, Priority.normal);
        queue.enqueue(sheet);

        sheet = new Node(1, Priority.urgent);
        queue.enqueue(sheet);


        queue.show();

        System.out.println();

        //10-U, 2-U, 1-U, 4-U e 5-U
        queue = new PriorityQueue();

        sheet = new Node(10, Priority.urgent);
        queue.enqueue(sheet);

        sheet = new Node(2, Priority.urgent);
        queue.enqueue(sheet);

        sheet = new Node(1, Priority.urgent);
        queue.enqueue(sheet);

        sheet = new Node(4, Priority.urgent);
        queue.enqueue(sheet);

        sheet = new Node(5, Priority.urgent);
        queue.enqueue(sheet);

        queue.show();

        System.out.println();

        //1-N, 4-U, 2-U, 2-N, 1-U e 3-N
        queue = new PriorityQueue();

        sheet = new Node(1, Priority.normal);
        queue.enqueue(sheet);

        sheet = new Node(4, Priority.urgent);
        queue.enqueue(sheet);

        sheet = new Node(2, Priority.urgent);
        queue.enqueue(sheet);

        sheet = new Node(2, Priority.normal);
        queue.enqueue(sheet);

        sheet = new Node(1, Priority.urgent);
        queue.enqueue(sheet);

        sheet = new Node(3, Priority.normal);
        queue.enqueue(sheet);

        queue.show();

        System.out.println();

    }
}
