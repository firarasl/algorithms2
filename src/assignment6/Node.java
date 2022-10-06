package assignment6;

public class Node {
     Vote data;
     Node next;


    public Node(Vote data) {
        this.data = data;
        this.next=null;
    }

    public Vote getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}
