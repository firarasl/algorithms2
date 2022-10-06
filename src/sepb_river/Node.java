package sepb_river;

public class Node {
    Direction direction;
    Node next;

    public Node(Direction direction) {
        this.direction = direction;
        this.next=null;
    }

    public Direction getDirection() {
        return direction;
    }

    public Node getNext() {
        return next;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
