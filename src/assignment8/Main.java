package assignment8;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player[] arr = {player1, player2};

        Game gameOfBridge = new Game(arr);
        gameOfBridge.deal();
        System.out.println("--------------------------------------------------PRINTING PLAYER 1 AFTER DEAL ------------------------------------");
        System.out.println(Arrays.toString(player1.getHand()));
        System.out.println("--------------------------------------------------PRINTING PLAYER 2 AFTER DEAL ------------------------------------");

        System.out.println(Arrays.toString(player2.getHand()));

        player2.sortHand();
        System.out.println("--------------------------------------------------PRINTING PLAYER 2 AFTER SORT ------------------------------------");

        System.out.println(Arrays.toString(player2.getHand()));

        gameOfBridge.reset();
        System.out.println("--------------------------------------------------PRINTING PLAYER 1 AFTER RESET ------------------------------------");

        System.out.println(Arrays.toString(player1.getHand()));

        System.out.println("--------------------------------------------------PRINTING DECK ------------------------------------");

        gameOfBridge.displayDeck();
    }
}
