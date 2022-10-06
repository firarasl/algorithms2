package assignment6;

public class VoteList {
     Node head;

    public VoteList() {
        this.head = null;
    }

    public Node getHead() {
        return head;
    }

    public boolean add( Vote data){


        Node newNode = new Node(data);
        if (head == null){
            // adding to the front if its an empty list
            head = newNode;
            head.next=null;
            return true;
        }

        else {
            // adding to the end of the list

            for (Node node = head; node != null; node = node.next) {
                if (node.next == null) {
                    node.next = newNode;
                    return true;
                }
            }
        }
        return false;

    }

    public int importVotes(Vote[] dataToImport){
        int count = 0;
        for (int i = 0; i < dataToImport.length && dataToImport[i]!=null; i++) {
            count++;
            this.add(dataToImport[i]);
        }
        return count;
    }

    public boolean isValid(){
        int total =0;
        int invalid = 0;
        for (Node node = head; node != null; node = node.next) {
            if (node.data.equals(Vote.INVALID)) {
                invalid++;
            }
            total++;
        }
        if (100*invalid/total > 40){
            return false;
        }
        else{
            return true;
        }
    }
    public Vote countVotes(){
        int invalid = 0;
        int yes = 0;
        int no = 0;
        for (Node node = head; node != null; node = node.next) {
            if (node.data.equals(Vote.INVALID)) {
                invalid++;
            }
            else if(node.data.equals(Vote.YES)){
                yes++;
            }        else if(node.data.equals(Vote.NO)){
                no++;
            }
        }

        if (yes > no){
            return Vote.YES;
        }
        else if(no > yes){
            return Vote.NO;
        }
        else if (yes == no || !this.isValid()){
            return Vote.INVALID;
        }
        else {
            return Vote.INVALID;
        }
    }

    public void printList(){
        System.out.println("Start of printing: ");
        for (Node node = head; node != null; node = node.next) {
            System.out.print(node.data + " ");
        }
        System.out.println();
        System.out.println("End of printing.");
    }



    public static void main(String[] args) {
        VoteList christmasPartyVoting = new VoteList();
        Vote[] friendVotes = {Vote.YES, Vote.YES, Vote.NO, Vote.INVALID, Vote.INVALID, Vote.NO, Vote.YES, Vote.NO};
        Vote[] familyVotes = {Vote.INVALID, Vote.YES, Vote.YES, Vote.NO};
        System.out.println(christmasPartyVoting.importVotes(friendVotes));
        System.out.println(christmasPartyVoting.isValid());
        System.out.println(christmasPartyVoting.countVotes());

        System.out.println(christmasPartyVoting.importVotes(familyVotes));
        System.out.println(christmasPartyVoting.isValid());
        System.out.println(christmasPartyVoting.countVotes());


        System.out.println("------------------------------------------");
        christmasPartyVoting.printList();

    }
}
