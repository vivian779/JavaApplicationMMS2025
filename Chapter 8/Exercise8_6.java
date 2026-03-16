class SavingsAccount {

    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double balance) {
        savingsBalance = balance;
    }

    public void calculateMonthlyInterest() {

        double monthlyInterest = savingsBalance * annualInterestRate / 12;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public double getBalance() {
        return savingsBalance;
    }
}

public class Exercise8_6 {

    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.04);

        for(int i=1;i<=12;i++) {

            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

            System.out.println("Month "+i);
            System.out.println("Saver1: "+saver1.getBalance());
            System.out.println("Saver2: "+saver2.getBalance());
        }

        SavingsAccount.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("After rate change");
        System.out.println("Saver1: "+saver1.getBalance());
        System.out.println("Saver2: "+saver2.getBalance());
    }
}