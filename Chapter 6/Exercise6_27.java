public class Exercise6_27 {

    public static void main(String[] args) {

        boolean[] prime = new boolean[1000];

        // Step 1: Initialize all elements as true
        for (int i = 2; i < prime.length; i++) {
            prime[i] = true;
        }

        // Step 2: Apply sieve algorithm
        for (int i = 2; i < prime.length; i++) {

            if (prime[i]) {

                for (int j = i * 2; j < prime.length; j += i) {
                    prime[j] = false;
                }

            }
        }

        // Step 3: Display prime numbers
        System.out.println("Prime numbers between 2 and 999:");

        for (int i = 2; i < prime.length; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
 
