 public class Exercise5_24 {
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000:");
        for (int num = 2; num <= 1000; num++) {
            if (isPerfect(num)) {
                System.out.print(num + " = ");
                printFactors(num);
                System.out.println();
            }
        }
    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void printFactors(int number) {
        boolean firstFactor = true;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                if (!firstFactor) {
                    System.out.print(" + ");
                }
                System.out.print(i);
                firstFactor = false;
            }
        }
    }
}

