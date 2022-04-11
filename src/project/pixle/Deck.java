package project.pixle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> cardDeck = new ArrayList<>();
    private Random rand = new Random();
    
    public Deck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cardDeck.add(new Card(suit, rank));
            }
        }
    }

    public boolean shuffle() {
        Collections.shuffle(cardDeck);
        return true;
    }

    public boolean reset() {
        cardDeck.clear();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cardDeck.add(new Card(suit, rank));
            }
        }
        return true;
    }

    public Card draw() {
        if(cardDeck.size() == 0)
            reset();
        Card drawnCard = cardDeck.get(0);
        cardDeck.remove(0);
        return drawnCard;
    }
}
