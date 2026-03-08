public class Exercise4_13 {
    public static void main(String[] args) {
        System.out.printf("%-10s%s%n", "Number", "Factorial");
        long factorial = 1;
        for (int i = 1; i <= 20; i++) {
            factorial *= i;
            System.out.printf("%-10d%,d%n", i, factorial);
        }
    }
}
