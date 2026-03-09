
public class Exercise5_25 {
    public static void main(String[] args) {
        int limit = 10000;

        int countHalf = 0;
        int countOptimized = 0;
        testCount = 0; // Reset test count for optimized method

        // Count primes using n/2 method
        for (int i = 2; i < limit; i++) {
            if (isPrimeHalf(i)) {
                countHalf++;
            }
        }

        // Count primes using sqrt method and count tests
        for (int i = 2; i < limit; i++) {
            if (isPrimeOptimizedWithCount(i)) {
                countOptimized++;
            }
        }

        System.out.println("Total prime numbers less than " + limit + ":");
        System.out.println("Using n/2 method: " + countHalf);
        System.out.println("Using sqrt method: " + countOptimized);
        System.out.println();
        System.out.println("Number of divisibility tests performed:");
        System.out.println("Using n/2 method: " + (limit - 2));
        System.out.println("Using sqrt method: " + testCount);
    }

    // Method using n/2 as upper limit
    public static boolean isPrimeHalf(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Static variable to count tests
    static int testCount = 0;

    // Method using sqrt(n) as upper limit, counts tests
    public static boolean isPrimeOptimizedWithCount(int number) {
        if (number <= 1) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            testCount++;
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}