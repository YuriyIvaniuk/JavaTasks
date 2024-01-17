import java.util.ArrayList;

public class Deck {
    public enum Suit {
        SPADES, CLUBS, HEARTS, DIAMONDS
    }

    public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    public static final int NumOfSuits = Suit.values().length;
    public static final int NumOfRanks = Rank.values().length;
    public static final int NumOfAllCards = NumOfSuits * NumOfRanks;

    ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>(NumOfAllCards);
    }

    public void in() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public void out() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public static class Card {
        private Rank rank;
        private Suit suit;

        public Card(Rank rank, Suit suit) {
            this.rank = rank;
            this.suit = suit;
        }

        public Rank getRank() {
            return rank;
        }

        public Suit getSuit() {
            return suit;
        }

        @Override
        public String toString() {
            return rank + " of " + suit;
        }
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.in();
        deck.out();
    }
}
