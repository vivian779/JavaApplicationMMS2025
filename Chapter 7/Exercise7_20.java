 import java.util.Random;

public class Exercise7_20 {

    // -------- Face Enum --------
    public enum Face {
        ACE, DEUCE, THREE, FOUR, FIVE, SIX,
        SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    // -------- Suit Enum --------
    public enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }

    // -------- Card Class --------
    static class Card {

        private final Face face;
        private final Suit suit;

        public Card(Face face, Suit suit) {
            this.face = face;
            this.suit = suit;
        }

        public Face getFace() {
            return face;
        }

        public Suit getSuit() {
            return suit;
        }

        public String toString() {
            return face + " of " + suit;
        }
    }

    // -------- DeckOfCards Class --------
    static class DeckOfCards {

        private Card[] deck = new Card[52];
        private int currentCard = 0;
        private Random random = new Random();

        private static final Face[] faces = Face.values();
        private static final Suit[] suits = Suit.values();

        public DeckOfCards() {

            for (int count = 0; count < deck.length; count++) {

                deck[count] =
                        new Card(
                                faces[count % 13],
                                suits[count / 13]
                        );
            }
        }

        public void shuffle() {

            currentCard = 0;

            for (int first = 0; first < deck.length; first++) {

                int second = random.nextInt(52);

                Card temp = deck[first];
                deck[first] = deck[second];
                deck[second] = temp;
            }
        }

        public Card dealCard() {

            if (currentCard < deck.length)
                return deck[currentCard++];
            else
                return null;
        }
    }

    // -------- Main Test --------
    public static void main(String[] args) {

        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        for (int i = 1; i <= 52; i++) {

            System.out.printf("%-20s", deck.dealCard());

            if (i % 4 == 0)
                System.out.println();
        }
    }
}

