 import java.util.Random;
import java.util.Scanner;

public class Exercise_4 {

    // -------- Card Class --------
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

    // -------- Deck Class --------
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

            for(int i=0;i<deck.length;i++)
                deck[i] = new Card(faces[i%13],suits[i/13]);
        }

        public void shuffle(){

            currentCard = 0;

            for(int i=0;i<deck.length;i++){

                int j = random.nextInt(52);

                Card temp = deck[i];
                deck[i] = deck[j];
                deck[j] = temp;
            }
        }

        public Card dealCard(){

            if(currentCard < deck.length)
                return deck[currentCard++];
            else
                return null;
        }
    }

    // -------- Poker Evaluation --------

    static boolean isPair(Card[] hand){

        int pairs=0;

        for(int i=0;i<hand.length;i++)
            for(int j=i+1;j<hand.length;j++)
                if(hand[i].getFace().equals(hand[j].getFace()))
                    pairs++;

        return pairs==1;
    }

    static boolean isTwoPairs(Card[] hand){

        int pairs=0;

        for(int i=0;i<hand.length;i++)
            for(int j=i+1;j<hand.length;j++)
                if(hand[i].getFace().equals(hand[j].getFace()))
                    pairs++;

        return pairs==2;
    }

    static boolean isThreeOfKind(Card[] hand){

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

    static boolean isFlush(Card[] hand){

        String suit = hand[0].getSuit();

        for(int i=1;i<hand.length;i++)
            if(!hand[i].getSuit().equals(suit))
                return false;

        return true;
    }

    static int evaluateHand(Card[] hand){

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

            case 4: return "Flush";
            case 3: return "Three of a Kind";
            case 2: return "Two Pairs";
            case 1: return "Pair";
            default: return "High Card";
        }
    }

    // -------- Dealer Logic --------

    static void dealerDraw(Card[] hand, DeckOfCards deck){

        int rank = evaluateHand(hand);

        int replace = 0;

        if(rank==0)
            replace = 3;

        else if(rank==1)
            replace = 2;

        else if(rank==2)
            replace = 1;

        for(int i=0;i<replace;i++)
            hand[i] = deck.dealCard();
    }

    // -------- Player Replace Cards --------

    static void playerDraw(Card[] hand, DeckOfCards deck){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter positions of cards to replace (1-5). Enter 0 to stop.");

        while(true){

            int pos = input.nextInt();

            if(pos==0)
                break;

            if(pos>=1 && pos<=5)
                hand[pos-1] = deck.dealCard();
        }
    }

    // -------- Main Program --------

    public static void main(String[] args) {

        int playerWins=0;
        int dealerWins=0;

        for(int game=1; game<=20; game++){

            System.out.println("\nGAME "+game);

            DeckOfCards deck = new DeckOfCards();
            deck.shuffle();

            Card[] player = new Card[5];
            Card[] dealer = new Card[5];

            System.out.println("\nYour Hand:");

            for(int i=0;i<5;i++){
                player[i]=deck.dealCard();
                System.out.println((i+1)+": "+player[i]);
            }

            for(int i=0;i<5;i++)
                dealer[i]=deck.dealCard();

            playerDraw(player,deck);
            dealerDraw(dealer,deck);

            int playerRank = evaluateHand(player);
            int dealerRank = evaluateHand(dealer);

            System.out.println("\nDealer Hand:");
            for(Card c:dealer)
                System.out.println(c);

            System.out.println("\nYou: "+handName(playerRank));
            System.out.println("Dealer: "+handName(dealerRank));

            if(playerRank>dealerRank){
                playerWins++;
                System.out.println("You win!");
            }

            else if(dealerRank>playerRank){
                dealerWins++;
                System.out.println("Dealer wins!");
            }

            else
                System.out.println("Tie!");
        }

        System.out.println("\nFinal Results after 20 Games");
        System.out.println("Player Wins: "+playerWins);
        System.out.println("Dealer Wins: "+dealerWins);
    }
}
 
