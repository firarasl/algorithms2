package sepb_river;

public class DirectionList {
    Node head;

    public DirectionList() {
        this.head=null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }


    public Node add(Direction givenDirection){
        Node newNode = new Node(givenDirection);
        if (head == null){
            // adding to the front if its an empty list
            head = newNode;
            head.next=null;
        }

        else {
            // adding to the end of the list

            for (Node node = head; node != null; node = node.next) {
                if (node.next == null) {
                    node.next = newNode;
                }
            }
        }
        return newNode;
    }


    public Node deleteAt(int index){
        Node deletedNode = null;
        int count = 1;

        // first finding the node, (if i delete it here, then i wont be able to connect previous node with the nextnext node because its not double linked list
        for (Node node = head; node != null; node=node.next) {
            if (count==index){
               deletedNode= node;
               break;
            }
            count++;
        }
count = 1;
        //then deleting the node
        for (Node node = head; node != null; node=node.next) {
            if (count+1==index){
                if (node.next.next !=null)
                node.next= node.next.next;
                else
                    node.next = null;
            }
            count++;
        }
        deletedNode.next=null;

        return deletedNode;
    }
    public int deleteAfter(int index){
        int deletedCount= 0;
        int count = 1;


        //first counting elements after this index
        for (Node node = head; node != null; node=node.next) {
            if (count>index){
deletedCount++;
            }
            count++;
        }

        for (Node node = head; node != null; node=node.next) {
            if (count>index){
                // by disconnecting the connection all the sequence of nodes will be lost, so i can just equate one next to null and its enough.
                node.next=null;
                break;
            }
            count++;
        }
        return deletedCount;
    }
    public boolean contains(Direction direction){


        for (Node node = head; node != null; node=node.next) {
            if (node.direction.equals(direction)){
                return true;
            }
        }
        return false;
    }


    public static boolean run(Tile[] maze){
        // did not understand

        return false;
    }
}
