package project.pixle;

import java.util.List;
import java.util.Scanner;

public class Game {
    private boolean run = false;
    private Scanner input = new Scanner(System.in);
    private Deck deck = new Deck();
    private Player player = new Player(deck);
    private Player computer = new Player(deck);


    public void start() {
        printWelcome();
        run = true;
        
        for(int rounds = 1; run; rounds++) {
            System.out.println("Round: " + rounds + "\n");
            computer.drawHand();
            System.out.println("Dealer's Hand: " + computer.reveal());
            player.drawHand();
            System.out.println("Your Hand: " + player.reveal() + player.reveal());
            
            nextMove(input.nextLine());
            checkHand(computer);
            checkHand(player);
            System.exit(0);




        }
    }

    public void nextMove(String move) {
        switch(move) {
            case "h":
            case "hit":
                System.out.println("Hit");
                break;
            case "s":
            case "stand":
                System.out.println("Stand");
                break;
            default:
                System.out.println("Please input valid command");
                nextMove(input.nextLine());
        }
    }


    public void printWelcome() {
        System.out.println("Welcome to Blackjack!" +
            "\n" +
            "Made by pixIe\n");
    }

    public void checkHand(Player player) {
        List<Card> tempHand = player.getHand();
        int tempScoreCounter = 0;
        for (Card card : tempHand) {
            tempScoreCounter += card.getValue();
        }
        if(tempScoreCounter > 21) {
            System.out.println("Bust!");
        } else if (tempScoreCounter == 21) {
            System.out.println("You win!");
        }    
    }

}