import java.util.Scanner;

public class Exercise6_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int count = 0;

        while (count < 5) {

            System.out.print("Enter a number (10-100): ");
            int num = input.nextInt();

            boolean duplicate = false;

            for (int i = 0; i < count; i++) {
                if (numbers[i] == num)
                    duplicate = true;
            }

            if (!duplicate) {
                numbers[count] = num;
                count++;
            }

            System.out.print("Unique values: ");

            for (int i = 0; i < count; i++)
                System.out.print(numbers[i] + " ");

            System.out.println();
        }
    }
}