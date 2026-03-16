// CombinedDeckFisherYates.java
import java.util.Random;

public class Exercise7_21 {

    // Enum for card faces
    public enum Face {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    // Enum for card suits
    public enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }

    // Card class
    public static class Card {
        private final Face face;
        private final Suit suit;

        public Card(Face face, Suit suit) {
            this.face = face;
            this.suit = suit;
        }

        @Override
        public String toString() {
            return face + " of " + suit;
        }
    }

    // DeckOfCards class with Fisher–Yates shuffle
    public static class DeckOfCards {
        private final Card[] deck;
        private int currentCard;
        private static final int NUMBER_OF_CARDS = 52;
        private final Random random = new Random();

        // Initialize the deck
        public DeckOfCards() {
            deck = new Card[NUMBER_OF_CARDS];
            currentCard = 0;
            int index = 0;
            for (Suit suit : Suit.values()) {
                for (Face face : Face.values()) {
                    deck[index++] = new Card(face, suit);
                }
            }
        }

        // Fisher–Yates shuffle
        public void shuffle() {
            for (int i = deck.length - 1; i > 0; i--) {
                int j = random.nextInt(i + 1); // random index from 0 to i
                Card temp = deck[i];
                deck[i] = deck[j];
                deck[j] = temp;
            }
            currentCard = 0; // reset dealing index after shuffle
        }

        // Deal one card
        public Card dealCard() {
            if (currentCard < deck.length) {
                return deck[currentCard++];
            } else {
                return null; // no more cards
            }
        }
    }

    // Main method to test the deck
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        System.out.println("Shuffling deck...\n");
        deck.shuffle();

        // Deal all 52 cards
        for (int i = 0; i < 52; i++) {
            System.out.println(deck.dealCard());
        }
    }
}