package lists;


public class PriorityQueue {

    private Node list;
    private Node last;
    private int elementCount;

    public PriorityQueue() {
        this.list = null;
        this.last = null;
        this.elementCount = 0;
    }

    public Node getList() {
        return list;
    }

    public void setList(Node list) {
        this.list = list;
    }

//    public void insertFirst(Node newNode) {
//        if (isEmpty()) {
//            this.list = newNode;
//        } else {
//            newNode.setNext(this.list);
//            this.list = newNode;
//        }
//        this.elementCount++;
//    }

    public void queue(Node newNode) {
        if (isEmpty()) {
            this.list = newNode;
            this.last = newNode;
        } else if (this.elementCount == 1){
            this.list.setNext(newNode);
            this.last = newNode;
        } else {
            this.last.setNext(newNode);
            this.last = newNode;
        }
        this.elementCount++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Empty list!");
        } else {
            this.list = this.list.getNext();
            this.elementCount--;
        }

    }

//    public void removeLast() {
//        if (isEmpty()) {
//            System.out.println("Empty list!");
//        } else {
//            if (this.elementCount == 1) {
//                this.list = null;
//            } else {
//                Node temp = this.list;
//                Node previous = this.list;
//                while (temp.getNext() != null) {
//                    previous = temp;
//                    temp = temp.getNext();
//                }
//                previous.setNext(null);
//            }
//            this.elementCount--;
//        }
//    }

    public void show() {
        if (isEmpty()) {
            System.out.println("List -> null");
        } else {
            Node temp = this.list;
            System.out.print("List -> " + temp.getValue());
            while (temp.getNext() != null) {
                temp = temp.getNext();
                System.out.print(" -> " + temp.getValue());
            }
            System.out.println(" -> null");
            System.out.println(" Last -> " + this.last.getValue());
        }
    }

    public boolean isEmpty() {
        return this.list == null;
    }

    public Node access(int position) {
        if (isEmpty()) {
            System.out.println("Empty list!");
            return null;
        }
        if (position > this.elementCount) {
            System.out.println("Invalid postion!");
            return null;
        } else {
            Node temp = this.list;
            for (int i = 0; i < this.elementCount; i++) {
                if (i == position) {
                    break;
                } else {
                    temp = temp.getNext();
                }
            }
            return temp;
        }
    }
}
