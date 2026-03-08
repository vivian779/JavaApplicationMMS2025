 import java.util.Random;

public class Exercise5_13 {
    public static void main(String[] args) {
        Random rand = new Random();

        // a) 2, 4, 6, 8, 10
        int[] setA = {2, 4, 6, 8, 10};
        int randomA = setA[rand.nextInt(setA.length)];
        System.out.println("Random from set A: " + randomA);

        // b) 3, 5, 7, 9, 11
        int[] setB = {3, 5, 7, 9, 11};
        int randomB = setB[rand.nextInt(setB.length)];
        System.out.println("Random from set B: " + randomB);

        // c) 6, 10, 14, 18, 22
        int[] setC = {6, 10, 14, 18, 22};
        int randomC = setC[rand.nextInt(setC.length)];
        System.out.println("Random from set C: " + randomC);
    }
}
 