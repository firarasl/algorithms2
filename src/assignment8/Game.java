package assignment8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.stream.IntStream;

import static assignment8.Rank.DEUCE;
import static assignment8.Suit.CLUBS;

public class Game {

    private ArrayList<Card> deck = new ArrayList<>();
    private Player players[];

    public Game(Player[] players) {
        if (players.length>1 && players.length<=4){
            this.players = players;
            Card card;
            for (Suit suit : Suit.values() ) {
                for (Rank rank : Rank.values()) {
                    card= new Card(suit, rank);
                    this.deck.add(card);
                }
            }
        }
        else{
            System.out.println("Players number should be between 1 and 4");
        }
    }
    public void reset() {

        for (int i = 0; i < this.players.length; i++) {
            Card[] empty = new Card[0];
            this.players[i].setHand(empty);

        }
        Card card;
        for (Suit suit : Suit.values() ) {
            for (Rank rank : Rank.values()) {
                card= new Card(suit, rank);
                this.deck.add(card);
            }
        }

    }

    public void displayDeck() {

        for (int i = 0; i < this.deck.size(); i++) {
            System.out.println("Rank and suit of the card number: "+(i+1) +" is "+ this.deck.get(i).getRank() +
                    " "+ this.deck.get(i).getSuit());
        }
    }

    public void deal(){
        Random rnd = new Random();

            int[] unique = new int[52];
            for (int i = 0; i < this.players.length; i++) {
                Card[] playersCard = new Card[52/this.players.length];

                for (int j = 0; j < 52/this.players.length; j++) {
                    int rando=rnd.nextInt(52);

                    if(this.players.length==3 && this.deck.get(rando).getRank().equals(DEUCE) && this.deck.get(rando).getSuit().equals(CLUBS) ){
                        j-=1;
                        break;
                    }

                   if(!IntStream.of(unique).anyMatch(x -> x == rando)){
                       Card newCard = this.deck.get(rando);
                       playersCard[j]=newCard;
                       unique[j]=rando;
                   }
                   else {
                       j-=1;
                   }
                }
                this.players[i].setHand(playersCard);

            }
        if(players.length==3){
            this.deck= new ArrayList<>();
            Card card = new Card(CLUBS,DEUCE);
            this.deck.add(card);
        }else{
            this.deck.clear();
        }

    }
}
