package project.pixle;

public enum Suit {CLUBS("♣"), 
    DIAMONDS("♦"),
    HEARTS("♥"), 
    SPADES("♠");

    public final String symbol;

    private Suit(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}