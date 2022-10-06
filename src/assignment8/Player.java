package assignment8;

import java.util.*;

public class Player {

    private Card hand[];


    public Card[] getHand() {
        return hand;
    }

    public void setHand(Card[] hand) {
        this.hand = hand;
    }

    public void sortHand(){
        TreeSet<Suit> suitHashSet = new TreeSet<>();
        for (int i = 0; i < this.hand.length; i++) {
            suitHashSet.add(this.hand[i].getSuit());
        }
        Card[] sortedHand = new Card[this.hand.length];


        int counter = 0;
        while (counter != this.hand.length){
            ArrayList<Card> miniList = new ArrayList<>();
//            got cards with the same first suit
            for (int i = 0; i <this.hand.length; i++) {
                if (this.hand[i].getSuit().equals(suitHashSet.first())){
                    miniList.add(miniList.size(), this.hand[i]);
                }
            }


            Collections.sort(miniList, Comparator.comparing(Card::getRank));

            for (int i = 0; i < miniList.size(); i++) {
                sortedHand[counter] = miniList.get(i);
                counter++;
            }

            suitHashSet.pollFirst();
        }

        this.hand = sortedHand;

    }



}
