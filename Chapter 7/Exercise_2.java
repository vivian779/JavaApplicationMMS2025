import java.util.Random;

public class Exercise_2 {

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

    static class DeckOfCards {
        private Card[] deck = new Card[52];
        private int currentCard = 0;
        private Random random = new Random();

        private static final String[] faces = {
                "Ace","Deuce","Three","Four","Five","Six","Seven",
                "Eight","Nine","Ten","Jack","Queen","King"
        };

        private static final String[] suits = {
                "Hearts","Diamonds","Clubs","Spades"
        };

        public DeckOfCards() {
            for (int i = 0; i < deck.length; i++) {
                deck[i] = new Card(faces[i % 13], suits[i / 13]);
            }
        }

        public void shuffle() {
            currentCard = 0;

            for (int i = 0; i < deck.length; i++) {
                int j = random.nextInt(52);

                Card temp = deck[i];
                deck[i] = deck[j];
                deck[j] = temp;
            }
        }

        public Card dealCard() {
            if (currentCard < deck.length)
                return deck[currentCard++];
            else
                return null;
        }
    }

    // ---------- Poker evaluation methods ----------

    static boolean isPair(Card[] hand) {
        int pairs = 0;

        for(int i=0;i<hand.length;i++)
            for(int j=i+1;j<hand.length;j++)
                if(hand[i].getFace().equals(hand[j].getFace()))
                    pairs++;

        return pairs==1;
    }

    static boolean isTwoPairs(Card[] hand) {
        int pairs = 0;

        for(int i=0;i<hand.length;i++)
            for(int j=i+1;j<hand.length;j++)
                if(hand[i].getFace().equals(hand[j].getFace()))
                    pairs++;

        return pairs==2;
    }

    static boolean isThreeOfKind(Card[] hand) {
        for(int i=0;i<hand.length;i++){
            int count=1;

            for(int j=0;j<hand.length;j++)
                if(i!=j && hand[i].getFace().equals(hand[j].getFace()))
                    count++;

            if(count==3)
                return true;
        }

        return false;
    }

    static boolean isFourOfKind(Card[] hand) {
        for(int i=0;i<hand.length;i++){
            int count=1;

            for(int j=0;j<hand.length;j++)
                if(i!=j && hand[i].getFace().equals(hand[j].getFace()))
                    count++;

            if(count==4)
                return true;
        }

        return false;
    }

    static boolean isFlush(Card[] hand) {
        String suit = hand[0].getSuit();

        for(int i=1;i<hand.length;i++)
            if(!hand[i].getSuit().equals(suit))
                return false;

        return true;
    }

    static boolean isFullHouse(Card[] hand) {

        boolean three=false;
        boolean pair=false;

        for(int i=0;i<hand.length;i++){

            int count=1;

            for(int j=0;j<hand.length;j++)
                if(i!=j && hand[i].getFace().equals(hand[j].getFace()))
                    count++;

            if(count==3)
                three=true;

            if(count==2)
                pair=true;
        }

        return three && pair;
    }

    // ranking system
    static int evaluateHand(Card[] hand){

        if(isFourOfKind(hand))
            return 6;

        if(isFullHouse(hand))
            return 5;

        if(isFlush(hand))
            return 4;

        if(isThreeOfKind(hand))
            return 3;

        if(isTwoPairs(hand))
            return 2;

        if(isPair(hand))
            return 1;

        return 0;
    }

    static String handName(int rank){

        switch(rank){
            case 6: return "Four of a Kind";
            case 5: return "Full House";
            case 4: return "Flush";
            case 3: return "Three of a Kind";
            case 2: return "Two Pairs";
            case 1: return "Pair";
            default: return "High Card";
        }
    }

    // ---------- Main program ----------

    public static void main(String[] args) {

        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        Card[] hand1 = new Card[5];
        Card[] hand2 = new Card[5];

        System.out.println("Player 1 Hand:");

        for(int i=0;i<5;i++){
            hand1[i] = deck.dealCard();
            System.out.println(hand1[i]);
        }

        System.out.println();

        System.out.println("Player 2 Hand:");

        for(int i=0;i<5;i++){
            hand2[i] = deck.dealCard();
            System.out.println(hand2[i]);
        }

        int rank1 = evaluateHand(hand1);
        int rank2 = evaluateHand(hand2);

        System.out.println("\nPlayer 1 has: "+handName(rank1));
        System.out.println("Player 2 has: "+handName(rank2));

        if(rank1 > rank2)
            System.out.println("\nPlayer 1 wins!");

        else if(rank2 > rank1)
            System.out.println("\nPlayer 2 wins!");

        else
            System.out.println("\nTie!");
    }
}

