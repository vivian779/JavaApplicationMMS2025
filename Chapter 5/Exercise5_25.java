public class Exercise5_25 
 public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total primes less than 10,000: " + count);
        System.out.println("Numbers tested: " + (9999 - 2 + 1)); // 9998
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
 
