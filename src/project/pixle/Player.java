package project.pixle;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand = new ArrayList<>();
    private Deck deck;
    private int cardsRevealed = 0;

    public Player(Deck deck) {
        this.deck = deck;
    }

    public boolean draw() {
        hand.add(deck.draw());
        return true;
    }


    public boolean drawHand() {
        hand.add(deck.draw());
        hand.add(deck.draw());
        return true;
    }

    public String reveal() {
        String reveal = hand.get(cardsRevealed).toString();
        cardsRevealed++;
        return reveal;
    }
    
    public List getHand() {
        return hand;
    }

    public void clear() {
        hand.clear();
        cardsRevealed = 0;
    }

    @Override
    public String toString() {
        return hand.toString();
    }
}
