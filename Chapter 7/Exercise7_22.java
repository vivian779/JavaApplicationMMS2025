 import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Exercise7_22 {
    
    // HeartRates class definition
    public static class HeartRates {
        private String firstName;
        private String lastName;
        private int birthMonth;
        private int birthDay;
        private int birthYear;

        // Constructor
        public HeartRates(String firstName, String lastName, int birthMonth, int birthDay, int birthYear) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthMonth = birthMonth;
            this.birthDay = birthDay;
            this.birthYear = birthYear;
        }

        // Setters and Getters
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setBirthMonth(int birthMonth) {
            this.birthMonth = birthMonth;
        }

        public int getBirthMonth() {
            return birthMonth;
        }

        public void setBirthDay(int birthDay) {
            this.birthDay = birthDay;
        }

        public int getBirthDay() {
            return birthDay;
        }

        public void setBirthYear(int birthYear) {
            this.birthYear = birthYear;
        }

        public int getBirthYear() {
            return birthYear;
        }

        // Method to calculate age
        public int getAge() {
            LocalDate today = LocalDate.now();
            LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
            return Period.between(birthDate, today).getYears();
        }

        // Method to calculate maximum heart rate
        public int getMaximumHeartRate() {
            return 220 - getAge();
        }

        // Method to calculate target heart rate range
        public String getTargetHeartRateRange() {
            int maxRate = getMaximumHeartRate();
            int lowerBound = (int)(maxRate * 0.50);
            int upperBound = (int)(maxRate * 0.85);
            return lowerBound + " - " + upperBound;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt for user input
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter birth month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter birth day (1-31): ");
        int day = scanner.nextInt();

        System.out.print("Enter birth year: ");
        int year = scanner.nextInt();

        // Create HeartRates object
        HeartRates person = new HeartRates(firstName, lastName, month, day, year);

        // Display information
        System.out.println("\n--- Person's Information ---");
        System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Date of Birth: " + person.getBirthMonth() + "/" + person.getBirthDay() + "/" + person.getBirthYear());
        System.out.println("Age: " + person.getAge() + " years");
        System.out.println("Maximum Heart Rate: " + person.getMaximumHeartRate() + " bpm");
        System.out.println("Target Heart Rate Range: " + person.getTargetHeartRateRange() + " bpm");

        scanner.close();
    }
}
 