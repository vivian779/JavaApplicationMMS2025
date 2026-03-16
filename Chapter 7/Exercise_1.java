 import java.util.Random;

public class Exercise_1 {

    // Card class
    static class Card {
        private String face;
        private String suit;

        public Card(String face, String suit) {
            this.face = face;
            this.suit = suit;
        }

        public String getFace() {
            return face;
        }

        public String getSuit() {
            return suit;
        }

        public String toString() {
            return face + " of " + suit;
        }
    }

    // DeckOfCards class
    static class DeckOfCards {
        private Card[] deck = new Card[52];
        private int currentCard = 0;
        private Random randomNumbers = new Random();

        private static final String[] faces = {
                "Ace","Deuce","Three","Four","Five","Six","Seven",
                "Eight","Nine","Ten","Jack","Queen","King"
        };

        private static final String[] suits = {
                "Hearts","Diamonds","Clubs","Spades"
        };

        public DeckOfCards() {
            for (int count = 0; count < deck.length; count++) {
                deck[count] = new Card(
                        faces[count % 13],
                        suits[count / 13]
                );
            }
        }

        public void shuffle() {
            currentCard = 0;

            for (int first = 0; first < deck.length; first++) {
                int second = randomNumbers.nextInt(52);

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

    // Poker checking methods
    public static boolean isPair(Card[] hand) {
        int pairs = 0;

        for (int i = 0; i < hand.length; i++)
            for (int j = i + 1; j < hand.length; j++)
                if (hand[i].getFace().equals(hand[j].getFace()))
                    pairs++;

        return pairs == 1;
    }

    public static boolean isTwoPairs(Card[] hand) {
        int pairs = 0;

        for (int i = 0; i < hand.length; i++)
            for (int j = i + 1; j < hand.length; j++)
                if (hand[i].getFace().equals(hand[j].getFace()))
                    pairs++;

        return pairs == 2;
    }

    public static boolean isThreeOfKind(Card[] hand) {
        for (int i = 0; i < hand.length; i++) {
            int count = 1;

            for (int j = 0; j < hand.length; j++)
                if (i != j && hand[i].getFace().equals(hand[j].getFace()))
                    count++;

            if (count == 3)
                return true;
        }
        return false;
    }

    public static boolean isFourOfKind(Card[] hand) {
        for (int i = 0; i < hand.length; i++) {
            int count = 1;

            for (int j = 0; j < hand.length; j++)
                if (i != j && hand[i].getFace().equals(hand[j].getFace()))
                    count++;

            if (count == 4)
                return true;
        }
        return false;
    }

    public static boolean isFlush(Card[] hand) {
        String suit = hand[0].getSuit();

        for (int i = 1; i < hand.length; i++)
            if (!hand[i].getSuit().equals(suit))
                return false;

        return true;
    }

    public static boolean isFullHouse(Card[] hand) {
        boolean three = false;
        boolean pair = false;

        for (int i = 0; i < hand.length; i++) {
            int count = 1;

            for (int j = 0; j < hand.length; j++)
                if (i != j && hand[i].getFace().equals(hand[j].getFace()))
                    count++;

            if (count == 3)
                three = true;

            if (count == 2)
                pair = true;
        }

        return three && pair;
    }

    // Main method
    public static void main(String[] args) {

        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        Card[] hand = new Card[5];

        System.out.println("Your Poker Hand:\n");

        for (int i = 0; i < 5; i++) {
            hand[i] = deck.dealCard();
            System.out.println(hand[i]);
        }

        System.out.println();

        if (isPair(hand))
            System.out.println("Pair");

        if (isTwoPairs(hand))
            System.out.println("Two Pairs");

        if (isThreeOfKind(hand))
            System.out.println("Three of a Kind");

        if (isFourOfKind(hand))
            System.out.println("Four of a Kind");

        if (isFlush(hand))
            System.out.println("Flush");

        if (isFullHouse(hand))
            System.out.println("Full House");
    }
}
 
