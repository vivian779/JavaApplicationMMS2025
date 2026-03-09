import java.util.Scanner;

public class Exercise6_18 {

    public static void main(String[] args) {

        boolean[] seats = new boolean[10];
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Type 1 for First Class");
            System.out.println("Type 2 for Economy");

            int choice = input.nextInt();

            if (choice == 1)
                assignSeat(seats, 0, 4, "First Class");
            else if (choice == 2)
                assignSeat(seats, 5, 9, "Economy");
        }
    }

    public static void assignSeat(boolean[] seats, int start, int end, String section) {

        for (int i = start; i <= end; i++) {

            if (!seats[i]) {

                seats[i] = true;

                System.out.println("\nBoarding Pass");
                System.out.println("Seat Number: " + (i + 1));
                System.out.println("Section: " + section);
                return;
            }
        }

        System.out.println(section + " is full.");
        System.out.println("Next flight leaves in 3 hours.");
    }
}