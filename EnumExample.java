public class EnumExample {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        
        Day today = Day.MONDAY;

        System.out.println("Today is: " + today);
    }
}