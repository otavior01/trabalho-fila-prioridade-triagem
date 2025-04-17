package lists;

public class PriorityQueue {

    private Node queue;
    private Node last;
    private int elementCount;

    public PriorityQueue() {
        this.queue = null;
        this.last = null;
    }

    public Node getQueue() {
        return queue;
    }

    public void setQueue(Node list) {
        this.queue = list;
    }

    public void enqueue(Node newNode) {
        if (isEmpty()) {
            this.queue = newNode;
            this.last = newNode;
        } else if (newNode.getPriority() == Priority.normal) {
            this.last.setNext(newNode);
            this.last = newNode;
        } else {
            Node temp = this.queue;
            Node previous = null;

            while (temp != null && temp.getPriority() == Priority.urgent && temp.getValue() < newNode.getValue()) {
                previous = temp;
                temp = temp.getNext();
            }

            if (previous == null) {
                newNode.setNext(this.queue);
                this.queue = newNode;
            } else {
                newNode.setNext(temp);
                previous.setNext(newNode);
            }
            if (newNode.getNext() == null) {
                this.last = newNode;
            }
        }
        this.elementCount++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Empty queue!");
        } else {
            this.queue = this.queue.getNext();
            this.elementCount--;
        }

    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Empty queue!");
        } else {
            Node temp = this.queue;
            System.out.print("Head -> " + temp.getValue() + "-" + Priority.toString(temp.getPriority()));
            while (temp.getNext() != null) {
                temp = temp.getNext();
                System.out.print(" -> " + temp.getValue() + "-" + Priority.toString(temp.getPriority()));
            }
            System.out.println(" <- Tail");
        }
    }

    public Node access(int position) {
        if (isEmpty()) {
            System.out.println("Empty queue!");
            return null;
        }
        if (position >= this.elementCount) {
            System.out.println("Invalid position!");
            return null;
        } else {
            Node temp = this.queue;
            for (int i = 0; i < position; i++) {
                    temp = temp.getNext();
            }
            return temp;
        }
    }

    public boolean isEmpty() {
        return this.queue == null;
    }
}
