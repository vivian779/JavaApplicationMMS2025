import java.util.Scanner;

public class Exercise6_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] salaryCount = new int[9];
        double sales;

        System.out.println("Enter sales (-1 to stop):");
        sales = input.nextDouble();

        while (sales != -1) {

            double salary = 200 + (0.09 * sales);

            int index = ((int) salary / 100) - 2;

            if (index >= 0 && index < 8)
                salaryCount[index]++;
            else
                salaryCount[8]++;

            System.out.println("Enter sales (-1 to stop):");
            sales = input.nextDouble();
        }

        System.out.println("Salary Range\tNumber of Employees");

        for (int i = 0; i < 8; i++) {
            System.out.printf("$%d-%d\t\t%d\n", (200 + i * 100), (299 + i * 100), salaryCount[i]);
        }

        System.out.println("$1000 and over\t" + salaryCount[8]);
    }
}