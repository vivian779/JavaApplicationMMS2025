 public class Exercise4_14 {
    public static void main(String[] args) {
        double principal = 1000.0; // example principal
        int years = 10;

        for (int rate = 5; rate <= 10; rate++) {
            double interestRate = rate / 100.0;
            double amount = principal;

            System.out.println("Interest Rate: " + rate + "%");
            for (int i = 1; i <= years; i++) {
                amount = amount + amount * interestRate;
                System.out.printf("Year %d: %.2f%n", i, amount);
            }
            System.out.println();
        }
    }
}
